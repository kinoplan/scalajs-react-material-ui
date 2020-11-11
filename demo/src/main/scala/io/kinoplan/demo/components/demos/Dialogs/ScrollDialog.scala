package io.kinoplan.demo.components.demos.Dialogs

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiDialog, MuiDialogActions, MuiDialogContent, MuiDialogContentText, MuiDialogTitle}

object ScrollDialog {
  case class State(open: Boolean = false, scroll: String = "paper") {
    def handleClickOpen(scroll: String) = copy(open = true, scroll = scroll)

    def handleClose = copy(open = false)
  }

  class Backend(t: BackendScope[Unit, State]) {
    def handleClickOpen(scroll: String) = t.modState(_.handleClickOpen(scroll))

    def handleClickClose: Callback = t.modState(_.handleClose)

    def onClose: (ReactEvent, String) => Callback = (_, _) => {
      handleClickClose
    }

    def render(state: State): VdomElement = {
      div(
        ComponentContainer("Scrolling long content")(
          div(
            MuiButton()(
              onClick --> handleClickOpen("paper"),
              "scroll=paper"
            ),
            MuiButton()(
              onClick --> handleClickOpen("body"),
              "scroll=body"
            ),
            MuiDialog(open = state.open, onClose = onClose, scroll = state.scroll)(
              aria.labelledBy := "scroll-dialog-title",
              MuiDialogTitle()(id := "scroll-dialog-title", "Subscribe"),
              MuiDialogContent()(
                MuiDialogContentText()(
                  "Cras mattis consectetur purus sit amet fermentum. Cras justo odio, dapibus ac " +
                  "facilisis in, egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum " +
                  "at eros. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus " +
                  "sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Aenean lacinia bibendum " +
                  "nulla sed consectetur. Praesent commodo cursus magna, vel scelerisque nisl consectetur " +
                  "et. Donec sed odio dui. Donec ullamcorper nulla non metus auctor fringilla. Cras " +
                  "mattis consectetur purus sit amet fermentum. Cras justo odio, dapibus ac facilisis in, " +
                  "egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. " +
                  "Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis " +
                  "lacus vel augue laoreet rutrum faucibus dolor auctor. Aenean lacinia bibendum nulla " +
                  "sed consectetur. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. " +
                  "Donec sed odio dui. Donec ullamcorper nulla non metus auctor fringilla. Cras mattis " +
                  "consectetur purus sit amet fermentum. Cras justo odio, dapibus ac facilisis in, " +
                  "egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. " +
                  "Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis " +
                  "lacus vel augue laoreet rutrum faucibus dolor auctor. Aenean lacinia bibendum nulla " +
                  "sed consectetur. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. " +
                  "Donec sed odio dui. Donec ullamcorper nulla non metus auctor fringilla. Cras mattis " +
                  "consectetur purus sit amet fermentum. Cras justo odio, dapibus ac facilisis in, " +
                  "egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. " +
                  "Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis " +
                  "lacus vel augue laoreet rutrum faucibus dolor auctor. Aenean lacinia bibendum nulla " +
                  "sed consectetur. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. " +
                  "Donec sed odio dui. Donec ullamcorper nulla non metus auctor fringilla. Cras mattis " +
                  "consectetur purus sit amet fermentum. Cras justo odio, dapibus ac facilisis in, " +
                  "egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. " +
                  "Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis " +
                  "lacus vel augue laoreet rutrum faucibus dolor auctor. Aenean lacinia bibendum nulla " +
                  "sed consectetur. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. " +
                  "Donec sed odio dui. Donec ullamcorper nulla non metus auctor fringilla. Cras mattis " +
                  "consectetur purus sit amet fermentum. Cras justo odio, dapibus ac facilisis in, " +
                  "egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. " +
                  "Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis " +
                  " lacus vel augue laoreet rutrum faucibus dolor auctor. Aenean lacinia bibendum nulla " +
                  "sed consectetur. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. " +
                  "Donec sed odio dui. Donec ullamcorper nulla non metus auctor fringilla."
                )
              ),
              MuiDialogActions()(
                MuiButton(color = MuiButton.Color.primary)(
                  onClick --> handleClickClose,
                  "Cancel"
                ),
                MuiButton(color = MuiButton.Color.primary)(
                  onClick --> handleClickClose,
                  autoFocus := true,
                  "Subscribe"
                )
              )
            ).when(state.open)
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Unit]("ScrollDialog")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply() = component()
}
