package io.kinoplan.demo.components.demos.Dialogs

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.utils.Helpers.StringExtended
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiDialog, MuiDialogActions, MuiDialogContent, MuiDialogContentText, MuiDialogTitle, MuiTextField}

object FormDialog {
  case class State(open: Boolean = false) {
    def handleClickOpen = copy(open = true)

    def handleClickClose = copy(open = false)
  }

  class Backend(t: BackendScope[Unit, State]) {
    def handleClickOpen = t.modState(_.handleClickOpen)

    def handleClickClose: Callback = t.modState(_.handleClickClose)

    def onClose: (ReactEvent, String) => Callback = (_, _) => {
      handleClickClose
    }

    def render(state: State): VdomElement = {
      div(
        ComponentContainer("Form dialogs")(
          div(
            MuiButton(variant = MuiButton.Variant.outlined, color = MuiButton.Color.primary)(
              onClick --> handleClickOpen,
              "Open form dialog"
            ),
            MuiDialog(open = state.open, onClose = onClose)(
              aria.labelledBy := "form-dialog-title",
              MuiDialogTitle()(id := "form-dialog-title", "Subscribe"),
              MuiDialogContent()(
                MuiDialogContentText()(
                  "To subscribe to this website, please enter your email address here. We will send " +
                  "updates occasionally."
                ),
                MuiTextField(
                  margin = MuiTextField.Margin.dense,
                  label = "Email Address".toVdom,
                  fullWidth = true
                )(
                  id := "name",
                  `type` := "email",
                  autoFocus := true
                )
              ),
              MuiDialogActions()(
                MuiButton(color = MuiButton.Color.primary)(
                  onClick --> handleClickClose,
                  "Cancel"
                ),
                MuiButton(color = MuiButton.Color.primary)(
                  onClick --> handleClickClose,
                  "Subscribe"
                )
              )
            ).when(state.open)
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Unit]("FormDialog")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply() = component()
}
