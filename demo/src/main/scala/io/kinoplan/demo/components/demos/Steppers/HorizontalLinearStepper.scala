package io.kinoplan.demo.components.demos.Steppers

import scala.scalajs.js.JSConverters._

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Steppers.{DefaultStepperStyle, StepperStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiStep, MuiStepLabel, MuiStepper, MuiTypography}

object HorizontalLinearStepper extends ScalaCssReactImplicits {
  val steps = List("Select campaign settings", "Create an ad group", "Create an ad")

  def getStepContent(step: Int) = step match {
    case 0 => "Select campaign settings..."
    case 1 => "What is an ad group anyways?"
    case 2 => "This is the bit I really care about!"
    case _ => "Unknown step"
  }

  case class Props(style: StepperStyle)

  case class State(activeStep: Int = 0, skipped: Set[Int] = Set.empty[Int]) {
    val isFinish = activeStep == steps.length

    val notFinish = !isFinish

    val isFinal = activeStep == steps.length - 1

    val nextTitle = if (isFinal) "Finish" else "Next"

    val isBackDisabled = activeStep <= 0

    def isStepSkipped(step: Int = activeStep) = skipped.contains(step)

    def isStepOptional(step: Int = activeStep) = step == 1

    def isStepActive(step: Int) = step == activeStep

    def handleNext = {
      if (isStepSkipped()) {
        copy(
          skipped = skipped.filterNot(_ == activeStep),
          activeStep = activeStep + 1
        )
      } else {
        copy(
          activeStep = activeStep + 1
        )
      }
    }

    def handleBack = copy(activeStep = activeStep - 1)

    def handleSkip = copy(
      skipped = skipped + activeStep,
      activeStep = activeStep + 1
    )

    def handleReset = copy(activeStep = 0)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleNext = t.modState(_.handleNext)

    def handleBack = t.modState(_.handleBack)

    def handleSkip = t.modState(_.handleSkip)

    def handleReset = t.modState(_.handleReset)

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Horizontal Linear")(
          div(css.root,
            MuiStepper(activeStep = state.activeStep)(
              steps.zipWithIndex.toVdomArray { case (label, index) =>
                val optional = if (state.isStepOptional(index)) {
                  MuiTypography(variant = MuiTypography.Variant.caption)("Optional")
                } else EmptyVdom

                val completed = if (state.isStepSkipped(index)) Some(false) else None

                MuiStep(completed = completed.orUndefined)(Attr("key") := label,
                  MuiStepLabel(optional = optional)(label)
                )
              }
            ),
            div(
              div(
                MuiTypography()(css.instructions, "All steps completed - you're finished"),
                MuiButton()(css.button, onClick --> handleReset, "Reset")
              ).when(state.isFinish),
              div(
                MuiTypography()(css.instructions, getStepContent(state.activeStep)),
                div(
                  MuiButton()(css.button, onClick --> handleBack, disabled := state.isBackDisabled, "Back"),
                  MuiButton(
                    variant = MuiButton.Variant.contained,
                    color = MuiButton.Color.primary,
                  )(css.button,
                    onClick --> handleSkip,
                    disabled := state.isBackDisabled,
                    "Skip"
                  ).when(state.isStepOptional()),
                  MuiButton(
                    variant = MuiButton.Variant.contained,
                    color = MuiButton.Color.primary,
                  )(css.button, onClick --> handleNext, state.nextTitle)
                )
              ).when(state.notFinish)
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("HorizontalLinearStepper")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: StepperStyle = DefaultStepperStyle) = component(Props(style))
}
