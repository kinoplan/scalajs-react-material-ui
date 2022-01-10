package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiInputLabel extends ReactBridgeComponent with MuiInputLabelExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "InputLabel")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    disableAnimation: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    FormLabelClasses: js.UndefOr[js.Object] = js.undefined,
    margin: js.UndefOr[Margin.Value] = js.undefined,
    shrink: js.UndefOr[Boolean] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    filled: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto

}

trait MuiInputLabelExtensions {

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
    val asterisk = "asterisk"
  }

}
