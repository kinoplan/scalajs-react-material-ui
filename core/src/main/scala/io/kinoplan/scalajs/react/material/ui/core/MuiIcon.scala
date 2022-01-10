package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiIcon extends ReactBridgeComponent with MuiIconExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Icon")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    fontSize: js.UndefOr[FontSize.Value] = js.undefined
  ): WithProps = auto

}

trait MuiIconExtensions {

  object Color extends Enumeration {
    type Value = String

    val inherit = "inherit"
    val primary = "primary"
    val secondary = "secondary"
    val action = "action"
    val error = "error"
    val disabled = "disabled"
  }

  object FontSize extends Enumeration {
    type Value = String

    val inherit = "inherit"
    val default = "default"
    val small = "small"
    val large = "large"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val colorPrimary = "colorPrimary"
    val colorSecondary = "colorSecondary"
    val colorAction = "colorAction"
    val colorError = "colorError"
    val colorDisabled = "colorDisabled"
    val fontSizeInherit = "fontSizeInherit"
    val fontSizeSmall = "fontSizeSmall"
    val fontSizeLarge = "fontSizeLarge"
  }

}
