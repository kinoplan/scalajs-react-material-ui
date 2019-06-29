package io.kinoplan.demo.components.demos.SelectionControls

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.SelectionControls.{DefaultControlButtonsGroupStyle, ControlButtonsGroupStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiFormControl, MuiFormControlLabel, MuiFormHelperText, MuiFormLabel, MuiRadio, MuiRadioGroup}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ReactEventFromInput, ScalaComponent}
import scalacss.ScalaCssReactImplicits

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
                MuiFormControlLabel(control = Some(MuiRadio()().rawElement), label = Some("Female"))(value := "female"),
                MuiFormControlLabel(control = Some(MuiRadio()().rawElement), label = Some("Male"))(value := "male"),
                MuiFormControlLabel(control = Some(MuiRadio()().rawElement), label = Some("Other"))(value := "other"),
                MuiFormControlLabel(control = Some(MuiRadio()().rawElement), label = Some("(Disabled option)"))(
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
                  control = Some(MuiRadio(color = MuiRadio.Color.primary).rawElement),
                  label = Some("Female"),
                  labelPlacement = MuiFormControlLabel.LabelPlacement.start
                )(value := "female"),
                MuiFormControlLabel(
                  control = Some(MuiRadio(color = MuiRadio.Color.primary).rawElement),
                  label = Some("Male"),
                  labelPlacement = MuiFormControlLabel.LabelPlacement.start
                )(value := "male"),
                MuiFormControlLabel(
                  control = Some(MuiRadio(color = MuiRadio.Color.primary).rawElement),
                  label = Some("Other"),
                  labelPlacement = MuiFormControlLabel.LabelPlacement.start
                )(value := "other"),
                MuiFormControlLabel(
                  control = Some(MuiRadio().rawElement),
                  label = Some("(Disabled option)"),
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
