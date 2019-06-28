package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiTextField extends ReactBridgeComponent with MuiTextFieldExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "TextField")
  @js.native
  object RawComponent extends js.Function

  def apply(
    autoComplete: js.UndefOr[String] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    FormHelperTextProps: js.Object = js.Object(),
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    helperText: Option[VdomNode] = None,
    InputLabelProps: js.Object = js.Object(),
    InputProps: js.Object = js.Object(),
    inputProps: js.Object = js.Object(),
    inputRef: Option[js.Function | js.Object] = None,
    label: Option[VdomNode] = None,
    margin: js.UndefOr[Margin.Value] = js.undefined,
    multiline: js.UndefOr[Boolean] = js.undefined,
    onChange: js.UndefOr[js.Function] = js.undefined,
    rows: js.UndefOr[String | Int] = js.undefined,
    rowsMax: js.UndefOr[String | Int] = js.undefined,
    select: Boolean = false,
    SelectProps: js.Object = js.Object(),
    variant: Variant.Value = Variant.standard
  ): WithProps = auto
}

trait MuiTextFieldExtensions {
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
