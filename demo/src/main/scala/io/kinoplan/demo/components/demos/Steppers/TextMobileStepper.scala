package io.kinoplan.demo.components.demos.Steppers

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout}
import io.kinoplan.demo.models.Steppers.TutorialStep
import io.kinoplan.demo.styles.demos.Steppers.{DefaultTextMobileStepperStyle, TextMobileStepperStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiMobileStepper, MuiPaper, MuiTypography}
import io.kinoplan.scalajs.react.material.ui.core.styles.Direction
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object TextMobileStepper extends ScalaCssReactImplicits {
  val maxSteps = TutorialStep.default.length

  case class Props(style: TextMobileStepperStyle)

  case class State(activeStep: Int = 0) {
    val isNextDisabled = activeStep == maxSteps - 1

    val isBackDisabled = activeStep == 0

    def handleNext = copy(activeStep = activeStep + 1)

    def handleBack = copy(activeStep = activeStep - 1)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleNext = t.modState(_.handleNext)

    def handleBack = t.modState(_.handleBack)

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val tutorialStep = TutorialStep.default(state.activeStep)

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
        ComponentContainer("Mobile Stepper - Text")(
          div(css.root,
            MuiPaper(square = true, elevation = 0)(css.header, css.headerPaper(Layout.isPaletteLight),
              MuiTypography()(tutorialStep.label)
            ),
            img(css.img, src := tutorialStep.imgPath, alt := tutorialStep.label),
            MuiMobileStepper(
              steps = maxSteps,
              position = MuiMobileStepper.Position.static,
              activeStep = state.activeStep,
              nextButton = nextButton,
              backButton = backButton
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("TextMobileStepper")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: TextMobileStepperStyle = DefaultTextMobileStepperStyle) = component(Props(style))
}
