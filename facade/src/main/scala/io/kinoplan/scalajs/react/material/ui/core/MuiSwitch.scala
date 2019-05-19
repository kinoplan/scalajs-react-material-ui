package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiSwitch extends ReactBridgeComponent with MuiSwitchExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Switch")
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
    inputProps: js.Object = js.Object(),
    inputRef: Option[js.Function | js.Object] = None,
    onChange: Option[js.Function] = None,
    `type`: Option[String] = None,
    value: Option[String | Int | Boolean] = None
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiSwitchExtensions {
  object Color extends Enumeration {
    val primary = Value("primary")
    val secondary = Value("secondary")
    val default = Value("default")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val icon = "icon"
    val iconChecked = "iconChecked"
    val switchBase = "switchBase"
    val checked	= "checked"
    val colorPrimary = "colorPrimary"
    val colorSecondary = "colorSecondary"
    val disabled = "disabled"
    val bar = "bar"
  }
}
