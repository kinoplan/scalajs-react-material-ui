package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiStep extends ReactBridgeComponent with MuiStepExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Step")
  @js.native
  object RawComponent extends js.Function

  def apply(
    active: Boolean = false,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    completed: Boolean = false,
    disabled: Boolean = false
  ): WithProps = auto
}

trait MuiStepExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val horizontal = "horizontal"
    val vertical = "vertical"
    val alternativeLabel = "alternativeLabel"
    val completed = "completed"
  }
}
