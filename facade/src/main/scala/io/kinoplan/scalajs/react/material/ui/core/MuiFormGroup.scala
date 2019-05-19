package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiFormGroup extends ReactBridgeComponent with MuiFormGroupExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "FormGroup")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    row: Boolean = false
  ): WithProps = auto
}

trait MuiFormGroupExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val row = "row"
  }
}
