package io.kinoplan.demo.components.demos.ExpansionPanels

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.ExpansionPanels.{DefaultSimpleExpansionPanelStyle, SimpleExpansionPanelStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiExpansionPanel, MuiExpansionPanelDetails, MuiExpansionPanelSummary, MuiTypography}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object SimpleExpansionPanel extends ScalaCssReactImplicits {
  case class Props(style: SimpleExpansionPanelStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Simple Expansion Panel")(
          div(css.root,
            MuiExpansionPanel()(
              MuiExpansionPanelSummary(expandIcon = MuiIcons(MuiIconsModule.ExpandMore)()())(
                MuiTypography()(css.heading,
                  "Expansion Panel 1"
                )
              ),
              MuiExpansionPanelDetails()(
                MuiTypography()(
                  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse malesuada lacus ex, " +
                  "sit amet blandit leo lobortis eget."
                )
              )
            ),
            MuiExpansionPanel()(
              MuiExpansionPanelSummary(expandIcon = MuiIcons(MuiIconsModule.ExpandMore)()())(
                MuiTypography()(css.heading,
                  "Expansion Panel 2"
                )
              ),
              MuiExpansionPanelDetails()(
                MuiTypography()(
                  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse malesuada lacus ex, " +
                  "sit amet blandit leo lobortis eget."
                )
              )
            ),
            MuiExpansionPanel()(
              disabled := true,
              MuiExpansionPanelSummary(expandIcon = MuiIcons(MuiIconsModule.ExpandMore)()())(
                MuiTypography()(css.heading,
                  "Disabled Expansion Panel"
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SimpleExpansionPanel")
    .renderBackend[Backend]
    .build

  def apply(style: SimpleExpansionPanelStyle = DefaultSimpleExpansionPanelStyle) = component(Props(style))
}
