package io.kinoplan.demo.components.demos.Dividers

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout}
import io.kinoplan.demo.styles.demos.Dividers.{DefaultDividersStyle, DividersStyle}
import io.kinoplan.scalajs.react.material.ui.core._

object MiddleDividers extends ScalaCssReactImplicits {
  case class Props(style: DividersStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Middle Dividers")(
          div(css.root, css.rootPaper(Layout.isPaletteLight),
            div(css.section1,
              MuiGrid(container = true, alignItems = MuiGrid.AlignItems.center)(
                MuiGrid(item = true, xs = true)(
                  MuiTypography(gutterBottom = true, variant = MuiTypography.Variant.h4)(
                    "Toothbrush"
                  )
                ),
                MuiGrid(item = true)(
                  MuiTypography(gutterBottom = true, variant = MuiTypography.Variant.h6)(
                    "$4.50"
                  )
                )
              ),
              MuiTypography(color = MuiTypography.Color.textSecondary)(
                "Pinstriped cornflower blue cotton blouse takes you on a walk to the park or just down the " +
                "hall."
              )
            ),
            MuiDivider(variant = MuiDivider.Variant.middle),
            div(css.section2,
              MuiTypography(gutterBottom = true, variant = MuiTypography.Variant.body1)(
                "Select type"
              ),
              div(
                MuiChip(label = VdomNode("Extra Soft"))(css.chip),
                MuiChip(label = VdomNode("Soft"))(css.chip),
                MuiChip(label = VdomNode("Medium"))(css.chip),
                MuiChip(label = VdomNode("Hard"))(css.chip),
              )
            ),
            div(css.section3,
              MuiButton(variant = MuiButton.Variant.contained, color = MuiButton.Color.primary, fullWidth = true)(
                "Add to cart"
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("MiddleDividers")
    .renderBackend[Backend]
    .build

  def apply(style: DividersStyle = DefaultDividersStyle) = component(Props(style))
}

