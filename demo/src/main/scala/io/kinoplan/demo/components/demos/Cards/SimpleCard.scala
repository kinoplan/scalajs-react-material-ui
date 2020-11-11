package io.kinoplan.demo.components.demos.Cards

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Cards.{DefaultSimpleCardStyle, SimpleCardStyle}
import io.kinoplan.scalajs.react.material.ui.core._

object SimpleCard extends ScalaCssReactImplicits {
  case class Props(style: SimpleCardStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      val bull = span(css.bullet, "•")

      div(
        ComponentContainer("Simple Card")(
          MuiCard()(css.card,
            MuiCardContent()(
              MuiTypography(color = MuiTypography.Color.textSecondary, gutterBottom = true)(css.title,
                "Word of the Day"
              ),
              MuiTypography(variant = MuiTypography.Variant.h5, component = "h2")(
                "be", bull, "nev", bull, "o", bull, "lent"
              ),
              MuiTypography(color = MuiTypography.Color.textSecondary)(css.pos,
                "adjective"
              ),
              MuiTypography(component = "p")(
                "well meaning and kindly.",
                br,
                "\"a benevolent smile\""
              )
            ),
            MuiCardActions()(
              MuiButton(size = MuiButton.Size.small)("Learn More")
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SimpleCard")
    .renderBackend[Backend]
    .build

  def apply(style: SimpleCardStyle = DefaultSimpleCardStyle) = component(Props(style))
}
