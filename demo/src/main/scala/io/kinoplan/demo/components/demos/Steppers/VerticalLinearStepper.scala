package io.kinoplan.demo.components.demos.Steppers

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Steppers.{DefaultVerticalLinearStepperStyle, VerticalLinearStepperStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiPaper, MuiStep, MuiStepContent, MuiStepLabel, MuiStepper, MuiTypography}

object VerticalLinearStepper extends ScalaCssReactImplicits {
  val steps = List("Select campaign settings", "Create an ad group", "Create an ad")

  def getStepContent(step: Int) = step match {
    case 0 => {
      "For each ad campaign that you create, you can control how much " +
      "you're willing to spend on clicks and conversions, which networks " +
      "and geographical locations you want your ads to show on, and more."
    }
    case 1 => "An ad group contains one or more ads which target a shared set of keywords."
    case 2 => {
      "Try out different ad text to see what brings in the most customers, " +
      "and learn how to enhance your ads using features like ad extensions. " +
      "If you run into any problems with your ads, find out how to tell if " +
      "they're running and how to resolve approval issues."
    }
    case _ => "Unknown step"
  }

  case class Props(style: VerticalLinearStepperStyle)

  case class State(activeStep: Int = 0) {
    val isTotalStep = activeStep == steps.length

    val notTotalStep = !isTotalStep

    val isLastStep = activeStep == steps.length - 1

    val nextTitle = if (isLastStep) "Finish" else "Next"

    val isBackDisabled = activeStep == 0

    def handleNext = copy(activeStep = activeStep + 1)

    def handleBack = copy(activeStep = activeStep - 1)

    def handleReset = copy(activeStep = 0)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleNext = t.modState(_.handleNext)

    def handleBack = t.modState(_.handleBack)

    def handleReset = t.modState(_.handleReset)

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Vertical Stepper")(
          div(css.root,
            MuiStepper(activeStep = state.activeStep, orientation = MuiStepper.Orientation.vertical)(
              steps.toVdomArray { label =>
                MuiStep()(Attr("key") := label,
                  MuiStepLabel()(label),
                  MuiStepContent()(
                    MuiTypography()(getStepContent(state.activeStep)),
                    div(css.actionsContainer,
                      div(
                        MuiButton()(css.button, onClick --> handleBack, disabled := state.isBackDisabled, "Back"),
                        MuiButton(
                          variant = MuiButton.Variant.contained,
                          color = MuiButton.Color.primary,
                        )(css.button, onClick --> handleNext, state.nextTitle)
                      )
                    )
                  )
                )
              }
            ),
            MuiPaper(square = true, elevation = 0)(css.resetContainer,
              MuiTypography()("All steps completed - you're finished"),
              MuiButton()(css.button, onClick --> handleReset, "Reset")
            ).when(state.isTotalStep)
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("VerticalLinearStepper")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: VerticalLinearStepperStyle = DefaultVerticalLinearStepperStyle) = component(Props(style))
}
