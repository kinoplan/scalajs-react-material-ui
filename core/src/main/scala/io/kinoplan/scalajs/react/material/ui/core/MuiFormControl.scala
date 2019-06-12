package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiFormControl extends ReactBridgeComponent with MuiFormControlExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "FormControl")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    component: OptComponentPropType = "div",
    disabled: Boolean = false,
    error: Boolean = false,
    fullWidth: Boolean = false,
    margin: Margin.Value = Margin.none,
    required: Boolean = false,
    variant: Variant.Value = Variant.standard
  ): WithProps = auto
}

trait MuiFormControlExtensions {
  object Margin extends Enumeration {
    val none = Value("none")
    val dense = Value("dense")
    val normal = Value("normal")
  }

  object Variant extends Enumeration {
    val standard = Value("standard")
    val outlined = Value("outlined")
    val filled = Value("filled")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val marginNormal = "marginNormal"
    val marginDense = "marginDense"
    val fullWidth = "fullWidth"
  }
}
