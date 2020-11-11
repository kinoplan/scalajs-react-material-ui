package io.kinoplan.demo.components.demos.SelectionControls

import japgolly.scalajs.react.{BackendScope, ReactEventFromInput, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.utils.Helpers.StringExtended
import io.kinoplan.scalajs.react.material.ui.core.{MuiFormControlLabel, MuiFormGroup, MuiSwitch}

object SwitchLabels extends ScalaCssReactImplicits {
  case class State(
    checkedA: Boolean = true,
    checkedB: Boolean = true
  ) {
    def handleChangeCheckedA(value: Boolean) = copy(checkedA = value)

    def handleChangeCheckedB(value: Boolean) = copy(checkedB = value)
  }

  class Backend(t: BackendScope[Unit, State]) {
    def handleChangeCheckedA(e: ReactEventFromInput) = {
      val value = e.target.checked

      t.modState(_.handleChangeCheckedA(value))
    }

    def handleChangeCheckedB(e: ReactEventFromInput) = {
      val value = e.target.checked

      t.modState(_.handleChangeCheckedB(value))
    }

    def render(state: State): VdomElement = {
      div(
        ComponentContainer("Switches with FormControlLabel")(
          MuiFormGroup(row = true)(
            MuiFormControlLabel(
              control = MuiSwitch()(
                checked := state.checkedA,
                value := "checkedA",
                onChange ==> handleChangeCheckedA
              ).rawElement,
              label = "Secondary".toVdom
            ),
            MuiFormControlLabel(
              control = MuiSwitch(color = MuiSwitch.Color.primary)(
                checked := state.checkedB,
                value := "checkedB",
                onChange ==> handleChangeCheckedB
              ).rawElement,
              label = "Primary".toVdom
            ),
            MuiFormControlLabel(
              control = MuiSwitch()(value := "checkedC").rawElement,
              label = "Uncontrolled".toVdom
            ),
            MuiFormControlLabel(
              control = MuiSwitch()(value := "checkedD").rawElement,
              label = "Disabled".toVdom
            )(disabled := true),
            MuiFormControlLabel(
              control = MuiSwitch()(checked := true, value := "checkedE").rawElement,
              label = "Disabled".toVdom
            )(disabled := true)
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Unit]("SwitchLabels")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply() = component()
}
