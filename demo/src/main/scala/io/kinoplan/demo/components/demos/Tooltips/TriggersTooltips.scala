package io.kinoplan.demo.components.demos.Tooltips

import scala.scalajs.js

import japgolly.scalajs.react.{BackendScope, Callback, ReactEventFromHtml, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiClickAwayListener, MuiGrid, MuiTooltip}

object TriggersTooltips extends ScalaCssReactImplicits {
  case class State(open: Boolean = false) {
    def handleTooltipClose = copy(open = false)

    def handleTooltipOpen = copy(open = true)
  }

  class Backend(t: BackendScope[Unit, State]) {
    def handleTooltipClose: ReactEventFromHtml => Callback = _ => t.modState(_.handleTooltipClose)

    def handleTooltipOpen = t.modState(_.handleTooltipOpen)

    def render(state: State): VdomElement = {
      div(
        ComponentContainer("Triggers")(
          div(
            MuiGrid(container = true, justify = MuiGrid.Justify.center)(
              MuiGrid(item = true)(
                MuiTooltip(disableFocusListener = true, title = "Add")(
                  MuiButton()("Hover or touch")
                )
              ),
              MuiGrid(item = true)(
                MuiTooltip(disableHoverListener = true, title = "Add")(
                  MuiButton()("Focus or touch")
                )
              ),
              MuiGrid(item = true)(
                MuiTooltip(disableFocusListener = true, disableTouchListener = true, title = "Add")(
                  MuiButton()("Hover")
                )
              ),
              MuiGrid(item = true)(
                MuiClickAwayListener(onClickAway = handleTooltipClose)(
                  div(
                    MuiTooltip(
                      PopperProps = js.Dynamic.literal(disablePortal = true),
                      onClose = handleTooltipClose,
                      open = state.open,
                      disableFocusListener = true,
                      disableHoverListener = true,
                      disableTouchListener = true,
                      title = "Add"
                    )(
                      MuiButton()(onClick --> handleTooltipOpen, "Click")
                    )
                  )
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Unit]("TriggersTooltips")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply() = component()
}
