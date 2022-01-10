package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import io.kinoplan.scalajs.react.material.ui.core.internal.PaperClassKey

object MuiMobileStepper extends ReactBridgeComponent with MuiMobileStepperExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "MobileStepper")
  @js.native
  object RawComponent extends js.Function

  def apply(
    activeStep: js.UndefOr[Int] = js.undefined,
    backButton: js.UndefOr[VdomNode] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    LinearProgressProps: js.UndefOr[js.Object] = js.undefined,
    nextButton: js.UndefOr[VdomNode] = js.undefined,
    position: js.UndefOr[Position.Value] = js.undefined,
    steps: Int,
    variant: js.UndefOr[Variant.Value] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    elevation: js.UndefOr[Int] = js.undefined,
    square: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto

}

trait MuiMobileStepperExtensions {

  object Position extends Enumeration {
    type Value = String

    val bottom = "bottom"
    val top = "top"
    val static = "static"
  }

  object Variant extends Enumeration {
    type Value = String

    val text = "text"
    val dots = "dots"
    val progress = "progress"
  }

  object ClassKey extends Enumeration with PaperClassKey {
    type Value = String

    override val root = "root"
    val positionBottom = "positionBottom"
    val positionTop = "positionTop"
    val positionStatic = "positionStatic"
    val dots = "dots"
    val dot = "dot"
    val dotActive = "dotActive"
    val progress = "progress"
  }

}
