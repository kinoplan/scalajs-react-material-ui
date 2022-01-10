package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiIconButton extends ReactBridgeComponent with MuiIconButtonExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "IconButton")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    disableRipple: js.UndefOr[Boolean] = js.undefined,
    action: js.UndefOr[js.Function] = js.undefined,
    buttonRef: js.UndefOr[ComponentRefType] = js.undefined,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    focusRipple: js.UndefOr[Boolean] = js.undefined,
    focusVisibleClassName: js.UndefOr[String] = js.undefined,
    onFocusVisible: js.UndefOr[js.Function] = js.undefined,
    TouchRippleProps: js.UndefOr[js.Object] = js.undefined
  ): WithProps = auto

}

trait MuiIconButtonExtensions {

  object Color extends Enumeration {
    type Value = String

    val default = "default"
    val inherit = "inherit"
    val primary = "primary"
    val secondary = "secondary"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val colorInherit = "colorInherit"
    val colorPrimary = "colorPrimary"
    val colorSecondary = "colorSecondary"
    val disabled = "disabled"
    val label = "label"
    val focusVisible = "focusVisible"
  }

}
