package io.kinoplan.demo.components.demos.SelectionControls

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.SelectionControls.{ControlButtonsGroupStyle, DefaultControlButtonsGroupStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiCheckbox, MuiFormControl, MuiFormControlLabel, MuiFormGroup, MuiFormHelperText, MuiFormLabel}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ReactEventFromInput, ScalaComponent}
import scalacss.ScalaCssReactImplicits

object CheckboxesGroup extends ScalaCssReactImplicits {
  case class Props(style: ControlButtonsGroupStyle)

  case class State(
    gilad: Boolean = true,
    jason: Boolean = false,
    antoine: Boolean = false
  ) {
    val error = List(gilad, jason, antoine).count(_ == true) != 2

    def handleChangeGilad(value: Boolean) = copy(gilad = value)

    def handleChangeJason(value: Boolean) = copy(jason = value)

    def handleChangeAntoine(value: Boolean) = copy(antoine = value)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChangeGilad(e: ReactEventFromInput) = {
      val value = e.target.checked

      t.modState(_.handleChangeGilad(value))
    }

    def handleChangeJason(e: ReactEventFromInput) = {
      val value = e.target.checked

      t.modState(_.handleChangeJason(value))
    }

    def handleChangeAntoine(e: ReactEventFromInput) = {
      val value = e.target.checked

      t.modState(_.handleChangeAntoine(value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Checkboxes with FormGroup")(
          div(css.root,
            MuiFormControl(component = "fieldset")(css.formControl,
              MuiFormLabel(component = "legend")("Assign responsibility"),
              MuiFormGroup()(
                MuiFormControlLabel(
                  control = Some(MuiCheckbox()(
                    checked := state.gilad,
                    onChange ==> handleChangeGilad,
                    value := "gilad"
                  ).rawElement),
                  label = Some("Gilad Gray")
                ),
                MuiFormControlLabel(
                  control = Some(MuiCheckbox()(
                    checked := state.jason,
                    onChange ==> handleChangeJason,
                    value := "jason"
                  ).rawElement),
                  label = Some("Jason Killian")
                ),
                MuiFormControlLabel(
                  control = Some(MuiCheckbox()(
                    checked := state.antoine,
                    onChange ==> handleChangeAntoine,
                    value := "antoine"
                  ).rawElement),
                  label = Some("Antoine Llorca")
                )
              ),
              MuiFormHelperText()("Be careful")
            ),
            MuiFormControl(error = state.error, component = "fieldset")(css.formControl,
              required := true,
              MuiFormLabel(component = "legend")("Pick two"),
              MuiFormGroup()(
                MuiFormControlLabel(
                  control = Some(MuiCheckbox()(
                    checked := state.gilad,
                    onChange ==> handleChangeGilad,
                    value := "gilad"
                  ).rawElement),
                  label = Some("Gilad Gray")
                ),
                MuiFormControlLabel(
                  control = Some(MuiCheckbox()(
                    checked := state.jason,
                    onChange ==> handleChangeJason,
                    value := "jason"
                  ).rawElement),
                  label = Some("Jason Killian")
                ),
                MuiFormControlLabel(
                  control = Some(MuiCheckbox()(
                    checked := state.antoine,
                    onChange ==> handleChangeAntoine,
                    value := "antoine"
                  ).rawElement),
                  label = Some("Antoine Llorca")
                )
              ),
              MuiFormHelperText()("You can display an error")
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("CheckboxesGroup")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: ControlButtonsGroupStyle = DefaultControlButtonsGroupStyle) = component(Props(style))
}
