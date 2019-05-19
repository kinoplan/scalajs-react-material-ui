package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiStepConnector extends ReactBridgeComponent with MuiStepConnectorExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "StepConnector")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiStepConnectorExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

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
