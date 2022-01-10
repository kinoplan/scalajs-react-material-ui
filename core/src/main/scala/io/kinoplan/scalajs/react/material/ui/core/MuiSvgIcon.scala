package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiSvgIcon extends ReactBridgeComponent with MuiSvgIconExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "SvgIcon")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    fontSize: js.UndefOr[FontSize.Value] = js.undefined,
    nativeColor: js.UndefOr[String] = js.undefined,
    shapeRendering: js.UndefOr[String] = js.undefined,
    titleAccess: js.UndefOr[String] = js.undefined,
    viewBox: js.UndefOr[String] = js.undefined
  ): WithProps = auto

}

trait MuiSvgIconExtensions {

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
