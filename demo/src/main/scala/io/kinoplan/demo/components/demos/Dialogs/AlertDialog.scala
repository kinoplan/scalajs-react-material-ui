package io.kinoplan.demo.components.demos.Dialogs

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiDialog, MuiDialogActions, MuiDialogContent, MuiDialogContentText, MuiDialogTitle}

object AlertDialog {
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
        ComponentContainer("Alert Dialog")(
          div(
            MuiButton(variant = MuiButton.Variant.outlined, color = MuiButton.Color.primary)(
              onClick --> handleClickOpen,
              "Open simple dialog"
            ),
            MuiDialog(open = state.open, onClose = onClose)(
              aria.labelledBy := "alert-dialog-title",
              aria.describedBy := "alert-dialog-description",
              MuiDialogTitle()(id := "alert-dialog-title", "Use Google's location service?"),
              MuiDialogContent()(
                MuiDialogContentText()(
                  id := "alert-dialog-description",
                  "Let Google help apps determine location. This means sending anonymous location data to " +
                  "Google, even when no apps are running."
                )
              ),
              MuiDialogActions()(
                MuiButton(color = MuiButton.Color.primary)(
                  onClick --> handleClickClose,
                  "Disagree"
                ),
                MuiButton(color = MuiButton.Color.primary)(
                  onClick --> handleClickClose,
                  autoFocus := true,
                  "Agree"
                )
              )
            ).when(state.open)
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Unit]("AlertDialog")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply() = component()
}
