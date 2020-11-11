package io.kinoplan.demo.components.demos.Steppers

import scala.collection.SortedSet

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Steppers.{DefaultStepperStyle, StepperStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiStep, MuiStepButton, MuiStepper, MuiTypography}

object HorizontalNonLinearStepper extends ScalaCssReactImplicits {
  val steps = List("Select campaign settings", "Create an ad group", "Create an ad")

  def getStepContent(step: Int) = step match {
    case 0 => "Step 1: Select campaign settings..."
    case 1 => "Step 2: What is an ad group anyways?"
    case 2 => "Step 3: This is the bit I really care about!"
    case _ => "Unknown step"
  }

  case class Props(style: StepperStyle)

  case class State(activeStep: Int = 0, completed: SortedSet[Int] = SortedSet.empty) {
    val totalSteps = steps.length

    val isLastStep = activeStep == totalSteps - 1

    val isBackDisabled = activeStep == 0

    val completedSteps = completed.size

    val isAllStepsCompleted = completedSteps == totalSteps

    val isStepsPreCompleted = completedSteps == totalSteps - 1

    val notAllStepsCompleted = !isAllStepsCompleted

    val finishTitle = if (isStepsPreCompleted) "Finish" else "Complete Step"

    def isCompleted(step: Int) = completed.contains(step)

    def notCompleted(step: Int) = !isCompleted(step)

    def isStepActive(step: Int) = step == activeStep

    def handleNext = {
      val newActiveStep = (if (isLastStep && notAllStepsCompleted) {
        steps.indices.diff(completed.toList).sorted.headOption
      } else {
        Some(activeStep + 1)
      }).getOrElse(0)

      copy(activeStep = newActiveStep)
    }

    def handleBack = copy(activeStep = activeStep - 1)

    def handleStep(step: Int) = copy(
      activeStep = step
    )

    def handleComplete = {
      copy(
        completed = completed ++ SortedSet(activeStep)
      )
    }

    def handleReset = copy(
      activeStep = 0,
      completed = SortedSet.empty
    )
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleNext = t.modState(_.handleNext)

    def handleBack = t.modState(_.handleBack)

    def handleStep(step: Int) = t.modState(_.handleStep(step))

    def handleComplete = t.modState(_.handleComplete)

    def handleReset = t.modState(_.handleReset)

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Horizontal Non-linear")(
          div(css.root,
            MuiStepper(nonLinear = true, activeStep = state.activeStep)(
              steps.zipWithIndex.toVdomArray { case (label, index) =>
                MuiStep()(Attr("key") := label,
                  MuiStepButton(completed = state.isCompleted(index))(onClick --> handleStep(index), label)
                )
              }
            ),
            div(
              div(
                MuiTypography()(css.instructions, "All steps completed - you're finished"),
                MuiButton()(css.button, onClick --> handleReset, "Reset")
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
                  TagMod(
                    MuiTypography(variant = MuiTypography.Variant.caption)(css.completed,
                      s" Step ${state.activeStep + 1} already completed"
                    ).when(state.isCompleted(state.activeStep)),
                    MuiButton(
                      variant = MuiButton.Variant.contained,
                      color = MuiButton.Color.primary,
                    )(css.button,
                      onClick --> handleComplete,
                      state.finishTitle
                    ).when(state.notCompleted(state.activeStep))
                  ).when(state.notAllStepsCompleted)
                )
              ).when(state.notAllStepsCompleted)
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("HorizontalNonLinearStepper")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: StepperStyle = DefaultStepperStyle) = component(Props(style))
}
