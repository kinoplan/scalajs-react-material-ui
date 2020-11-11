package io.kinoplan.demo.components.demos.Dialogs

import scala.scalajs.js

import japgolly.scalajs.react.{BackendScope, Callback, React, ReactEvent, ReactEventFromInput, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Dialogs.{DefaultDialogsStyle, DialogsStyle}
import io.kinoplan.scalajs.react.material.ui.core._

object MaxWidthDialog extends ScalaCssReactImplicits {
  case class Props(style: DialogsStyle)

  case class State(open: Boolean = false, fullWidth: Boolean = true, maxWidth: String = "sm") {
    def handleClickOpen = copy(open = true)

    def handleClickClose = copy(open = false)

    def handleFullWidthChange(value: Boolean) = copy(fullWidth = value)

    def handleMaxWidthChange(value: String) = copy(maxWidth = value)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleClickOpen = t.modState(_.handleClickOpen)

    def handleClickClose: Callback = t.modState(_.handleClickClose)

    def onClose: (ReactEvent, String) => Callback = (_, _) => {
      handleClickClose
    }

    def handleFullWidthChange(e: ReactEventFromInput): Callback = {
      val value = e.target.checked

      t.modState(_.handleFullWidthChange(value))
    }

    def handleMaxWidthChange: ReactEventFromInput => Callback = e => {
      val value = e.target.value

      t.modState(_.handleMaxWidthChange(value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val selectInputProps = js.Dynamic.literal(
        name = "max-width",
        id = "max-width"
      )

      div(
        ComponentContainer("Optional sizes")(
          React.Fragment(
            MuiButton(variant = MuiButton.Variant.outlined, color = MuiButton.Color.primary)(
              onClick --> handleClickOpen,
              "Open max-width dialog"
            ),
            div(
              MuiDialog(
                fullWidth = state.fullWidth,
                maxWidth = state.maxWidth,
                open = state.open,
                onClose = onClose
              )(
                aria.labelledBy := "max-width-dialog-title",
                MuiDialogTitle()(
                  id := "max-width-dialog-title",
                  "Optional sizes"
                ),
                MuiDialogContent()(
                  MuiDialogContentText()(
                    "You can set my maximum width and whether to adapt or not."
                  ),
                  form(css.form, noValidate := true,
                    MuiFormControl()(css.formControl,
                      MuiInputLabel()(
                        htmlFor := "max-width",
                        "maxWidth"
                      ),
                      MuiSelect(inputProps = selectInputProps)(
                        onChange ==> handleMaxWidthChange,
                        value := state.maxWidth,
                        MuiMenuItem()(value := "false", "false"),
                        MuiMenuItem()(value := "xs", "xs"),
                        MuiMenuItem()(value := "sm", "sm"),
                        MuiMenuItem()(value := "md", "md"),
                        MuiMenuItem()(value := "lg", "lg"),
                        MuiMenuItem()(value := "xl", "xl")
                      )
                    ),
                    MuiFormControlLabel(
                      control = MuiSwitch(checked = state.fullWidth)(
                        onChange ==> handleFullWidthChange,
                        value := "fullWidth"
                      ).rawElement,
                      label = VdomNode("Full width")
                    )(css.formControlLabel)
                  )
                ),
                MuiDialogActions()(
                  MuiButton(color = MuiButton.Color.primary)(
                    onClick --> handleClickClose,
                    "Close"
                  )
                )
              ).when(state.open)
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("MaxWidthDialog")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: DialogsStyle = DefaultDialogsStyle) = component(Props(style))
}
