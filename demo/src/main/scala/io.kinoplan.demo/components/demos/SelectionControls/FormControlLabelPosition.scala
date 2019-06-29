package io.kinoplan.demo.components.demos.SelectionControls

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.scalajs.react.material.ui.core.{MuiFormControl, MuiFormControlLabel, MuiFormLabel, MuiRadio, MuiRadioGroup}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ReactEventFromInput, ScalaComponent}
import scalacss.ScalaCssReactImplicits

object FormControlLabelPosition extends ScalaCssReactImplicits {
  case class State(value: String = "female") {
    def handleChange(value: String) = copy(value = value)
  }

  class Backend(t: BackendScope[Unit, State]) {
    def handleChange(e: ReactEventFromInput) = {
      val value = e.target.value

      t.modState(_.handleChange(value))
    }

    def render(state: State): VdomElement = {
      div(
        ComponentContainer("Label placement")(
          MuiFormControl(component = "fieldset")(
            MuiFormLabel(component = "legend")("labelPlacement"),
            MuiRadioGroup(row = true)(
              aria.label := "position",
              name := "position",
              value := state.value,
              onChange ==> handleChange,
              MuiFormControlLabel(
                control = Some(MuiRadio(color = MuiRadio.Color.primary).rawElement),
                label = Some("Top"),
                labelPlacement = MuiFormControlLabel.LabelPlacement.top
              )(value := "top"),
              MuiFormControlLabel(
                control = Some(MuiRadio(color = MuiRadio.Color.primary).rawElement),
                label = Some("Start"),
                labelPlacement = MuiFormControlLabel.LabelPlacement.start
              )(value := "start"),
              MuiFormControlLabel(
                control = Some(MuiRadio(color = MuiRadio.Color.primary).rawElement),
                label = Some("Bottom"),
                labelPlacement = MuiFormControlLabel.LabelPlacement.bottom
              )(value := "bottom"),
              MuiFormControlLabel(
                control = Some(MuiRadio(color = MuiRadio.Color.primary).rawElement),
                label = Some("End"),
                labelPlacement = MuiFormControlLabel.LabelPlacement.end
              )(value := "end")
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Unit]("FormControlLabelPosition")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply() = component()
}
