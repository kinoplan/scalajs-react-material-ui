package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import japgolly.scalajs.react.vdom.html_<^._

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiTextField extends ReactBridgeComponent with MuiTextFieldExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "TextField")
  @js.native
  object RawComponent extends js.Function

  def apply(
    error: js.UndefOr[Boolean] = js.undefined,
    FormHelperTextProps: js.UndefOr[js.Object] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    helperText: js.UndefOr[VdomNode] = js.undefined,
    InputLabelProps: js.UndefOr[js.Object] = js.undefined,
    InputProps: js.UndefOr[js.Object] = js.undefined,
    inputProps: js.UndefOr[js.Object] = js.undefined,
    inputRef: js.UndefOr[ComponentRefType] = js.undefined,
    label: js.UndefOr[VdomNode] = js.undefined,
    margin: js.UndefOr[Margin.Value] = js.undefined,
    multiline: js.UndefOr[Boolean] = js.undefined,
    rows: js.UndefOr[String | Int] = js.undefined,
    rowsMax: js.UndefOr[String | Int] = js.undefined,
    select: js.UndefOr[Boolean] = js.undefined,
    SelectProps: js.UndefOr[js.Object] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined
  ): WithProps = auto

}

trait MuiTextFieldExtensions {

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
