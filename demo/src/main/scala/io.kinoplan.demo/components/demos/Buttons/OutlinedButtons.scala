package io.kinoplan.demo.components.demos.Buttons

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Buttons.{CommonButtonStyle, DefaultCommonButtonStyle}
import io.kinoplan.scalajs.react.material.ui.core.MuiButton
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReact._

object OutlinedButtons {
  case class Props(style: CommonButtonStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Outlined Buttons")(
          div(
            MuiButton(variant = MuiButton.Variant.outlined)(css.marginButton,
              "Default"
            ),
            MuiButton(variant = MuiButton.Variant.outlined, color = MuiButton.Color.primary)(css.marginButton,
              "Primary"
            ),
            MuiButton(variant = MuiButton.Variant.outlined, color = MuiButton.Color.secondary)(css.marginButton,
              "Secondary"
            ),
            MuiButton(variant = MuiButton.Variant.outlined, disabled = true)(css.marginButton,
              "Disabled"
            ),
            MuiButton(variant = MuiButton.Variant.outlined, href = Some("#outlined-buttons"))(css.marginButton,
              "Link"
            ),
            input.file(css.inputButton, accept := "image/*", id := "outlined-button-file", multiple := true),
            label(htmlFor := "outlined-button-file")(
              MuiButton(variant = MuiButton.Variant.contained, component = Some("span"))(css.marginButton,
                "Upload"
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("OutlinedButtons")
    .renderBackend[Backend]
    .build

  def apply(style: CommonButtonStyle = DefaultCommonButtonStyle) = component(Props(style))
}
