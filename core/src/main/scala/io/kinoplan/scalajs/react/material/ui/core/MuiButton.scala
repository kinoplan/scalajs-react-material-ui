package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiButton extends ReactBridgeComponent with MuiButtonExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Button")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disableRipple: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    mini: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Size.Value] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined,
    buttonRef: js.UndefOr[ComponentRefType] = js.undefined,
    action: js.UndefOr[js.Function] = js.undefined,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    focusRipple: js.UndefOr[Boolean] = js.undefined,
    focusVisibleClassName: js.UndefOr[String] = js.undefined,
    onFocusVisible: js.UndefOr[js.Function] = js.undefined,
    TouchRippleProps: js.UndefOr[js.Object] = js.undefined
  ): WithProps = auto

}

trait MuiButtonExtensions {

  object Color extends Enumeration {
    type Value = String

    val default = "default"
    val inherit = "inherit"
    val primary = "primary"
    val secondary = "secondary"
  }

  object Size extends Enumeration {
    type Value = String

    val small = "small"
    val medium = "medium"
    val large = "large"
  }

  object Variant extends Enumeration {
    type Value = String

    val text = "text"
    val outlined = "outlined"
    val contained = "contained"
    val fab = "fab"
    val extendedFab = "extendedFab"
    val flat = "flat"
    val raised = "raised"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val label = "label"
    val text = "text"
    val textPrimary = "textPrimary"
    val textSecondary = "textSecondary"
    val flat = "flat"
    val flatPrimary = "flatPrimary"
    val flatSecondary = "flatSecondary"
    val outlined = "outlined"
    val outlinedPrimary = "outlinedPrimary"
    val outlinedSecondary = "outlinedSecondary"
    val contained = "contained"
    val containedPrimary = "containedPrimary"
    val containedSecondary = "containedSecondary"
    val raised = "raised"
    val raisedPrimary = "raisedPrimary"
    val raisedSecondary = "raisedSecondary"
    val fab = "fab"
    val extendedFab = "extendedFab"
    val focusVisible = "focusVisible"
    val disabled = "disabled"
    val colorInherit = "colorInherit"
    val mini = "mini"
    val sizeSmall = "sizeSmall"
    val sizeLarge = "sizeLarge"
    val fullWidth = "fullWidth"
  }

}
