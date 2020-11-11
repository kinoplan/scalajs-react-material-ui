package io.kinoplan.demo.components.demos.TextFields

import japgolly.scalajs.react.{BackendScope, ReactDOM, ReactEventFromInput, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import org.scalajs.dom.{Element, document}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.TextFields.{ComponentTextFieldStyle, DefaultComponentTextFieldStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiFilledInput, MuiFormControl, MuiFormHelperText, MuiInput, MuiInputLabel, MuiOutlinedInput}

object ComposedTextField extends ScalaCssReactImplicits {
  case class Props(style: ComponentTextFieldStyle)

  case class State(
    name: String = "Composed TextField",
    labelWidth: Int = 0
  ) {
    def handleChange(value: String) = copy(name = value)

    def setLabelWidth(element: Element) = {
      val offsetWidth = ReactDOM.findDOMNode(element).map(_.asHtml().offsetWidth.toInt).getOrElse(0)

      copy(labelWidth = offsetWidth)
    }
  }

  class Backend(t: BackendScope[Props, State]) {
    val inputRefId = "outlined-component-ref"

    def inputRef = document.getElementById(inputRefId)

    def mount = t.modState(_.setLabelWidth(inputRef)) >> t.forceUpdate

    def handleChange(e: ReactEventFromInput) = {
      val value = e.target.value

      t.modState(_.handleChange(value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Components")(
          div(css.container,
            MuiFormControl()(css.formControl,
              MuiInputLabel()(htmlFor := "component-simple", "Name"),
              MuiInput()(
                id := "component-simple",
                value := state.name,
                onChange ==> handleChange
              )
            ),
            MuiFormControl()(css.formControl,
              MuiInputLabel()(htmlFor := "component-helper", "Name"),
              MuiInput()(
                id := "component-helper",
                value := state.name,
                onChange ==> handleChange,
                aria.describedBy := "component-helper-text"
              ),
              MuiFormHelperText()(id := "component-helper-text", "Some important helper text")
            ),
            MuiFormControl()(css.formControl,
              disabled := true,
              MuiInputLabel()(htmlFor := "component-disabled", "Name"),
              MuiInput()(
                id := "component-disabled",
                value := state.name,
                onChange ==> handleChange
              ),
              MuiFormHelperText()("Disabled")
            ),
            MuiFormControl(error = true)(css.formControl,
              MuiInputLabel()(htmlFor := "component-error", "Name"),
              MuiInput()(
                id := "component-error",
                value := state.name,
                onChange ==> handleChange,
                aria.describedBy := "component-error-text"
              ),
              MuiFormHelperText()(id := "component-error-text", "Error")
            ),
            MuiFormControl(variant = MuiFormControl.Variant.outlined)(css.formControl,
              MuiInputLabel()(id := inputRefId, htmlFor := "component-outlined", "Name"),
              MuiOutlinedInput(labelWidth = state.labelWidth)(
                id := "component-outlined",
                value := state.name,
                onChange ==> handleChange,
              )
            ),
            MuiFormControl(variant = MuiFormControl.Variant.filled)(css.formControl,
              MuiInputLabel()(htmlFor := "component-filled", "Name"),
              MuiFilledInput()(
                id := "component-filled",
                value := state.name,
                onChange ==> handleChange
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("ComposedTextField")
    .initialState(State())
    .renderBackend[Backend]
    .componentDidMount(_.backend.mount)
    .build

  def apply(style: ComponentTextFieldStyle = DefaultComponentTextFieldStyle) = component(Props(style))
}
