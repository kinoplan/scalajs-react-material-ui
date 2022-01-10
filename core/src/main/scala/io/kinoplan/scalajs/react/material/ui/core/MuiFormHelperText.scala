package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiFormHelperText extends ReactBridgeComponent with MuiFormHelperTextExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "FormHelperText")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    filled: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    margin: js.UndefOr[Margin.Value] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined
  ): WithProps = auto

}

trait MuiFormHelperTextExtensions {

  object Margin extends Enumeration {
    type Value = String

    val dense = "dense"
  }

  object Variant extends Enumeration {
    type Value = String

    val standard = "standard"
    val outlined = "outlined"
    val filled = "filled"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val error = "error"
    val disabled = "disabled"
    val marginDense = "marginDense"
    val contained = "contained"
    val focused = "focused"
    val filled = "filled"
    val required = "required"
  }

}
