package io.kinoplan.demo.components.demos.Accordion

import cats.implicits.catsSyntaxOptionId
import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Accordion.{ControlledAccordionStyle, DefaultControlledAccordionStyle}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object ControlledAccordion extends ScalaCssReactImplicits {
  case class Props(style: ControlledAccordionStyle)

  case class State(panelO: Option[String] = None) {
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

      div(
        ComponentContainer("Controlled accordion")(
          div(css.root,
            MuiAccordion(expanded = state.panelO.contains("panel1"), onChange = handleChange("panel1"))(
              MuiAccordionSummary(expandIcon = MuiIcons(MuiIconsModule.ExpandMore)()())(
                aria.controls := "panel1bh-content",
                id := "panel1bh-header",
                MuiTypography()(css.heading, "General settings"),
                MuiTypography()(css.secondaryHeading, "I am an accordion")
              ),
              MuiAccordionDetails()(
                MuiTypography()(
                  "Nulla facilisi. Phasellus sollicitudin nulla et quam mattis feugiat. " +
                  "Aliquam eget maximus est, id dignissim quam."
                )
              )
            ),
            MuiAccordion(expanded = state.panelO.contains("panel2"), onChange = handleChange("panel2"))(
              MuiAccordionSummary(expandIcon = MuiIcons(MuiIconsModule.ExpandMore)()())(
                aria.controls := "panel2bh-content",
                id := "panel2bh-header",
                MuiTypography()(css.heading, "Users"),
                MuiTypography()(css.secondaryHeading, "You are currently not an owner")
              ),
              MuiAccordionDetails()(
                MuiTypography()(
                  "Donec placerat, lectus sed mattis semper, neque lectus feugiat lectus, " +
                  "varius pulvinar diam eros in elit. Pellentesque convallis laoreet laoreet."
                )
              )
            ),
            MuiAccordion(expanded = state.panelO.contains("panel3"), onChange = handleChange("panel3"))(
              MuiAccordionSummary(expandIcon = MuiIcons(MuiIconsModule.ExpandMore)()())(
                aria.controls := "panel3bh-content",
                id := "panel3bh-header",
                MuiTypography()(css.heading, "Advanced settings"),
                MuiTypography()(css.secondaryHeading, "Filtering has been entirely disabled for whole web server")
              ),
              MuiAccordionDetails()(
                MuiTypography()(
                  "Nunc vitae orci ultricies, auctor nunc in, volutpat nisl. " +
                  "Integer sit amet egestas eros,vitae egestas augue. Duis vel est augue."
                )
              )
            ),
            MuiAccordion(expanded = state.panelO.contains("panel4"), onChange = handleChange("panel4"))(
              MuiAccordionSummary(expandIcon = MuiIcons(MuiIconsModule.ExpandMore)()())(
                aria.controls := "panel4bh-content",
                id := "panel4bh-header",
                MuiTypography()(css.heading, "Personal data")
              ),
              MuiAccordionDetails()(
                MuiTypography()(
                  "Nunc vitae orci ultricies, auctor nunc in, volutpat nisl. " +
                  "Integer sit amet egestas eros,vitae egestas augue. Duis vel est augue."
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("ControlledAccordion")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: ControlledAccordionStyle = DefaultControlledAccordionStyle) = component(Props(style))
}
