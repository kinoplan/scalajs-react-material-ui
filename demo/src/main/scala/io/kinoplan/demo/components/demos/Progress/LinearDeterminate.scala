package io.kinoplan.demo.components.demos.Progress

import scala.scalajs.js
import scala.scalajs.js.Math

import japgolly.scalajs.react.{BackendScope, Callback, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.MuiLinearProgress

object LinearDeterminate extends ScalaCssReactImplicits {
  case class Props(style: CommonStyle)

  case class State(completed: Int = 0) {
    def setProgress = {
      if (completed == 100) {
        copy(completed = 0)
      } else {
        val diff = Math.random() * 10

        copy(completed = Math.min(completed + diff, 100).toInt)
      }
    }
  }

  class Backend(t: BackendScope[Props, State]) {
    var interval: js.UndefOr[js.timers.SetIntervalHandle] = js.undefined

    def unmount = Callback {
      interval.foreach(js.timers.clearInterval)
      interval = js.undefined
    }

    def mount = Callback {
      interval = js.timers.setInterval(500)(progress.runNow())
    }

    def progress = t.modState(_.setProgress)

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Linear Determinate")(
          div(css.flexGrowOne,
            MuiLinearProgress(
              variant = MuiLinearProgress.Variant.determinate,
              value = state.completed
            ),
            br,
            MuiLinearProgress(
              variant = MuiLinearProgress.Variant.determinate,
              color = MuiLinearProgress.Color.secondary,
              value = state.completed
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("LinearDeterminate")
    .initialState(State())
    .renderBackend[Backend]
    .componentDidMount(_.backend.mount)
    .componentWillUnmount(_.backend.unmount)
    .build

  def apply(style: CommonStyle = DefaultCommonStyle) = component(Props(style))
}
