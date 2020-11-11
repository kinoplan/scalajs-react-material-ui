package io.kinoplan.demo.components.demos.Selects

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ReactEventFromInput, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Selects.{DefaultSelectStyle, SelectStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiDialog, MuiDialogActions, MuiDialogContent, MuiDialogTitle, MuiFormControl, MuiInput, MuiInputLabel, MuiMenuItem, MuiSelect}

object DialogSelect extends ScalaCssReactImplicits {
  case class Props(style: SelectStyle)

  case class State(age: String = "", open: Boolean = false) {
    def handleChangeAge(value: String) = copy(age = value)

    def handleClose = copy(open = false)

    def handleClickOpen = copy(open = true)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChangeAge(e: ReactEventFromInput) = {
      val value = e.target.value

      t.modState(_.handleChangeAge(value))
    }

    def handleClickOpen: ReactEventFromInput => Callback = _ =>  t.modState(_.handleClickOpen)

    def handleClickClose: Callback = t.modState(_.handleClose)

    def onClose: (ReactEvent, String) => Callback = (_, _) => {
      handleClickClose
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("With a Dialog")(
          div(
            MuiButton()(onClick ==> handleClickOpen, "Open select dialog"),
            MuiDialog(
              disableBackdropClick = true,
              disableEscapeKeyDown = true,
              open = state.open,
              onClose = onClose
            )(
              MuiDialogTitle()("Fill the form"),
              MuiDialogContent()(
                form(css.root,
                  MuiFormControl()(css.formControl,
                    MuiInputLabel()(htmlFor := "age-native-simple", "Age"),
                    MuiSelect(
                      native = true,
                      input = MuiInput()(id := "age-native-simple").rawElement
                    )(
                      value := state.age,
                      onChange ==> handleChangeAge,
                      option(value := ""),
                      option(value := "10", "Ten"),
                      option(value := "20", "Twenty"),
                      option(value := "30", "Thirty")
                    )
                  ),
                  MuiFormControl()(css.formControl,
                    MuiInputLabel()(htmlFor := "age-simple", "Age"),
                    MuiSelect(input = MuiInput()(id := "age-simple").rawElement)(
                      value := state.age,
                      onChange ==> handleChangeAge,
                      MuiMenuItem()(value := "", em("None")),
                      MuiMenuItem()(value := "10", "Ten"),
                      MuiMenuItem()(value := "20", "Twenty"),
                      MuiMenuItem()(value := "30", "Thirty")
                    )
                  ),
                )
              ),
              MuiDialogActions()(
                MuiButton(color = MuiButton.Color.primary)(onClick --> handleClickClose, "Cancel"),
                MuiButton(color = MuiButton.Color.primary)(onClick --> handleClickClose, "Ok")
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("DialogSelect")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: SelectStyle = DefaultSelectStyle) = component(Props(style))
}
