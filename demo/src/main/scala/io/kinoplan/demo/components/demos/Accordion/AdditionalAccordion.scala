package io.kinoplan.demo.components.demos.Accordion

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Accordion.{AdditionalAccordionStyle, DefaultAdditionalAccordionStyle}
import io.kinoplan.demo.utils.Helpers.StringExtended
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object AdditionalAccordion extends ScalaCssReactImplicits {
  case class Props(style: AdditionalAccordionStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Additional actions")(
          div(css.root,
            MuiAccordion()(
              MuiAccordionSummary(expandIcon = MuiIcons(MuiIconsModule.ExpandMore)()())(
                aria.label := "Expand",
                aria.controls := "additional-actions1-content",
                id := "additional-actions1-header",
                MuiFormControlLabel(
                  control = MuiCheckbox()().rawElement,
                  label = "I acknowledge that I should stop the click event propagation".toVdom
                )(
                  aria.label := "Acknowledge",
                  onClick ==> (_.stopPropagationCB),
                  onFocus ==> (_.stopPropagationCB)
                )
              ),
              MuiAccordionDetails()(
                MuiTypography(color = MuiTypography.Color.textSecondary)(
                  "The click event of the nested action will propagate up and " +
                  "expand the accordion unless you explicitly stop it."
                )
              )
            ),
            MuiAccordion()(
              MuiAccordionSummary(expandIcon = MuiIcons(MuiIconsModule.ExpandMore)()())(
                aria.label := "Expand",
                aria.controls := "additional-actions2-content",
                id := "additional-actions2-header",
                MuiFormControlLabel(
                  control = MuiCheckbox()().rawElement,
                  label = "I acknowledge that I should stop the focus event propagation".toVdom
                )(
                  aria.label := "Acknowledge",
                  onClick ==> (_.stopPropagationCB),
                  onFocus ==> (_.stopPropagationCB)
                )
              ),
              MuiAccordionDetails()(
                MuiTypography(color = MuiTypography.Color.textSecondary)(
                  "The focus event of the nested action will propagate up and " +
                  "also focus the accordion unless you explicitly stop it."
                )
              )
            ),
            MuiAccordion()(
              MuiAccordionSummary(expandIcon = MuiIcons(MuiIconsModule.ExpandMore)()())(
                aria.label := "Expand",
                aria.controls := "additional-actions3-content",
                id := "additional-actions3-header",
                MuiFormControlLabel(
                  control = MuiCheckbox()().rawElement,
                  label = "I acknowledge that I should provide an aria-label on each action that I add".toVdom
                )(
                  aria.label := "Acknowledge",
                  onClick ==> (_.stopPropagationCB),
                  onFocus ==> (_.stopPropagationCB)
                )
              ),
              MuiAccordionDetails()(
                MuiTypography(color = MuiTypography.Color.textSecondary)(
                  "If you forget to put an aria-label on the nested action, the label of the action will also be " +
                  "included in the label of the parent button that controls the accordion expansion."
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("AdditionalAccordion")
    .renderBackend[Backend]
    .build

  def apply(style: AdditionalAccordionStyle = DefaultAdditionalAccordionStyle) = component(Props(style))
}

