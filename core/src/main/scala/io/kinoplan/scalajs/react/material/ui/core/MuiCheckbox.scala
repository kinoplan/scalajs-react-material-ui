package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiCheckbox extends ReactBridgeComponent with MuiCheckboxExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Checkbox")
  @js.native
  object RawComponent extends js.Function

  def apply(
    checked: Option[Boolean | String] = None,
    checkedIcon: Option[VdomNode] = None,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    color: Color.Value = Color.secondary,
    disabled: Option[Boolean] = None,
    disableRipple: Option[Boolean] = None,
    icon: Option[VdomNode] = None,
    id: Option[String] = None,
    indeterminate: Boolean = false,
    indeterminateIcon: Option[VdomNode] = None,
    inputProps: js.Object = js.Object(),
    inputRef: Option[js.Function | js.Object] = None,
    onChange: Option[js.Function] = None,
    `type`: Option[String] = None,
    value: Option[String] = None
  ): WithProps = auto
}

trait MuiCheckboxExtensions {
  object Color extends Enumeration {
    val primary = Value("primary")
    val secondary = Value("secondary")
    val default = Value("default")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val checked = "checked"
    val disabled = "disabled"
    val indeterminate = "indeterminate"
    val colorPrimary = "colorPrimary"
    val colorSecondary = "colorSecondary"
  }
}
