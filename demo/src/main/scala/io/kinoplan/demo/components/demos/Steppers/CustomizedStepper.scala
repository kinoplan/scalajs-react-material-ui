package io.kinoplan.demo.components.demos.Steppers

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Steppers.{CustomizedStepperStyle, DefaultCustomizedStepperStyle}
import io.kinoplan.demo.utils.Helpers.styleAToClassName
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiStep, MuiStepConnector, MuiStepLabel, MuiStepper, MuiTypography}

object CustomizedStepper extends ScalaCssReactImplicits {
  val steps = List("Select campaign settings", "Create an ad group", "Create an ad")

  def getStepContent(step: Int) = step match {
    case 0 => "Select campaign settings..."
    case 1 => "What is an ad group anyways?"
    case 2 => "This is the bit I really care about!"
    case _ => "Unknown step"
  }

  case class Props(style: CustomizedStepperStyle)

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

      val connectorClasses = Map(
        MuiStepConnector.ClassKey.active -> styleAToClassName(css.connectorActive),
        MuiStepConnector.ClassKey.completed -> styleAToClassName(css.connectorCompleted),
        MuiStepConnector.ClassKey.disabled -> styleAToClassName(css.connectorDisabled),
        MuiStepConnector.ClassKey.line -> styleAToClassName(css.connectorLine)
      )

      val connector = MuiStepConnector(classes = connectorClasses).rawElement

      div(
        ComponentContainer("Customized Stepper")(
          div(css.root,
            MuiStepper(activeStep = state.activeStep, connector = connector)(
              steps.toVdomArray { label =>
                MuiStep()(Attr("key") := label,
                  MuiStepLabel()(label)
                )
              }
            ),
            MuiStepper(alternativeLabel = true, activeStep = state.activeStep, connector = connector)(
              steps.toVdomArray { label =>
                MuiStep()(Attr("key") := label,
                  MuiStepLabel()(label)
                )
              }
            ),
            div(
              div(
                MuiTypography()(css.instructions, "All steps completed - you're finished"),
                MuiButton()(css.button, onClick --> handleReset, "Reset")
              ).when(state.isTotalStep),
              div(
                MuiTypography()(css.instructions, getStepContent(state.activeStep)),
                div(
                  MuiButton()(css.button, onClick --> handleBack, disabled := state.isBackDisabled, "Back"),
                  MuiButton(
                    variant = MuiButton.Variant.contained,
                    color = MuiButton.Color.primary,
                  )(onClick --> handleNext, state.nextTitle)
                )
              ).when(state.notTotalStep)
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("CustomizedStepper")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: CustomizedStepperStyle = DefaultCustomizedStepperStyle) = component(Props(style))
}
