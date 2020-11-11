package io.kinoplan.demo.components.demos.Steppers

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Steppers.{DefaultStepperStyle, StepperStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiStep, MuiStepLabel, MuiStepper, MuiTypography}

object HorizontalLabelPositionBelowStepper extends ScalaCssReactImplicits {
  val steps = List("Select master blaster campaign settings", "Create an ad group", "Create an ad")

  def getStepContent(step: Int) = step match {
    case 0 => "Select campaign settings..."
    case 1 => "What is an ad group anyways?"
    case 2 => "This is the bit I really care about!"
    case _ => "Unknown stepIndex"
  }

  case class Props(style: StepperStyle)

  case class State(activeStep: Int = 0) {
    val isFinish = activeStep == steps.length

    val notFinish = !isFinish

    val isFinal = activeStep == steps.length - 1

    val nextTitle = if (isFinal) "Finish" else "Next"

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
        ComponentContainer("Horizontal Linear - Alternative Label")(
          div(css.root,
            MuiStepper(activeStep = state.activeStep, alternativeLabel = true)(
              steps.toVdomArray { label =>
                MuiStep()(Attr("key") := label,
                  MuiStepLabel()(label)
                )
              }
            ),
            div(
              div(
                MuiTypography()(css.instructions, "All steps completed"),
                MuiButton()(onClick --> handleReset, "Reset")
              ).when(state.isFinish),
              div(
                MuiTypography()(css.instructions, getStepContent(state.activeStep)),
                div(
                  MuiButton()(css.button, onClick --> handleBack, disabled := state.isBackDisabled, "Back"),
                  MuiButton(
                    variant = MuiButton.Variant.contained,
                    color = MuiButton.Color.primary,
                  )(onClick --> handleNext, state.nextTitle)
                )
              ).when(state.notFinish)
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("HorizontalLabelPositionBelowStepper")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: StepperStyle = DefaultStepperStyle) = component(Props(style))
}
