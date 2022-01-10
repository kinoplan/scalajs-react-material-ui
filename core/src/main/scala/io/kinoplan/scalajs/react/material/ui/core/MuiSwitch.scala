package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import japgolly.scalajs.react.vdom.html_<^._

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

object MuiSwitch extends ReactBridgeComponent with MuiSwitchExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Switch")
  @js.native
  object RawComponent extends js.Function

  def apply(
    checked: js.UndefOr[Boolean | String] = js.undefined,
    checkedIcon: js.UndefOr[VdomNode] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    disableRipple: js.UndefOr[Boolean] = js.undefined,
    icon: js.UndefOr[VdomNode] = js.undefined,
    inputProps: js.UndefOr[js.Object] = js.undefined,
    inputRef: js.UndefOr[ComponentRefType] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined
  ): WithPropsNoChildren = autoNoChildren

}

trait MuiSwitchExtensions {

  object Color extends Enumeration {
    type Value = String

    val primary = "primary"
    val secondary = "secondary"
    val default = "default"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val icon = "icon"
    val iconChecked = "iconChecked"
    val switchBase = "switchBase"
    val checked = "checked"
    val colorPrimary = "colorPrimary"
    val colorSecondary = "colorSecondary"
    val disabled = "disabled"
    val bar = "bar"
  }

}
