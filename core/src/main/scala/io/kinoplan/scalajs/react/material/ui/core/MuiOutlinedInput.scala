package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
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
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    endAdornment: Option[VdomNode] = None,
    error: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    inputComponent: Option[String | js.Function] = None,
    inputProps: js.Object = js.Object(),
    inputRef: Option[js.Function | js.Object] = None,
    labelWidth: Int,
    margin: Option[Margin.Value] = None,
    multiline: Option[Boolean] = None,
    notched: js.UndefOr[Boolean] = js.undefined,
    rows: Option[String | Int] = None,
    rowsMax: Option[String | Int] = None,
    startAdornment: Option[VdomNode] = None
  ): WithPropsNoChildren = autoNoChildren
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
