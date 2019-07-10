package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiFab extends ReactBridgeComponent with MuiFabExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Fab")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    component: OptComponentPropType = js.undefined,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disableRipple: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Size.Value] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined
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
