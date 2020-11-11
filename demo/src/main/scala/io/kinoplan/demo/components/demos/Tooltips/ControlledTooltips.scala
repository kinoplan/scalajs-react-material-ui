package io.kinoplan.demo.components.demos.Tooltips

import japgolly.scalajs.react.{BackendScope, Callback, ReactEventFromHtml, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiTooltip}

object ControlledTooltips extends ScalaCssReactImplicits {
  case class State(open: Boolean = false) {
    def handleTooltipClose = copy(open = false)

    def handleTooltipOpen = copy(open = true)
  }

  class Backend(t: BackendScope[Unit, State]) {
    def handleTooltipClose: ReactEventFromHtml => Callback = _ => t.modState(_.handleTooltipClose)

    def handleTooltipOpen: ReactEventFromHtml => Callback = _ => t.modState(_.handleTooltipOpen)

    def render(state: State): VdomElement = {
      div(
        ComponentContainer("Controlled Tooltips")(
          MuiTooltip(
            onClose = handleTooltipClose,
            onOpen = handleTooltipOpen,
            open = state.open,
            title = "Add"
          )(
            MuiButton()("Controlled")
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Unit]("ControlledTooltips")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply() = component()
}
