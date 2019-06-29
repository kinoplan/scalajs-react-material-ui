package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import japgolly.scalajs.react.raw.React.RefFn
import japgolly.scalajs.react.vdom.all._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiCheckbox extends ReactBridgeComponent with MuiCheckboxExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Checkbox")
  @js.native
  object RawComponent extends js.Function

  def apply(
    checkedIcon: Option[VdomNode] = None,
    classes: Map[ClassKey.Value, String] = Map.empty,
    color: Color.Value = Color.secondary,
    disableRipple: Option[Boolean] = None,
    icon: Option[VdomNode] = None,
    indeterminate: Boolean = false,
    indeterminateIcon: Option[VdomNode] = None,
    inputProps: Map[String, String] = Map.empty,
    inputRef: js.UndefOr[RefFn[String]] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiCheckboxExtensions {
  object Color extends Enumeration {
    val primary = Value("primary")
    val secondary = Value("secondary")
    val default = Value("default")
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val checked = "checked"
    val disabled = "disabled"
    val indeterminate = "indeterminate"
    val colorPrimary = "colorPrimary"
    val colorSecondary = "colorSecondary"
  }
}
