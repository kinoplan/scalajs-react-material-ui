package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiStepContent extends ReactBridgeComponent with MuiStepContentExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "StepContent")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    TransitionComponent: js.UndefOr[ComponentPropType] = js.undefined,
    transitionDuration: js.UndefOr[Int | TransitionDuration.Value] = js.undefined,
    TransitionProps: js.UndefOr[js.Object] = js.undefined
  ): WithProps = auto

}

trait MuiStepContentExtensions {

  object TransitionDuration extends Enumeration {
    type Value = String

    val auto = "auto"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val last = "last"
    val transition = "transition"
  }

}
