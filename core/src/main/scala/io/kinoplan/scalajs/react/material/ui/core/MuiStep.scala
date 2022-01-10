package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiStep extends ReactBridgeComponent with MuiStepExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Step")
  @js.native
  object RawComponent extends js.Function

  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    completed: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto

}

trait MuiStepExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val horizontal = "horizontal"
    val vertical = "vertical"
    val alternativeLabel = "alternativeLabel"
    val completed = "completed"
  }

}
