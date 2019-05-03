package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object TextField extends ReactBridgeComponent with TextFieldExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "TextField")
  @js.native
  object RawComponent extends js.Function

  def apply(
    autoComplete: Option[String] = None,
    autoFocus: Option[Boolean] = None,
    defaultValue: Option[String | Int] = None,
    disabled: Option[Boolean] = None,
    error: Option[Boolean] = None,
    FormHelperTextProps: js.Object = js.Object(),
    fullWidth: Option[Boolean] = None,
    helperText: Option[VdomNode] = None,
    id: Option[String] = None,
    InputLabelProps: js.Object = js.Object(),
    InputProps: js.Object = js.Object(),
    inputProps: js.Object = js.Object(),
    inputRef: Option[js.Function | js.Object] = None,
    label: Option[VdomNode] = None,
    margin: Option[Margin.Value] = None,
    multiline: Option[Boolean] = None,
    name: Option[String] = None,
    onChange: Option[js.Function] = None,
    placeholder: Option[String] = None,
    required: Boolean = false,
    rows: Option[String | Int] = None,
    rowsMax: Option[String | Int] = None,
    select: Boolean = false,
    SelectProps: js.Object = js.Object(),
    `type`: Option[String] = None,
    value: Option[String | Int | Boolean] = None,
    variant: Variant.Value = Variant.standard
  ): WithProps = auto
}

trait TextFieldExtensions {
  object Margin extends Enumeration {
    val none = Value("none")
    val dense = Value("dense")
    val normal = Value("normal")
  }

  object Variant extends Enumeration {
    val standard = Value("standard")
    val outlined = Value("outlined")
    val filled = Value("filled")
  }
}
