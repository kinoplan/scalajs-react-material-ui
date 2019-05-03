package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.raw.React

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Stepper extends ReactBridgeComponent with StepperExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Stepper")
  @js.native
  object RawComponent extends js.Function

  def apply(
    activeStep: Int = 0,
    alternativeLabel: Boolean = false,
    classes: js.Object = js.Object(),
    connector: Option[React.Element] = None,
    nonLinear: Boolean = false,
    orientation: Orientation.Value = Orientation.horizontal
  ): WithProps = auto
}

trait StepperExtensions {
  object Orientation extends Enumeration {
    val horizontal = Value("horizontal")
    val vertical = Value("vertical")
  }
}
