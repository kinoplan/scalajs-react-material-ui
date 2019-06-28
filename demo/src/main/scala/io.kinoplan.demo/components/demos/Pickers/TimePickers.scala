package io.kinoplan.demo.components.demos.Pickers

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Pickers.{DefaultPickersStyle, PickersStyle}
import io.kinoplan.demo.utils.props.{MuiInputLabelProps, MuiNativeInputProps}
import io.kinoplan.scalajs.react.material.ui.core.MuiTextField
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReactImplicits

object TimePickers extends ScalaCssReactImplicits {
  case class Props(style: PickersStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Time pickers")(
          form(css.container, noValidate := true,
            MuiTextField(
              label = Some("Alarm clock"),
              InputLabelProps = MuiInputLabelProps(shrink = Some(true)),
              inputProps = MuiNativeInputProps(step = Some(300))
            )(
              css.textField,
              id := "time",
              `type` := "time",
              defaultValue := "07:30"
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("TimePickers")
    .renderBackend[Backend]
    .build

  def apply(style: PickersStyle = DefaultPickersStyle) = component(Props(style))
}
