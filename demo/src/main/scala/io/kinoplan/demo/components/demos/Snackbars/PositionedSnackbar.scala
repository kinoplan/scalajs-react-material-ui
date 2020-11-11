package io.kinoplan.demo.components.demos.Snackbars

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.utils.props.MuiContentProps
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiSnackbar}
import io.kinoplan.scalajs.react.material.ui.core.internal.Origin

object PositionedSnackbar {
  case class State(
    open: Boolean = false,
    vertical: String = "top",
    horizontal: String = "center"
  ) {
    def handleClick(vertical: String, horizontal: String) = copy(
      open = true,
      vertical = vertical,
      horizontal = horizontal
    )

    def handleClose = copy(open = false)
  }

  class Backend(t: BackendScope[Unit, State]) {
    def handleClick(vertical: String, horizontal: String) = t.modState(_.handleClick(vertical, horizontal))

    def handleClose: (ReactEvent, String) => Callback = (_, _) => {
      t.modState(_.handleClose)
    }

    def render(state: State): VdomElement = {
      div(
        ComponentContainer("Positioned")(
          div(
            MuiButton()(onClick --> handleClick("top", "center"), "Top-Center"),
            MuiButton()(onClick --> handleClick("top", "right"), "Top-Right"),
            MuiButton()(onClick --> handleClick("bottom", "right"), "Bottom-Right"),
            MuiButton()(onClick --> handleClick("bottom", "center"), "Bottom-Center"),
            MuiButton()(onClick --> handleClick("bottom", "left"), "Bottom-Left"),
            MuiButton()(onClick --> handleClick("top", "left"), "Top-Left"),
            MuiSnackbar(
              open = state.open,
              onClose = handleClose,
              anchorOrigin = Origin(vertical = state.vertical, horizontal = state.horizontal),
              ContentProps = MuiContentProps(ariaDescribedby = "message-id"),
              message = span(id := "message-id", "I love snacks")
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Unit]("PositionedSnackbar")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply() = component()
}
