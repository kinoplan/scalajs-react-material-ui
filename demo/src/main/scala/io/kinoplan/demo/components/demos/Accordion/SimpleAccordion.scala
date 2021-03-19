package io.kinoplan.demo.components.demos.Accordion

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Accordion.{DefaultSimpleAccordionStyle, SimpleAccordionStyle}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object SimpleAccordion extends ScalaCssReactImplicits {
  case class Props(style: SimpleAccordionStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Simple accordion")(
          div(css.root,
            MuiAccordion()(
              MuiAccordionSummary(expandIcon = MuiIcons(MuiIconsModule.ExpandMore)()())(
                aria.controls := "panel1a-content",
                id := "panel1a-header",
                MuiTypography()(css.heading, "Accordion 1")
              ),
              MuiAccordionDetails()(
                MuiTypography()(
                  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                  "Suspendisse malesuada lacus ex, sit amet blandit leo lobortis eget."
                )
              )
            ),
            MuiAccordion()(
              MuiAccordionSummary(expandIcon = MuiIcons(MuiIconsModule.ExpandMore)()())(
                aria.controls := "panel2a-content",
                id := "panel2a-header",
                MuiTypography()(css.heading, "Accordion 2")
              ),
              MuiAccordionDetails()(
                MuiTypography()(
                  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                  "Suspendisse malesuada lacus ex, sit amet blandit leo lobortis eget."
                )
              )
            ),
            MuiAccordion()(disabled := true,
              MuiAccordionSummary(expandIcon = MuiIcons(MuiIconsModule.ExpandMore)()())(
                aria.controls := "panel3a-content",
                id := "panel3a-header",
                MuiTypography()(css.heading, "Disabled Accordion")
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SimpleAccordion")
    .renderBackend[Backend]
    .build

  def apply(style: SimpleAccordionStyle = DefaultSimpleAccordionStyle) = component(Props(style))
}
