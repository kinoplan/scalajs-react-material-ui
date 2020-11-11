package io.kinoplan.demo.components.demos.Pickers

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Pickers.{DefaultPickersStyle, PickersStyle}
import io.kinoplan.demo.utils.Helpers.StringExtended
import io.kinoplan.demo.utils.props.MuiInputLabelProps
import io.kinoplan.scalajs.react.material.ui.core.MuiTextField

object DatePickers extends ScalaCssReactImplicits {
  case class Props(style: PickersStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Date pickers")(
          form(css.container, noValidate := true,
            MuiTextField(label = "Birthday".toVdom, InputLabelProps = MuiInputLabelProps(shrink = true))(
              css.textField,
              id := "date",
              `type` := "date",
              defaultValue := "2017-05-24",
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("DatePickers")
    .renderBackend[Backend]
    .build

  def apply(style: PickersStyle = DefaultPickersStyle) = component(Props(style))
}
