package io.kinoplan.demo.components.demos.Pickers

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Pickers.{DefaultPickersStyle, PickersStyle}
import io.kinoplan.demo.utils.Helpers.StringExtended
import io.kinoplan.demo.utils.props.{MuiInputLabelProps, MuiNativeInputProps}
import io.kinoplan.scalajs.react.material.ui.core.MuiTextField

object TimePickers extends ScalaCssReactImplicits {
  case class Props(style: PickersStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Time pickers")(
          form(css.container, noValidate := true,
            MuiTextField(
              label = "Alarm clock".toVdom,
              InputLabelProps = MuiInputLabelProps(shrink = true),
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
