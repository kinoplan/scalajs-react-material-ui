package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiFab extends ReactBridgeComponent with MuiFabExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Fab")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disableRipple: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Size.Value] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined,
    action: js.UndefOr[js.Function] = js.undefined,
    buttonRef: js.UndefOr[ComponentRefType] = js.undefined,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    focusRipple: js.UndefOr[Boolean] = js.undefined,
    focusVisibleClassName: js.UndefOr[String] = js.undefined,
    onFocusVisible: js.UndefOr[js.Function] = js.undefined,
    TouchRippleProps: js.UndefOr[js.Object] = js.undefined
  ): WithProps = auto

}

trait MuiFabExtensions {

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

    val round = "round"
    val extended = "extended"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val label = "label"
    val primary = "primary"
    val secondary = "secondary"
    val extended = "extended"
    val focusVisible = "focusVisible"
    val disabled = "disabled"
    val colorInherit = "colorInherit"
    val sizeSmall = "sizeSmall"
    val sizeMedium = "sizeMedium"
  }

}
