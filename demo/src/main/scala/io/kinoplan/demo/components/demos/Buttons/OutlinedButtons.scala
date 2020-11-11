package io.kinoplan.demo.components.demos.Buttons

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Buttons.{CommonButtonStyle, DefaultCommonButtonStyle}
import io.kinoplan.scalajs.react.material.ui.core.MuiButton

object OutlinedButtons extends ScalaCssReactImplicits {
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
            MuiButton(variant = MuiButton.Variant.outlined)(css.marginButton,
              disabled := true,
              "Disabled"
            ),
            MuiButton(variant = MuiButton.Variant.outlined)(css.marginButton,
              href := "#outlined-buttons",
              "Link"
            ),
            input.file(css.inputButton, accept := "image/*", id := "outlined-button-file", multiple := true),
            label(htmlFor := "outlined-button-file")(
              MuiButton(variant = MuiButton.Variant.contained, component = "span")(css.marginButton,
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
