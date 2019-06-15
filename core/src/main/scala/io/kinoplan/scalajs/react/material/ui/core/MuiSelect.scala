package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.ReactEventFromHtml
import japgolly.scalajs.react.raw.React

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiSelect extends ReactBridgeComponent with MuiSelectExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Select")
  @js.native
  object RawComponent extends js.Function

  def apply(
    autoWidth: Boolean = false,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    displayEmpty: Boolean = false,
    IconComponent: OptComponentPropType = js.undefined,
    input: Option[React.Node] = None,
    inputProps: Map[String, String] = Map.empty,
    MenuProps: Map[String, String] = Map.empty,
    multiple: Boolean = false,
    native: Boolean = false,
    onClose: ReactHandler1[ReactEventFromHtml] = js.undefined,
    onOpen: ReactHandler1[ReactEventFromHtml] = js.undefined,
    open: Option[Boolean] = None,
    renderValue: Option[js.Function] = None,
    SelectDisplayProps: js.Object = js.Object(),
    variant: Option[Variant.Value] = None
  ): WithProps = auto
}

trait MuiSelectExtensions {
  object Variant extends Enumeration {
    val standard = Value("standard")
    val outlined = Value("outlined")
    val filled = Value("filled")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val select = "select"
    val filled = "filled"
    val outlined = "outlined"
    val selectMenu = "selectMenu"
    val disabled = "disabled"
    val icon = "icon"
  }
}
