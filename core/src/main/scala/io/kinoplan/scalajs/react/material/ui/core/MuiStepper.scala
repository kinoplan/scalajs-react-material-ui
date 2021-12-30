package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.facade.React

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import io.kinoplan.scalajs.react.material.ui.core.internal.PaperClassKey

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
    orientation: js.UndefOr[Orientation.Value] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    elevation: js.UndefOr[Int] = js.undefined,
    square: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto
}

trait MuiStepperExtensions {
  object Orientation extends Enumeration {
    type Value = String

    val horizontal = "horizontal"
    val vertical = "vertical"
  }

  object ClassKey extends Enumeration with PaperClassKey {
    type Value = String

    override val root = "root"
    val horizontal = "horizontal"
    val vertical = "vertical"
    val alternativeLabel = "alternativeLabel"
  }
}
