package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.ReactEventFromInput
import japgolly.scalajs.react.raw.React

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiSelect extends ReactBridgeComponent with MuiSelectExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Select")
  @js.native
  object RawComponent extends js.Function

  def apply(
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    displayEmpty: js.UndefOr[Boolean] = js.undefined,
    IconComponent: OptComponentPropType = js.undefined,
    input: js.UndefOr[React.Element] = js.undefined,
    inputProps: js.UndefOr[js.Object] = js.undefined,
    MenuProps: js.UndefOr[js.Object] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    native: js.UndefOr[Boolean] = js.undefined,
    onClose: ReactHandler1[ReactEventFromInput] = js.undefined,
    onOpen: ReactHandler1[ReactEventFromInput] = js.undefined,
    open: js.UndefOr[Boolean] = js.undefined,
    renderValue: OptRenderValueType = js.undefined,
    SelectDisplayProps: js.UndefOr[js.Object] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined
  ): WithProps = auto
}

trait MuiSelectExtensions {
  object Variant extends Enumeration {
    type Value = String

    val standard = "standard"
    val outlined = "outlined"
    val filled = "filled"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val select = "select"
    val filled = "filled"
    val outlined = "outlined"
    val selectMenu = "selectMenu"
    val disabled = "disabled"
    val icon = "icon"
  }
}
