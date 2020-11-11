package io.kinoplan.demo.components.demos.SelectionControls

import japgolly.scalajs.react.{BackendScope, ReactEventFromInput, ScalaComponent}
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.scalajs.react.material.ui.core.MuiCheckbox

object Checkboxes {
  case class State(
    checkedA: Boolean = true,
    checkedB: Boolean = true,
    checkedF: Boolean = true
  ) {
    def handleChangeCheckedA(value: Boolean) = copy(checkedA = value)

    def handleChangeCheckedB(value: Boolean) = copy(checkedB = value)

    def handleChangeCheckedF(value: Boolean) = copy(checkedF = value)
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

    def handleChangeCheckedF(e: ReactEventFromInput) = {
      val value = e.target.checked

      t.modState(_.handleChangeCheckedF(value))
    }

    def render(state: State): VdomElement = {
      div(
        ComponentContainer("Checkboxes")(
          div(
            MuiCheckbox()(
              checked := state.checkedA,
              value := "checkedA",
              onChange ==> handleChangeCheckedA
            ),
            MuiCheckbox(color = MuiCheckbox.Color.primary)(
              checked := state.checkedB,
              value := "checkedB",
              onChange ==> handleChangeCheckedB
            ),
            MuiCheckbox()(value := "checkedC"),
            MuiCheckbox()(disabled := true, value := "checkedD"),
            MuiCheckbox()(disabled := true, checked := true, value := "checkedE"),
            MuiCheckbox(indeterminate = true)(
              checked := state.checkedF,
              value := "checkedF",
              onChange ==> handleChangeCheckedF
            ),
            MuiCheckbox(defaultChecked = true, color = MuiCheckbox.Color.default)(value := "checkedG")
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Unit]("Checkboxes")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply() = component()
}
