package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object StepContent extends ReactBridgeComponent with StepContentExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "StepContent")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.Object = js.Object(),
    TransitionComponent: Option[String | js.Function] = Some("Collapse"),
    transitionDuration: Option[Int | js.Object | TransitionDuration.Value] = Some(TransitionDuration.auto),
    TransitionProps: js.Object = js.Object()
  ): WithProps = auto
}

trait StepContentExtensions {
  object TransitionDuration extends Enumeration {
    val auto = Value("auto")
  }
}