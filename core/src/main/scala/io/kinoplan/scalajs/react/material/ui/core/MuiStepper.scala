package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.raw.React

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiStepper extends ReactBridgeComponent with MuiStepperExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Stepper")
  @js.native
  object RawComponent extends js.Function

  def apply(
    activeStep: js.UndefOr[Int] = js.undefined,
    alternativeLabel: js.UndefOr[Boolean] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    connector: js.UndefOr[React.Element] = js.undefined,
    nonLinear: js.UndefOr[Boolean] = js.undefined,
    orientation: js.UndefOr[Orientation.Value] = js.undefined
  ): WithProps = auto
}

trait MuiStepperExtensions {
  object Orientation extends Enumeration {
    type Value = String

    val horizontal = "horizontal"
    val vertical = "vertical"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val horizontal = "horizontal"
    val vertical = "vertical"
    val alternativeLabel = "alternativeLabel"
  }
}
