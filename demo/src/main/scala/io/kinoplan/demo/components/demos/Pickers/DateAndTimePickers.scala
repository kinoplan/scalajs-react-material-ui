package io.kinoplan.demo.components.demos.Pickers

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Pickers.{DefaultPickersStyle, PickersStyle}
import io.kinoplan.demo.utils.Helpers.StringExtended
import io.kinoplan.demo.utils.props.MuiInputLabelProps
import io.kinoplan.scalajs.react.material.ui.core.MuiTextField

object DateAndTimePickers extends ScalaCssReactImplicits {
  case class Props(style: PickersStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Date & Time pickers")(
          form(css.container, noValidate := true,
            MuiTextField(label = "Next appointment".toVdom, InputLabelProps = MuiInputLabelProps(shrink = true))(
              css.textField,
              id := "datetime-local",
              `type` := "datetime-local",
              defaultValue := "2017-05-24T10:30",
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("DateAndTimePickers")
    .renderBackend[Backend]
    .build

  def apply(style: PickersStyle = DefaultPickersStyle) = component(Props(style))
}
