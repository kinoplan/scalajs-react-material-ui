package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiInputLabel extends ReactBridgeComponent with MuiInputLabelExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "InputLabel")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    disableAnimation: Boolean = false,
    disabled: Option[Boolean] = None,
    error: Option[Boolean] = None,
    focused: Option[Boolean] = None,
    FormLabelClasses: js.Object = js.Object(),
    margin: Option[Margin.Value] = None,
    required: Option[Boolean] = None,
    shrink: Option[Boolean] = None,
    variant: Option[Variant.Value] = None
  ): WithProps = auto
}

trait MuiInputLabelExtensions {
  object Margin extends Enumeration {
    val dense = Value("dense")
  }

  object Variant extends Enumeration {
    val standard = Value("standard")
    val outlined = Value("outlined")
    val filled = Value("filled")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val focused = "focused"
    val disabled = "disabled"
    val error = "error"
    val required = "required"
    val formControl = "formControl"
    val marginDense = "marginDense"
    val shrink = "shrink"
    val animated = "animated"
    val filled = "filled"
    val outlined = "outlined"
  }
}
