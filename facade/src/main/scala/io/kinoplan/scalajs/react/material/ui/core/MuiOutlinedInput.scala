package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiOutlinedInput extends ReactBridgeComponent with MuiOutlinedInputExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "OutlinedInput")
  @js.native
  object RawComponent extends js.Function

  def apply(
    autoComplete: Option[String] = None,
    autoFocus: Option[Boolean] = None,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    className: Option[String] = None,
    defaultValue: Option[String | Int | Boolean | js.Object] = None,
    disabled: Option[Boolean] = None,
    endAdornment: Option[VdomNode] = None,
    error: Option[Boolean] = None,
    fullWidth: Option[Boolean] = None,
    id: Option[String] = None,
    inputComponent: Option[String | js.Function] = None,
    inputProps: js.Object = js.Object(),
    inputRef: Option[js.Function | js.Object] = None,
    labelWidth: Int,
    margin: Option[Margin.Value] = None,
    multiline: Option[Boolean] = None,
    name: Option[String] = None,
    notched: Option[Boolean] = None,
    onChange: Option[js.Function] = None,
    placeholder: Option[String] = None,
    readOnly: Option[Boolean] = None,
    required: Option[Boolean] = None,
    rows: Option[String | Int] = None,
    rowsMax: Option[String | Int] = None,
    startAdornment: Option[VdomNode] = None,
    `type`: Option[String] = None,
    value: Option[String | Int | Boolean | js.Object] = None
  ): WithProps = auto
}

trait MuiOutlinedInputExtensions {
  object Margin extends Enumeration {
    val dense = Value("dense")
    val none = Value("none")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

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
  }
}
