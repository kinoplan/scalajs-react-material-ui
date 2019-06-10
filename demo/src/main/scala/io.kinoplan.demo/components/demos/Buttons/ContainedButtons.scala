package io.kinoplan.demo.components.demos.Buttons

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Buttons.{CommonButtonStyle, DefaultCommonButtonStyle}
import io.kinoplan.scalajs.react.material.ui.core.MuiButton
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReact._

object ContainedButtons {
  case class Props(style: CommonButtonStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Contained Buttons")(
          div(
            MuiButton(variant = MuiButton.Variant.contained)(css.marginButton,
              "Default"
            ),
            MuiButton(variant = MuiButton.Variant.contained, color = MuiButton.Color.primary)(css.marginButton,
              "Primary"
            ),
            MuiButton(variant = MuiButton.Variant.contained, color = MuiButton.Color.secondary)(css.marginButton,
              "Secondary"
            ),
            MuiButton(variant = MuiButton.Variant.contained, color = MuiButton.Color.secondary, disabled = true)(css.marginButton,
              "Disabled"
            ),
            MuiButton(variant = MuiButton.Variant.contained, href = Some("#contained-buttons"))(css.marginButton,
              "Link"
            ),
            input.file(css.inputButton, accept := "image/*", id := "contained-button-file", multiple := true),
            label(htmlFor := "contained-button-file")(
              MuiButton(variant = MuiButton.Variant.contained, component = Some("span"))(css.marginButton,
                "Upload"
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("ContainedButtons")
    .renderBackend[Backend]
    .build

  def apply(style: CommonButtonStyle = DefaultCommonButtonStyle) = component(Props(style))
}
