package io.kinoplan.demo.components.demos.Steppers

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Steppers.{DefaultMobileStepperStyle, MobileStepperStyle}
import io.kinoplan.scalajs.react.material.ui.core.styles.Direction
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiMobileStepper}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiKeyboardArrowLeftIcon, MuiKeyboardArrowRightIcon}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReactImplicits

object ProgressMobileStepper extends ScalaCssReactImplicits {
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

      val nextButton = Some(VdomNode(
        MuiButton(size = MuiButton.Size.small)(
          onClick --> handleNext,
          disabled := state.isNextDisabled,
          "Next",
          if (css.theme.direction == Direction.rtl) MuiKeyboardArrowLeftIcon() else MuiKeyboardArrowRightIcon()
        ).rawNode
      ))

      val backButton = Some(VdomNode(
        MuiButton(size = MuiButton.Size.small)(
          onClick --> handleBack,
          disabled := state.isBackDisabled,
          if (css.theme.direction == Direction.rtl) MuiKeyboardArrowRightIcon() else MuiKeyboardArrowLeftIcon(),
          "Back"
        ).rawNode
      ))

      div(
        ComponentContainer("Mobile Stepper - Progress")(
          MuiMobileStepper(
            variant = MuiMobileStepper.Variant.progress,
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

  private val component = ScalaComponent.builder[Props]("ProgressMobileStepper")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: MobileStepperStyle = DefaultMobileStepperStyle) = component(Props(style))
}
