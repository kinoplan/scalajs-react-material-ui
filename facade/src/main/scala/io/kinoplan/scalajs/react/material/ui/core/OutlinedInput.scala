package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object OutlinedInput extends ReactBridgeComponent with OutlinedInputExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "OutlinedInput")
  @js.native
  object RawComponent extends js.Function

  def apply(
    autoComplete: Option[String] = None,
    autoFocus: Option[Boolean] = None,
    classes: js.Object = js.Object(),
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

trait OutlinedInputExtensions {
  object Margin extends Enumeration {
    val dense = Value("dense")
    val none = Value("none")
  }
}
