package io.kinoplan.demo.components.demos.TextFields

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.TextFields.{ComponentTextFieldStyle, DefaultComponentTextFieldStyle}
import io.kinoplan.demo.utils.props.MuiInputProps
import io.kinoplan.scalajs.react.material.ui.core.MuiInput

object Inputs extends ScalaCssReactImplicits {
  case class Props(style: ComponentTextFieldStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Inputs")(
          div(css.container,
            MuiInput(inputProps = MuiInputProps(ariaLabel = "Description"))(css.formControl,
              defaultValue := "Hello world"
            ),
            MuiInput(inputProps = MuiInputProps(ariaLabel = "Description"))(css.formControl,
              placeholder := "Placeholder"
            ),
            MuiInput(inputProps = MuiInputProps(ariaLabel = "Description"))(css.formControl,
              disabled := true,
              value := "Disabled"
            ),
            MuiInput(error = true, inputProps = MuiInputProps(ariaLabel = "Description"))(css.formControl,
              defaultValue := "Error"
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("Inputs")
    .renderBackend[Backend]
    .build

  def apply(style: ComponentTextFieldStyle = DefaultComponentTextFieldStyle) = component(Props(style))
}
