package io.kinoplan.demo.components.demos.Accordion

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Accordion.{DefaultDetailedAccordionStyle, DetailedAccordionStyle}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object DetailedAccordion extends ScalaCssReactImplicits {
  case class Props(style: DetailedAccordionStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def handleDelete: ReactEvent => Callback = _ => Callback.empty

    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Secondary heading and Columns")(
          div(css.root,
            MuiAccordion(defaultExpanded = true)(
              MuiAccordionSummary(expandIcon = MuiIcons(MuiIconsModule.ExpandMore)()())(
                div(css.column,
                  MuiTypography()(css.heading, "Location")
                ),
                div(css.column,
                  MuiTypography()(css.secondaryHeading, "Select trip destination")
                )
              ),
              MuiAccordionDetails()(css.details,
                div(css.column),
                div(css.column,
                  MuiChip(label = VdomNode("Barbados"), onDelete = handleDelete)
                ),
                div(css.column, css.helper,
                  MuiTypography(variant = MuiTypography.Variant.caption)(
                    "Select your destination of choice",
                    br,
                    a(href := "#secondary-heading-and-columns")(css.linkStyle,
                      "Learn more"
                    )
                  )
                )
              ),
              MuiDivider(),
              MuiAccordionActions()(
                MuiButton(size = MuiButton.Size.small)("Cancel"),
                MuiButton(size = MuiButton.Size.small, color = MuiButton.Color.primary)("Save")
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("DetailedAccordion")
    .renderBackend[Backend]
    .build

  def apply(style: DetailedAccordionStyle = DefaultDetailedAccordionStyle) = component(Props(style))
}
