package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiInputBase extends ReactBridgeComponent with MuiInputBaseExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "InputBase")
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
    fullWidth: Boolean = false,
    id: Option[String] = None,
    inputComponent: Option[String | js.Function] = Some("input"),
    inputProps: js.Object = js.Object(),
    inputRef: Option[js.Function | js.Object] = None,
    margin: Option[Margin.Value] = None,
    multiline: Boolean = false,
    name: Option[String] = None,
    onChange: Option[js.Function] = None,
    placeholder: Option[String] = None,
    readOnly: Option[Boolean] = None,
    required: Option[Boolean] = None,
    rows: Option[String | Int] = None,
    rowsMax: Option[String | Int] = None,
    startAdornment: Option[VdomNode] = None,
    `type`: String = "text",
    value: Option[String | Int | Boolean | js.Object] = None
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiInputBaseExtensions {
  object Margin extends Enumeration {
    val dense = Value("dense")
    val none = Value("none")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val formControl = "formControl"
    val focused = "focused"
    val disabled = "disabled"
    val adornedStart = "adornedStart"
    val adornedEnd = "adornedEnd"
    val error = "error"
    val marginDense = "marginDense"
    val multiline = "multiline"
    val fullWidth = "fullWidth"
    val input = "input"
    val inputMarginDense = "inputMarginDense"
    val inputMultiline = "inputMultiline"
    val inputType = "inputType"
    val inputTypeSearch = "inputTypeSearch"
    val inputAdornedStart = "inputAdornedStart"
    val inputAdornedEnd = "inputAdornedEnd"
  }
}
