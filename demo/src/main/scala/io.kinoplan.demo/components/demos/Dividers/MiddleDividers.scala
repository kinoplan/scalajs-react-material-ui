package io.kinoplan.demo.components.demos.Dividers

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Dividers.{DefaultDividersStyle, DividersStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiChip, MuiDivider, MuiGrid, MuiTypography}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReact._

object MiddleDividers {
  case class Props(style: DividersStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Middle Dividers")(
          div(css.root,
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
                MuiChip(label = Some("Extra Soft"))(css.chip),
                MuiChip(label = Some("Soft"))(css.chip),
                MuiChip(label = Some("Medium"))(css.chip),
                MuiChip(label = Some("Hard"))(css.chip),
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

