package io.kinoplan.demo.components.demos.SelectionControls

import japgolly.scalajs.react.{BackendScope, ReactEventFromInput, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.utils.Helpers.StringExtended
import io.kinoplan.scalajs.react.material.ui.core.{MuiFormControl, MuiFormControlLabel, MuiFormGroup, MuiFormHelperText, MuiFormLabel, MuiSwitch}

object SwitchesGroup extends ScalaCssReactImplicits {
  case class State(
    gilad: Boolean = true,
    jason: Boolean = false,
    antoine: Boolean = true
  ) {
    def handleChangeGilad(value: Boolean) = copy(gilad = value)

    def handleChangeJason(value: Boolean) = copy(jason = value)

    def handleChangeAntoine(value: Boolean) = copy(antoine = value)
  }

  class Backend(t: BackendScope[Unit, State]) {
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

    def render(state: State): VdomElement = {
      div(
        ComponentContainer("Switches with FormGroup")(
          MuiFormControl(component = "fieldset")(
            MuiFormLabel(component = "legend")("Assign responsibility"),
            MuiFormGroup()(
              MuiFormControlLabel(
                control = MuiSwitch()(
                  checked := state.gilad,
                  onChange ==> handleChangeGilad,
                  value := "gilad"
                ).rawElement,
                label = "Gilad Gray".toVdom
              ),
              MuiFormControlLabel(
                control = MuiSwitch()(
                  checked := state.jason,
                  onChange ==> handleChangeJason,
                  value := "jason"
                ).rawElement,
                label = "Jason Killian".toVdom
              ),
              MuiFormControlLabel(
                control = MuiSwitch()(
                  checked := state.antoine,
                  onChange ==> handleChangeAntoine,
                  value := "antoine"
                ).rawElement,
                label = "Antoine Llorca".toVdom
              )
            ),
            MuiFormHelperText()("Be careful")
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Unit]("SwitchesGroup")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply() = component()
}
