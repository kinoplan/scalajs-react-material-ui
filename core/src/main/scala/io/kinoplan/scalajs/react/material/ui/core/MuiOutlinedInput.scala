package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import japgolly.scalajs.react.vdom.html_<^._

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

object MuiOutlinedInput extends ReactBridgeComponent with MuiOutlinedInputExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "OutlinedInput")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    endAdornment: js.UndefOr[VdomNode] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    inputComponent: js.UndefOr[ComponentPropType] = js.undefined,
    inputProps: js.UndefOr[js.Object] = js.undefined,
    inputRef: js.UndefOr[ComponentRefType] = js.undefined,
    labelWidth: Int,
    margin: js.UndefOr[Margin.Value] = js.undefined,
    multiline: js.UndefOr[Boolean] = js.undefined,
    notched: js.UndefOr[Boolean] = js.undefined,
    rows: js.UndefOr[String | Int] = js.undefined,
    rowsMax: js.UndefOr[String | Int] = js.undefined,
    startAdornment: js.UndefOr[VdomNode] = js.undefined
  ): WithPropsNoChildren = autoNoChildren

}

trait MuiOutlinedInputExtensions {

  object Margin extends Enumeration {
    type Value = String

    val dense = "dense"
    val none = "none"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val focused = "focused"
    val disabled = "disabled"
    val adornedStart = "adornedStart"
    val adornedEnd = "adornedEnd"
    val error = "error"
    val multiline = "multiline"
    val notchedOutline = "notchedOutline"
    val input = "input"
    val inputMarginDense = "inputMarginDense"
    val inputMultiline = "inputMultiline"
    val inputAdornedStart = "inputAdornedStart"
    val inputAdornedEnd = "inputAdornedEnd"
    val formControl = "formControl"
    val marginDense = "marginDense"
    val fullWidth = "fullWidth"
    val inputType = "inputType"
    val inputTypeSearch = "inputTypeSearch"
  }

}
