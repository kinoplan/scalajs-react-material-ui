package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

object MuiStepConnector extends ReactBridgeComponent with MuiStepConnectorExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "StepConnector")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined
  ): WithPropsNoChildren = autoNoChildren

}

trait MuiStepConnectorExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val horizontal = "horizontal"
    val vertical = "vertical"
    val alternativeLabel = "alternativeLabel"
    val active = "active"
    val completed = "completed"
    val disabled = "disabled"
    val line = "line"
    val lineHorizontal = "lineHorizontal"
    val lineVertical = "lineVertical"
  }

}
