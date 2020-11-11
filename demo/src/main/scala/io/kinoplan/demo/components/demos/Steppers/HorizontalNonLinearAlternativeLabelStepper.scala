package io.kinoplan.demo.components.demos.Steppers

import scala.scalajs.js.JSConverters._

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Steppers.{DefaultStepperStyle, StepperStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiStep, MuiStepButton, MuiStepper, MuiTypography}

object HorizontalNonLinearAlternativeLabelStepper extends ScalaCssReactImplicits {
  val steps = List("Select campaign settings", "Create an ad group", "Create an ad")

  def getStepContent(step: Int) = step match {
    case 0 => "Step 1: Select campaign settings..."
    case 1 => "Step 2: What is an ad group anyways?"
    case 2 => "Step 3: This is the bit I really care about!"
    case _ => "Unknown step"
  }

  case class Props(style: StepperStyle)

  case class State(activeStep: Int = 0, completed: Set[Int] = Set.empty, skipped: Set[Int] = Set.empty) {
    val totalSteps = steps.length

    val isTotalStep = activeStep == totalSteps

    val notTotalStep = !isTotalStep

    val isLastStep = activeStep == totalSteps - 1

    val isBackDisabled = activeStep == 0

    val completedSteps = completed.size

    val skippedSteps = skipped.size

    val isAllStepsCompleted = completedSteps == totalSteps - skippedSteps

    val isStepsPreCompleted = completedSteps == totalSteps - 1

    val finishTitle = if (isStepsPreCompleted) "Finish" else "Complete Step"

    val notAllStepsCompleted = !isAllStepsCompleted

    def isStepSkipped(step: Int) = skipped.contains(step)

    def isStepComplete(step: Int) = completed.contains(step)

    def notStepComplete(step: Int) = !isStepComplete(step)

    def isStepOptional(step: Int) = step == 1

    val isSkipEnabled = isStepOptional(activeStep) && !isStepComplete(activeStep)

    def handleNext = {
      val newActiveStep = (if (isLastStep && notAllStepsCompleted) {
        steps.indices.diff(completed.toList).sorted.headOption
      } else {
        Some(activeStep + 1)
      }).getOrElse(0)

      copy(activeStep = newActiveStep)
    }

    def handleBack = copy(activeStep = activeStep - 1)

    def handleSkip = copy(
      skipped = skipped + activeStep,
      activeStep = activeStep + 1
    )

    def handleStep(step: Int) = copy(
      activeStep = step
    )

    def handleComplete = {
      copy(
        completed = completed + activeStep
      )
    }

    def handleReset = copy(
      activeStep = 0,
      completed = Set.empty,
      skipped = Set.empty
    )
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleNext = t.modState(_.handleNext)

    def handleBack = t.modState(_.handleBack)

    def handleStep(step: Int) = t.modState(_.handleStep(step))

    def handleSkip = t.modState(_.handleSkip)

    def handleComplete = {
      val state = t.state.runNow()

      t.modState(_.handleComplete) >> handleNext.when_(state.notAllStepsCompleted)
    }

    def handleReset = t.modState(_.handleReset)

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Horizontal Non Linear - Alternative Label")(
          div(css.root,
            MuiStepper(activeStep = state.activeStep, alternativeLabel = true, nonLinear = true)(
              steps.zipWithIndex.toVdomArray { case (label, index) =>
                val optional = if (state.isStepOptional(index)) {
                  MuiTypography(variant = MuiTypography.Variant.caption)("Optional")
                } else EmptyVdom

                val completed = if (state.isStepSkipped(index)) Some(false) else None

                MuiStep(completed = completed.orUndefined)(Attr("key") := label,
                  MuiStepButton(
                    optional = optional,
                    completed = state.isStepComplete(index)
                  )(onClick --> handleStep(index), label)
                )
              }
            ),
            div(
              div(
                MuiTypography()(css.instructions, "All steps completed - you're finished"),
                MuiButton()(onClick --> handleReset, "Reset")
              ).when(state.isAllStepsCompleted),
              div(
                MuiTypography()(css.instructions, getStepContent(state.activeStep)),
                div(
                  MuiButton()(css.button, onClick --> handleBack, disabled := state.isBackDisabled, "Back"),
                  MuiButton(
                    variant = MuiButton.Variant.contained,
                    color = MuiButton.Color.primary,
                  )(css.button,
                    onClick --> handleNext,
                    "Next"
                  ),
                  MuiButton(
                    variant = MuiButton.Variant.contained,
                    color = MuiButton.Color.primary,
                  )(css.button,
                    onClick --> handleSkip,
                    "Skip"
                  ).when(state.isSkipEnabled),
                  TagMod(
                    MuiTypography(variant = MuiTypography.Variant.caption)(css.completed,
                      s" Step ${state.activeStep + 1} already completed"
                    ).when(state.isStepComplete(state.activeStep)),
                    MuiButton(
                      variant = MuiButton.Variant.contained,
                      color = MuiButton.Color.primary,
                    )(css.button,
                      onClick --> handleComplete,
                      state.finishTitle
                    ).when(state.notStepComplete(state.activeStep))
                  ).when(state.notTotalStep)
                )
              ).when(state.notAllStepsCompleted)
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("HorizontalNonLinearAlternativeLabelStepper")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: StepperStyle = DefaultStepperStyle) = component(Props(style))
}
