package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiMobileStepper extends ReactBridgeComponent with MuiMobileStepperExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "MobileStepper")
  @js.native
  object RawComponent extends js.Function

  def apply(
    activeStep: Int = 0,
    backButton: Option[VdomNode] = None,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    LinearProgressProps: js.Object = js.Object(),
    nextButton: Option[VdomNode] = None,
    position: Position.Value = Position.bottom,
    steps: Int,
    variant: Variant.Value = Variant.dots
  ): WithProps = auto
}

trait MuiMobileStepperExtensions {
  object Position extends Enumeration {
    val bottom = Value("bottom")
    val top = Value("top")
    val static = Value("static")
  }

  object Variant extends Enumeration {
    val text = Value("text")
    val dots = Value("dots")
    val progress = Value("progress")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val positionBottom = "positionBottom"
    val positionTop = "positionTop"
    val positionStatic = "positionStatic"
    val dots = "dots"
    val dot = "dot"
    val dotActive = "dotActive"
    val progress = "progress"
  }
}
