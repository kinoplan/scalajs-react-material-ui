package io.kinoplan.demo.components.demos.ExpansionPanels

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.ExpansionPanels.{CustomizedExpansionPanelStyle, DefaultCustomizedExpansionPanelStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiExpansionPanel, MuiExpansionPanelDetails, MuiExpansionPanelSummary, MuiTypography}

object CustomizedExpansionPanel extends ScalaCssReactImplicits {
  case class Props(style: CustomizedExpansionPanelStyle)

  case class State(expanded: Option[String] = Some("panel1")) {
    def handleChange(value: String) = copy(expanded = if (expanded.contains(value)) None else Some(value))

    val isPanel1 = expanded.contains("panel1")

    val isPanel2 = expanded.contains("panel2")

    val isPanel3 = expanded.contains("panel3")
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChange(value: String) = t.modState(_.handleChange(value))

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Customized Expansion Panel")(
          div(
            MuiExpansionPanel(square = true, expanded = state.isPanel1)(css.panelRoot, css.panelExpanded,
              onChange --> handleChange("panel1"),
              MuiExpansionPanelSummary()(css.summaryRoot, css.summaryContent,
                MuiTypography()("Collapsible Group Item #1")
              ),
              MuiExpansionPanelDetails()(css.detailsRoot,
                MuiTypography()(
                  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse malesuada lacus " +
                  "ex, sit amet blandit leo lobortis eget. Lorem ipsum dolor sit amet, consectetur " +
                  "adipiscing elit. Suspendisse malesuada lacus ex, sit amet blandit leo lobortis eget."
                )
              )
            ),
            MuiExpansionPanel(square = true, expanded = state.isPanel2)(css.panelRoot, css.panelExpanded,
              onChange --> handleChange("panel2"),
              MuiExpansionPanelSummary()(css.summaryRoot, css.summaryContent,
                MuiTypography()("Collapsible Group Item #2")
              ),
              MuiExpansionPanelDetails()(css.detailsRoot,
                MuiTypography()(
                  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse malesuada lacus " +
                  "ex, sit amet blandit leo lobortis eget. Lorem ipsum dolor sit amet, consectetur " +
                  "adipiscing elit. Suspendisse malesuada lacus ex, sit amet blandit leo lobortis eget."
                )
              )
            ),
            MuiExpansionPanel(square = true, expanded = state.isPanel3)(css.panelRoot, css.panelExpanded,
              onChange --> handleChange("panel3"),
              MuiExpansionPanelSummary()(css.summaryRoot, css.summaryContent,
                MuiTypography()("Collapsible Group Item #3")
              ),
              MuiExpansionPanelDetails()(css.detailsRoot,
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

  private val component = ScalaComponent.builder[Props]("CustomizedExpansionPanel")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: CustomizedExpansionPanelStyle = DefaultCustomizedExpansionPanelStyle) = component(Props(style))
}
