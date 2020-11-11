package io.kinoplan.demo.components.demos.TextFields

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.TextFields.{DefaultTextFieldsStyle, TextFieldsStyle}
import io.kinoplan.demo.utils.Helpers.StringExtended
import io.kinoplan.scalajs.react.material.ui.core.MuiTextField

object TextFieldMargins extends ScalaCssReactImplicits {
  case class Props(style: TextFieldsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Layout")(
          div(css.container,
            MuiTextField(label = "None".toVdom, helperText = "Some important text".toVdom)(css.textField,
              id := "margin-none",
              defaultValue := "Default Value"
            ),
            MuiTextField(
              label = "Dense".toVdom,
              helperText = "Some important text".toVdom,
              margin = MuiTextField.Margin.dense
            )(css.textField,
              id := "margin-dense",
              defaultValue := "Default Value"
            ),
            MuiTextField(
              label = "Normal".toVdom,
              helperText = "Some important text".toVdom,
              margin = MuiTextField.Margin.normal
            )(css.textField,
              id := "margin-normal",
              defaultValue := "Default Value"
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("TextFieldMargins")
    .renderBackend[Backend]
    .build

  def apply(style: TextFieldsStyle = DefaultTextFieldsStyle) = component(Props(style))
}
