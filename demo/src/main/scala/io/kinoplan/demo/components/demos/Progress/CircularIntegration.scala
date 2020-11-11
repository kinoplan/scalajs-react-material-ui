package io.kinoplan.demo.components.demos.Progress

import scala.scalajs.js

import japgolly.scalajs.react.{BackendScope, Callback, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Progress.{CircularIntegrationStyle, DefaultCircularIntegrationStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiCircularProgress, MuiFab}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object CircularIntegration extends ScalaCssReactImplicits {
  case class Props(style: CircularIntegrationStyle)

  case class State(loading: Boolean = false, success: Boolean = false) {
    def setLoading = copy(success = false, loading = true)

    def setSuccess = copy(success = true, loading = false)
  }

  class Backend(t: BackendScope[Props, State]) {
    var timer: js.UndefOr[js.timers.SetTimeoutHandle] = js.undefined

    def unmount = Callback {
      timer.foreach(js.timers.clearTimeout)
      timer = js.undefined
    }

    def setSuccess = Callback {
      timer = js.timers.setTimeout(2000)(t.modState(_.setSuccess).runNow())
    }

    def handleButtonClick(loading: Boolean) = {
      (t.modState(_.setLoading) >> setSuccess).when(!loading) >> Callback.empty
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val buttonCss = if (state.success) css.buttonSuccess else css.common.emptyStyle

      div(
        ComponentContainer("Interactive Integration")(
          div(css.root,
            div(css.wrapper,
              MuiFab(color = MuiFab.Color.primary)(buttonCss,
                onClick --> handleButtonClick(state.loading),
                if (state.success) MuiIcons(MuiIconsModule.Check)() else MuiIcons(MuiIconsModule.Save)()
              ),
              MuiCircularProgress(size = 68)(css.fabProgress).when(state.loading)
            ),
            div(css.wrapper,
              MuiButton(
                variant = MuiButton.Variant.contained,
                color = MuiButton.Color.primary
              )(buttonCss,
                onClick --> handleButtonClick(state.loading),
                disabled := state.loading,
                "Accept terms"
              ),
              MuiCircularProgress(size = 24)(css.buttonProgress).when(state.loading)
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("CircularIntegration")
    .initialState(State())
    .renderBackend[Backend]
    .componentWillUnmount(_.backend.unmount)
    .build

  def apply(style: CircularIntegrationStyle = DefaultCircularIntegrationStyle) = component(Props(style))
}
