package io.kinoplan.demo.components.demos.Selects

import japgolly.scalajs.react.{BackendScope, Callback, ReactEventFromInput, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Selects.{ControlledOpenSelectStyle, DefaultControlledOpenSelectStyle}
import io.kinoplan.demo.utils.props.MuiNativeInputProps
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiFormControl, MuiInputLabel, MuiMenuItem, MuiSelect}

object ControlledOpenSelect extends ScalaCssReactImplicits {
  case class Props(style: ControlledOpenSelectStyle)

  case class State(age: String = "", open: Boolean = false) {
    def handleChangeAge(value: String) = copy(age = value)

    def handleClose = copy(open = false)

    def handleOpen = copy(open = true)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChangeAge(e: ReactEventFromInput) = {
      val value = e.target.value

      t.modState(_.handleChangeAge(value))
    }

    def handleOpen: ReactEventFromInput => Callback = _ => t.modState(_.handleOpen)

    def handleClose: ReactEventFromInput => Callback = _ => t.modState(_.handleClose)

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Controlled open Select")(
          form(autoComplete := "off",
            MuiButton()(css.button, onClick ==> handleOpen, "Open the select"),
            MuiFormControl()(css.formControl,
              MuiInputLabel()(htmlFor := "demo-controlled-open-select", "Age"),
              MuiSelect(
                open = state.open,
                onClose = handleClose,
                onOpen = handleOpen,
                inputProps = MuiNativeInputProps(
                  name = Some("age"),
                  id = Some("demo-controlled-open-select")
                )
              )(
                value := state.age,
                onChange ==> handleChangeAge,
                MuiMenuItem()(value := "", em("None")),
                MuiMenuItem()(value := "10", "Ten"),
                MuiMenuItem()(value := "20", "Twenty"),
                MuiMenuItem()(value := "30", "Thirty")
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("ControlledOpenSelect")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: ControlledOpenSelectStyle = DefaultControlledOpenSelectStyle) = component(Props(style))
}
