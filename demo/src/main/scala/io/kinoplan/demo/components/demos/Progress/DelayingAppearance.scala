package io.kinoplan.demo.components.demos.Progress

import scala.scalajs.js

import japgolly.scalajs.react.{BackendScope, Callback, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Progress.{DefaultDelayingAppearanceStyle, DelayingAppearanceStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiCircularProgress, MuiFade, MuiTypography}

object DelayingAppearance extends ScalaCssReactImplicits {
  case class Props(style: DelayingAppearanceStyle)

  case class State(loading: Boolean = false, query: String = "idle") {
    private val transitionDelay = if (loading) "800ms" else "0ms"

    val transitionDelayStyle = js.Dictionary("transitionDelay" -> transitionDelay)

    val isIdle = query == "idle"

    val nonIdle = !isIdle

    val isSuccess = query == "success"

    val isProgress = query == "progress"

    val loadingTitle = if (loading) "Stop loading" else "Loading"

    val simulateALoadTitle = if (nonIdle) "Reset" else "Simulate a load"

    def handleClickLoading = copy(loading = !loading)

    def setIdle = copy(query = "idle")

    def setProgress = copy(query = "progress")

    def setSuccess = copy(query = "success")
  }

  class Backend(t: BackendScope[Props, State]) {
    var timer: js.UndefOr[js.timers.SetTimeoutHandle] = js.undefined

    def unmount = Callback {
      timer.foreach(js.timers.clearTimeout)
      timer = js.undefined
    }

    def setIdle = t.modState(_.setIdle)

    def setProgress = t.modState(_.setProgress)

    def setSuccess = Callback {
      timer = js.timers.setTimeout(2000)(t.modState(_.setSuccess).runNow())
    }

    def handleClickQuery(state: State) = {
      unmount >> setIdle.when(state.nonIdle) >> (setProgress >> setSuccess).when(state.isIdle) >> Callback.empty
    }

    def handleClickLoading = t.modState(_.handleClickLoading)

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Delaying appearance")(
          div(css.root,
            div(css.placeholder,
              MuiFade(in = state.loading, unmountOnExit = true)(
                style := state.transitionDelayStyle,
                MuiCircularProgress()
              ),
            ),
            MuiButton()(css.button,
              onClick --> handleClickLoading,
              state.loadingTitle
            ),
            div(css.placeholder,
              if (state.isSuccess) {
                MuiTypography()("Success!")
              } else {
                MuiFade(in = state.isProgress, unmountOnExit = true)(
                  style := state.transitionDelayStyle,
                  MuiCircularProgress()
                )
              }
            ),
            MuiButton()(css.button,
              onClick --> handleClickQuery(state),
              state.simulateALoadTitle
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("DelayingAppearance")
    .initialState(State())
    .renderBackend[Backend]
    .componentWillUnmount(_.backend.unmount)
    .build

  def apply(style: DelayingAppearanceStyle = DefaultDelayingAppearanceStyle) = component(Props(style))
}
