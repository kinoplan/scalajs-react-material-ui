package io.kinoplan.demo.components.demos.Progress

import scala.scalajs.js
import scala.scalajs.js.Math

import japgolly.scalajs.react.{BackendScope, Callback, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.MuiLinearProgress

object LinearBuffer extends ScalaCssReactImplicits {
  case class Props(style: CommonStyle)

  case class State(completed: Int = 0, buffer: Int = 10) {
    def setProgress = {
      if (completed > 100) {
        copy(completed = 0, buffer = 10)
      } else {
        val diff = (Math.random() * 10).toInt
        val diff2 = (Math.random() * 10).toInt

        copy(completed = completed + diff, buffer = completed + diff + diff2)
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
        ComponentContainer("Linear Buffer")(
          div(css.flexGrowOne,
            MuiLinearProgress(
              variant = MuiLinearProgress.Variant.buffer,
              value = state.completed,
              valueBuffer = state.buffer
            ),
            br,
            MuiLinearProgress(
              variant = MuiLinearProgress.Variant.buffer,
              color = MuiLinearProgress.Color.secondary,
              value = state.completed,
              valueBuffer = state.buffer
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("LinearBuffer")
    .initialState(State())
    .renderBackend[Backend]
    .componentDidMount(_.backend.mount)
    .componentWillUnmount(_.backend.unmount)
    .build

  def apply(style: CommonStyle = DefaultCommonStyle) = component(Props(style))
}
