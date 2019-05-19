package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiInput extends ReactBridgeComponent with MuiInputExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Input")
  @js.native
  object RawComponent extends js.Function

  def apply(
    autoComplete: Option[String] = None,
    autoFocus: Option[Boolean] = None,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    className: Option[String] = None,
    defaultValue: Option[String | Int | Boolean | js.Object] = None,
    disabled: Option[Boolean] = None,
    disableUnderline: Option[Boolean] = None,
    endAdornment: Option[VdomNode] = None,
    error: Option[Boolean] = None,
    fullWidth: Option[Boolean] = None,
    id: Option[String] = None,
    inputComponent: Option[String | js.Function] = None,
    inputProps: js.Object = js.Object(),
    inputRef: Option[js.Function | js.Object] = None,
    margin: Option[Margin.Value] = None,
    multiline: Option[Boolean] = None,
    name: Option[String] = None,
    onChange: Option[js.Function] = None,
    placeholder: Option[String] = None,
    readOnly: Option[Boolean] = None,
    required: Option[Boolean] = None,
    rows: Option[String | Int] = None,
    rowsMax: Option[String | Int] = None,
    startAdornment: Option[VdomNode] = None,
    `type`: Option[String] = None,
    value: Option[String | Int | Boolean | js.Object] = None
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiInputExtensions {
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
    val underline = "underline"
    val error = "error"
    val multiline = "multiline"
    val fullWidth = "fullWidth"
    val input = "input"
    val inputMarginDense = "inputMarginDense"
    val inputMultiline = "inputMultiline"
    val inputType = "inputType"
    val inputTypeSearch = "inputTypeSearch"
  }
}
