package io.kinoplan.demo.components.demos.Dialogs

import japgolly.scalajs.react.{BackendScope, Callback, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.models.Dialogs.Emails
import io.kinoplan.demo.styles.demos.Chips.{ChipsArrayStyle, DefaultChipsArrayStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiTypography}

object SimpleDialog {
  case class State(open: Boolean = false, selectedValue: String = Emails.default(1)) {
    def handleClickOpen = copy(open = true)

    def handleClose(value: String) = copy(selectedValue = value, open = false)
  }

  class Backend(t: BackendScope[Unit, State]) {
    def handleClickOpen = {
      t.modState(_.handleClickOpen)
    }

    def handleClose: String => Callback = value => {
      t.modState(_.handleClose(value))
    }

    def render(state: State): VdomElement = {
      div(
        ComponentContainer("Simple Dialogs")(
          div(
            MuiTypography(variant = MuiTypography.Variant.subtitle1)(
              s"Selected: ${state.selectedValue}"
            ),
            br,
            MuiButton(variant = MuiButton.Variant.outlined, color = MuiButton.Color.primary)(
              onClick --> handleClickOpen,
              "Open simple dialog"
            ),
            SimpleDialogWrapped(
              open = state.open,
              onClose = handleClose,
              selectedValue = state.selectedValue
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Unit]("SimpleDialog")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: ChipsArrayStyle = DefaultChipsArrayStyle) = component()
}
