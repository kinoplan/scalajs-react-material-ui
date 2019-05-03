package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MobileStepper extends ReactBridgeComponent with MobileStepperExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "MobileStepper")
  @js.native
  object RawComponent extends js.Function

  def apply(
    activeStep: Int = 0,
    backButton: Option[VdomNode] = None,
    classes: js.Object = js.Object(),
    LinearProgressProps: js.Object = js.Object(),
    nextButton: Option[VdomNode] = None,
    position: Position.Value = Position.bottom,
    steps: Int,
    variant: Variant.Value = Variant.dots
  ): WithProps = auto
}

trait MobileStepperExtensions {
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
}
