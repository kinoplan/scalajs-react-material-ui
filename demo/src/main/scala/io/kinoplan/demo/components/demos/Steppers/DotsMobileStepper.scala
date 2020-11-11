package io.kinoplan.demo.components.demos.Steppers

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Steppers.{DefaultMobileStepperStyle, MobileStepperStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiMobileStepper}
import io.kinoplan.scalajs.react.material.ui.core.styles.Direction
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object DotsMobileStepper extends ScalaCssReactImplicits {
  case class Props(style: MobileStepperStyle)

  case class State(activeStep: Int = 0) {
    val isNextDisabled = activeStep == 5

    val isBackDisabled = activeStep == 0

    def handleNext = copy(activeStep = activeStep + 1)

    def handleBack = copy(activeStep = activeStep - 1)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleNext = t.modState(_.handleNext)

    def handleBack = t.modState(_.handleBack)

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val nextButton = VdomNode(
        MuiButton(size = MuiButton.Size.small)(
          onClick --> handleNext,
          disabled := state.isNextDisabled,
          "Next",
          if (css.theme.direction == Direction.rtl) {
            MuiIcons(MuiIconsModule.KeyboardArrowLeft)()
          } else {
            MuiIcons(MuiIconsModule.KeyboardArrowRight)()
          }
        ).rawNode
      )

      val backButton = VdomNode(
        MuiButton(size = MuiButton.Size.small)(
          onClick --> handleBack,
          disabled := state.isBackDisabled,
          if (css.theme.direction == Direction.rtl) {
            MuiIcons(MuiIconsModule.KeyboardArrowRight)()
          } else {
            MuiIcons(MuiIconsModule.KeyboardArrowLeft)()
          },
          "Back"
        ).rawNode
      )

      div(
        ComponentContainer("Mobile Stepper - Dots")(
          MuiMobileStepper(
            variant = MuiMobileStepper.Variant.dots,
            steps = 6,
            position = MuiMobileStepper.Position.static,
            activeStep = state.activeStep,
            nextButton = nextButton,
            backButton = backButton
          )(css.root)
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("DotsMobileStepper")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: MobileStepperStyle = DefaultMobileStepperStyle) = component(Props(style))
}
