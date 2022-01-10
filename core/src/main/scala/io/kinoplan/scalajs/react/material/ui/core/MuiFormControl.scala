package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiFormControl extends ReactBridgeComponent with MuiFormControlExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "FormControl")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    margin: js.UndefOr[Margin.Value] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined
  ): WithProps = auto

}

trait MuiFormControlExtensions {

  object Margin extends Enumeration {
    type Value = String

    val none = "none"
    val dense = "dense"
    val normal = "normal"
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
    val marginNormal = "marginNormal"
    val marginDense = "marginDense"
    val fullWidth = "fullWidth"
  }

}
