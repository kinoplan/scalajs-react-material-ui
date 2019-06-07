package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiStepContent extends ReactBridgeComponent with MuiStepContentExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "StepContent")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    TransitionComponent: Option[String | js.Function] = Some("Collapse"),
    transitionDuration: Option[Int | js.Object | TransitionDuration.Value] = Some(TransitionDuration.auto),
    TransitionProps: js.Object = js.Object()
  ): WithProps = auto
}

trait MuiStepContentExtensions {
  object TransitionDuration extends Enumeration {
    val auto = Value("auto")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val last = "last"
    val transition = "transition"
  }
}