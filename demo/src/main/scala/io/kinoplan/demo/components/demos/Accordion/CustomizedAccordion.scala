package io.kinoplan.demo.components.demos.Accordion

import scala.scalajs.js.JSConverters.JSRichOption

import cats.implicits.catsSyntaxOptionId
import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Accordion.{CustomizedAccordionStyle, DefaultCustomizedAccordionStyle}
import io.kinoplan.demo.utils.Helpers.styleAToClassName
import io.kinoplan.scalajs.react.material.ui.core.{MuiAccordion, MuiAccordionDetails, MuiAccordionSummary, MuiTypography}

object CustomizedAccordion extends ScalaCssReactImplicits {
  case class Props(style: CustomizedAccordionStyle)

  case class State(panelO: Option[String] = Some("panel1")) {
    def handleChange(panel: String, isExpanded: Boolean) = copy(
      panelO = if (isExpanded) panel.some else None
    )
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChange(panel: String): (ReactEvent, Boolean) => Callback = (_, isExpanded) => {
      t.modState(_.handleChange(panel, isExpanded))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val accordionClasses = Map(
        MuiAccordion.ClassKey.root -> styleAToClassName(css.accordionRoot),
        MuiAccordion.ClassKey.expanded -> styleAToClassName(css.accordionExpanded)
      ).some.orUndefined

      div(
        ComponentContainer("Customized accordion")(
          div(
            MuiAccordion(
              square = true,
              expanded = state.panelO.contains("panel1"),
              onChange = handleChange("panel1"),
              classes = accordionClasses
            )(
              MuiAccordionSummary()(css.summaryRoot, css.summaryContent,
                aria.controls := "panel1d-content",
                id := "panel1d-header",
                MuiTypography()("Collapsible Group Item #1")
              ),
              MuiAccordionDetails()(css.detailsRoot,
                MuiTypography()(
                  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse malesuada lacus " +
                  "ex, sit amet blandit leo lobortis eget. Lorem ipsum dolor sit amet, consectetur " +
                  "adipiscing elit. Suspendisse malesuada lacus ex, sit amet blandit leo lobortis eget."
                )
              )
            ),
            MuiAccordion(
              square = true,
              expanded = state.panelO.contains("panel2"),
              onChange = handleChange("panel2"),
              classes = accordionClasses
            )(
              MuiAccordionSummary()(css.summaryRoot, css.summaryContent,
                aria.controls := "panel2d-content",
                id := "panel2d-header",
                MuiTypography()("Collapsible Group Item #2")
              ),
              MuiAccordionDetails()(css.detailsRoot,
                MuiTypography()(
                  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse malesuada lacus " +
                  "ex, sit amet blandit leo lobortis eget. Lorem ipsum dolor sit amet, consectetur " +
                  "adipiscing elit. Suspendisse malesuada lacus ex, sit amet blandit leo lobortis eget."
                )
              )
            ),
            MuiAccordion(
              square = true,
              expanded = state.panelO.contains("panel3"),
              onChange = handleChange("panel3"),
              classes = accordionClasses
            )(
              MuiAccordionSummary()(css.summaryRoot, css.summaryContent,
                aria.controls := "panel3d-content",
                id := "panel3d-header",
                MuiTypography()("Collapsible Group Item #3")
              ),
              MuiAccordionDetails()(css.detailsRoot,
                MuiTypography()(
                  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse malesuada lacus " +
                  "ex, sit amet blandit leo lobortis eget. Lorem ipsum dolor sit amet, consectetur " +
                  "adipiscing elit. Suspendisse malesuada lacus ex, sit amet blandit leo lobortis eget."
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("CustomizedAccordion")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: CustomizedAccordionStyle = DefaultCustomizedAccordionStyle) = component(Props(style))
}
