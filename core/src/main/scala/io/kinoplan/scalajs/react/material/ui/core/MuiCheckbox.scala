package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.all._

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

object MuiCheckbox extends ReactBridgeComponent with MuiCheckboxExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Checkbox")
  @js.native
  object RawComponent extends js.Function

  def apply(
    checkedIcon: js.UndefOr[VdomNode] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    disableRipple: js.UndefOr[Boolean] = js.undefined,
    icon: js.UndefOr[VdomNode] = js.undefined,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    indeterminateIcon: js.UndefOr[VdomNode] = js.undefined,
    inputProps: js.UndefOr[js.Object] = js.undefined,
    inputRef: js.UndefOr[ComponentRefType] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined
  ): WithPropsNoChildren = autoNoChildren

}

trait MuiCheckboxExtensions {

  object Color extends Enumeration {
    type Value = String

    val primary = "primary"
    val secondary = "secondary"
    val default = "default"
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
