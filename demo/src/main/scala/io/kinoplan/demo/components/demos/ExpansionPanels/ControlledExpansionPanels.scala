package io.kinoplan.demo.components.demos.ExpansionPanels

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.ExpansionPanels.{ControlledExpansionPanelsStyle, DefaultControlledExpansionPanelsStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiExpansionPanel, MuiExpansionPanelDetails, MuiExpansionPanelSummary, MuiTypography}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object ControlledExpansionPanels extends ScalaCssReactImplicits {
  case class Props(style: ControlledExpansionPanelsStyle)

  case class State(expanded: Option[String] = None) {
    def handleChange(value: String) = copy(expanded = if (expanded.contains(value)) None else Some(value))

    val isPanel1 = expanded.contains("panel1")

    val isPanel2 = expanded.contains("panel2")

    val isPanel3 = expanded.contains("panel3")

    val isPanel4 = expanded.contains("panel4")
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChange(value: String) = t.modState(_.handleChange(value))

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Controlled Accordion")(
          div(css.root,
            MuiExpansionPanel(expanded = state.isPanel1)(onChange --> handleChange("panel1"),
              MuiExpansionPanelSummary(expandIcon = MuiIcons(MuiIconsModule.ExpandMore)()())(
                MuiTypography()(css.heading, "General settings"),
                MuiTypography()(css.secondaryHeading, "I am an expansion panel")
              ),
              MuiExpansionPanelDetails()(
                MuiTypography()(
                  "Nulla facilisi. Phasellus sollicitudin nulla et quam mattis feugiat. Aliquam eget " +
                  "maximus est, id dignissim quam."
                )
              )
            ),
            MuiExpansionPanel(expanded = state.isPanel2)(onChange --> handleChange("panel2"),
              MuiExpansionPanelSummary(expandIcon = MuiIcons(MuiIconsModule.ExpandMore)()())(
                MuiTypography()(css.heading, "Users"),
                MuiTypography()(css.secondaryHeading, "You are currently not an owner")
              ),
              MuiExpansionPanelDetails()(
                MuiTypography()(
                  "Donec placerat, lectus sed mattis semper, neque lectus feugiat lectus, varius pulvinar " +
                  "diam eros in elit. Pellentesque convallis laoreet laoreet."
                )
              )
            ),
            MuiExpansionPanel(expanded = state.isPanel3)(onChange --> handleChange("panel3"),
              MuiExpansionPanelSummary(expandIcon = MuiIcons(MuiIconsModule.ExpandMore)()())(
                MuiTypography()(css.heading, "Advanced settings"),
                MuiTypography()(css.secondaryHeading, "Filtering has been entirely disabled for whole web server")
              ),
              MuiExpansionPanelDetails()(
                MuiTypography()(
                  "Nunc vitae orci ultricies, auctor nunc in, volutpat nisl. Integer sit amet egestas " +
                  "eros, vitae egestas augue. Duis vel est augue."
                )
              )
            ),
            MuiExpansionPanel(expanded = state.isPanel4)(onChange --> handleChange("panel4"),
              MuiExpansionPanelSummary(expandIcon = MuiIcons(MuiIconsModule.ExpandMore)()())(
                MuiTypography()(css.heading, "Personal data")
              ),
              MuiExpansionPanelDetails()(
                MuiTypography()(
                  "Nunc vitae orci ultricies, auctor nunc in, volutpat nisl. Integer sit amet egestas " +
                  "eros, vitae egestas augue. Duis vel est augue."
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("ControlledExpansionPanels")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: ControlledExpansionPanelsStyle = DefaultControlledExpansionPanelsStyle) = component(Props(style))
}
