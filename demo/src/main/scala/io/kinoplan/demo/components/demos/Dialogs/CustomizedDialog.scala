package io.kinoplan.demo.components.demos.Dialogs

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Dialogs.{DefaultDialogsStyle, DialogsStyle}
import io.kinoplan.scalajs.react.material.ui.core._

object CustomizedDialog extends ScalaCssReactImplicits {
  case class Props(style: DialogsStyle)

  case class State(open: Boolean = false) {
    def handleClickOpen = copy(open = true)

    def handleClickClose = copy(open = false)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleClickOpen = t.modState(_.handleClickOpen)

    def handleClickClose: Callback = t.modState(_.handleClickClose)

    def onClose: (ReactEvent, String) => Callback = (_, _) => {
      handleClickClose
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Customized dialog")(
          div(
            MuiButton(variant = MuiButton.Variant.outlined, color = MuiButton.Color.secondary)(
              onClick --> handleClickOpen,
              "Open simple dialog"
            ),
            MuiDialog(open = state.open, onClose = onClose)(
              aria.labelledBy := "customized-dialog-title",
              CustomizedDialogTitleWrapped(handleClickClose),
              MuiDialogContent()(css.customizedDialogContent,
                MuiTypography(gutterBottom = true)(
                  "Cras mattis consectetur purus sit amet fermentum. Cras justo odio, dapibus ac " +
                  "facilisis in, egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum " +
                  "at eros."
                ),
                MuiTypography(gutterBottom = true)(
                  "Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis " +
                  "lacus vel augue laoreet rutrum faucibus dolor auctor."
                ),
                MuiTypography(gutterBottom = true)(
                  "Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis " +
                    "lacus vel augue laoreet rutrum faucibus dolor auctor."
                ),
                MuiTypography(gutterBottom = true)(
                  "Aenean lacinia bibendum nulla sed consectetur. Praesent commodo cursus magna, vel " +
                  "scelerisque nisl consectetur et. Donec sed odio dui. Donec ullamcorper nulla non metus " +
                  "auctor fringilla."
                )
              ),
              MuiDialogActions()(css.customizedDialogActions,
                MuiButton(color = MuiButton.Color.primary)(
                  onClick --> handleClickClose,
                  "Save changes"
                )
              )
            ).when(state.open)
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("CustomizedDialog")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: DialogsStyle = DefaultDialogsStyle) = component(Props(style))
}
