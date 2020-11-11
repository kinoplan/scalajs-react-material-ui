package io.kinoplan.demo.components.demos.Progress

import scala.scalajs.js

import japgolly.scalajs.react.{BackendScope, Callback, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Progress.{CircularProgressStyle, DefaultCircularProgressStyle}
import io.kinoplan.scalajs.react.material.ui.core.MuiCircularProgress

object CircularStatic extends ScalaCssReactImplicits {
  case class Props(style: CircularProgressStyle)

  case class State(completed: Int = 0) {
    def setProgress = copy(completed = if (completed >= 100) 0 else completed + 10)
  }

  class Backend(t: BackendScope[Props, State]) {
    var interval: js.UndefOr[js.timers.SetIntervalHandle] = js.undefined

    def unmount = Callback {
      interval.foreach(js.timers.clearInterval)
      interval = js.undefined
    }

    def mount = Callback {
      interval = js.timers.setInterval(1000)(progress.runNow())
    }

    def progress = t.modState(_.setProgress)

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Circular Determinate")(
          div(
            MuiCircularProgress(variant = MuiCircularProgress.Variant.static, value = 5)(css.progress),
            MuiCircularProgress(variant = MuiCircularProgress.Variant.static, value = 25)(css.progress),
            MuiCircularProgress(variant = MuiCircularProgress.Variant.static, value = 50)(css.progress),
            MuiCircularProgress(variant = MuiCircularProgress.Variant.static, value = 75)(css.progress),
            MuiCircularProgress(variant = MuiCircularProgress.Variant.static, value = 100)(css.progress),
            MuiCircularProgress(variant = MuiCircularProgress.Variant.static, value = state.completed)(css.progress)
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("CircularStatic")
    .initialState(State())
    .renderBackend[Backend]
    .componentDidMount(_.backend.mount)
    .componentWillUnmount(_.backend.unmount)
    .build

  def apply(style: CircularProgressStyle = DefaultCircularProgressStyle) = component(Props(style))
}
