package io.kinoplan.demo.components.demos.SelectionControls

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.scalajs.react.material.ui.core.{MuiFormControlLabel, MuiFormGroup, MuiSwitch}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ReactEventFromInput, ScalaComponent}
import scalacss.ScalaCssReactImplicits

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
              control = Some(
                MuiSwitch()(
                  checked := state.checkedA,
                  value := "checkedA",
                  onChange ==> handleChangeCheckedA
                ).rawElement
              ),
              label = Some("Secondary")
            ),
            MuiFormControlLabel(
              control = Some(
                MuiSwitch(color = MuiSwitch.Color.primary)(
                  checked := state.checkedB,
                  value := "checkedB",
                  onChange ==> handleChangeCheckedB
                ).rawElement
              ),
              label = Some("Primary")
            ),
            MuiFormControlLabel(
              control = Some(MuiSwitch()(value := "checkedC").rawElement),
              label = Some("Uncontrolled")
            ),
            MuiFormControlLabel(
              control = Some(MuiSwitch()(value := "checkedD").rawElement),
              label = Some("Disabled")
            )(disabled := true),
            MuiFormControlLabel(
              control = Some(MuiSwitch()(checked := true, value := "checkedE").rawElement),
              label = Some("Disabled")
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
