package io.kinoplan.demo.components.demos.Buttons

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Buttons.{CommonButtonStyle, DefaultCommonButtonStyle}
import io.kinoplan.scalajs.react.material.ui.core.MuiButton

object TextButtons extends ScalaCssReactImplicits {
  case class Props(style: CommonButtonStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Text Buttons")(
          div(
            MuiButton()(css.marginButton, "Default"),
            MuiButton(color = MuiButton.Color.primary)(css.marginButton, "Primary"),
            MuiButton(color = MuiButton.Color.secondary)(css.marginButton, "Secondary"),
            MuiButton()(css.marginButton, disabled := true, "Disabled"),
            MuiButton()(css.marginButton, href := "#text-buttons", "Link"),
            input.file(css.inputButton, accept := "image/*", id := "text-button-file", multiple := true),
            label(htmlFor := "text-button-file")(
              MuiButton(component = "span")(css.marginButton,
                "Upload"
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("TextButtons")
    .renderBackend[Backend]
    .build

  def apply(style: CommonButtonStyle = DefaultCommonButtonStyle) = component(Props(style))
}
