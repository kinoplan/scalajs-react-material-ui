package io.kinoplan.demo.components.demos.SelectionControls

import japgolly.scalajs.react.{BackendScope, ReactEventFromInput, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.SelectionControls.{ControlButtonsGroupStyle, DefaultControlButtonsGroupStyle}
import io.kinoplan.demo.utils.Helpers.StringExtended
import io.kinoplan.scalajs.react.material.ui.core.{MuiFormControl, MuiFormControlLabel, MuiFormHelperText, MuiFormLabel, MuiRadio, MuiRadioGroup}

object RadioButtonsGroup extends ScalaCssReactImplicits {
  case class Props(style: ControlButtonsGroupStyle)

  case class State(value: String = "female") {
    def handleChange(value: String) = copy(value = value)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChange(e: ReactEventFromInput) = {
      val value = e.target.value

      t.modState(_.handleChange(value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Radio Buttons")(
          div(css.root,
            MuiFormControl(component = "fieldset")(css.formControl,
              MuiFormLabel(component = "legend")("Gender"),
              MuiRadioGroup()(css.group,
                aria.label := "Gender",
                name := "gender1",
                value := state.value,
                onChange ==> handleChange,
                MuiFormControlLabel(control = MuiRadio()().rawElement, label = "Female".toVdom)(value := "female"),
                MuiFormControlLabel(control = MuiRadio()().rawElement, label = "Male".toVdom)(value := "male"),
                MuiFormControlLabel(control = MuiRadio()().rawElement, label = "Other".toVdom)(value := "other"),
                MuiFormControlLabel(control = MuiRadio()().rawElement, label = "(Disabled option)".toVdom)(
                  disabled := true,
                  value := "disabled"
                )
              )
            ),
            MuiFormControl(component = "fieldset")(css.formControl,
              MuiFormLabel(component = "legend")("Gender"),
              MuiRadioGroup()(css.group,
                aria.label := "gender",
                name := "gender2",
                value := state.value,
                onChange ==> handleChange,
                MuiFormControlLabel(
                  control = MuiRadio(color = MuiRadio.Color.primary).rawElement,
                  label = "Female".toVdom,
                  labelPlacement = MuiFormControlLabel.LabelPlacement.start
                )(value := "female"),
                MuiFormControlLabel(
                  control = MuiRadio(color = MuiRadio.Color.primary).rawElement,
                  label = "Male".toVdom,
                  labelPlacement = MuiFormControlLabel.LabelPlacement.start
                )(value := "male"),
                MuiFormControlLabel(
                  control = MuiRadio(color = MuiRadio.Color.primary).rawElement,
                  label = "Other".toVdom,
                  labelPlacement = MuiFormControlLabel.LabelPlacement.start
                )(value := "other"),
                MuiFormControlLabel(
                  control = MuiRadio().rawElement,
                  label = "(Disabled option)".toVdom,
                  labelPlacement = MuiFormControlLabel.LabelPlacement.start
                )(
                  disabled := true,
                  value := "disabled"
                )
              ),
              MuiFormHelperText()("labelPlacement start")
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("RadioButtonsGroup")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: ControlButtonsGroupStyle = DefaultControlButtonsGroupStyle) = component(Props(style))
}
