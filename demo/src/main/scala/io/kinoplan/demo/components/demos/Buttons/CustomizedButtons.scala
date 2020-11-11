package io.kinoplan.demo.components.demos.Buttons

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Buttons.{CustomizedButtonsStyle, DefaultCustomizedButtonsStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, colors}
import io.kinoplan.scalajs.react.material.ui.core.styles._

object CustomizedButtons extends ScalaCssReactImplicits {
  case class Props(style: CustomizedButtonsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      val theme = createMuiTheme(options = ThemeOptions(
        typography = TypographyOptions(useNextVariants = true),
        palette = PaletteOptions(primary = colors.green)
      ))

      div(
        ComponentContainer("Customized Buttons")(
          div(
            MuiButton(variant = MuiButton.Variant.contained, color = MuiButton.Color.primary)(
              css.common.marginButton, css.cssRoot,
              "Custom CSS"
            ),
            MuiThemeProvider(theme = theme)(
              MuiButton(variant = MuiButton.Variant.contained, color = MuiButton.Color.primary)(
                css.common.marginButton,
                "MuiThemeProvider"
              )
            ),
            MuiButton(variant = MuiButton.Variant.contained, color = MuiButton.Color.primary, disableRipple = true)(
              css.common.marginButton, css.bootstrapRoot,
              "Bootstrap"
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("CustomizedButtons")
    .renderBackend[Backend]
    .build

  def apply(style: CustomizedButtonsStyle = DefaultCustomizedButtonsStyle) = component(Props(style))
}
