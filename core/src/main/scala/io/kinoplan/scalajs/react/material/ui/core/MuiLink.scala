package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiLink extends ReactBridgeComponent with MuiLinkExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Link")
  @js.native
  object RawComponent extends js.Function

  def apply(
    block: js.UndefOr[Boolean] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    TypographyClasses: js.UndefOr[js.Object] = js.undefined,
    underline: js.UndefOr[Underline.Value] = js.undefined,
    variant: js.UndefOr[String] = js.undefined,
    align: js.UndefOr[Alignment.Value] = js.undefined,
    gutterBottom: js.UndefOr[Boolean] = js.undefined,
    headlineMapping: js.UndefOr[js.Object] = js.undefined,
    inline: js.UndefOr[Boolean] = js.undefined,
    internalDeprecatedVariant: js.UndefOr[Boolean] = js.undefined,
    noWrap: js.UndefOr[Boolean] = js.undefined,
    paragraph: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto

}

trait MuiLinkExtensions {

  object Color extends Enumeration {
    type Value = String

    val default = "default"
    val error = "error"
    val inherit = "inherit"
    val primary = "primary"
    val secondary = "secondary"
    val textPrimary = "textPrimary"
    val textSecondary = "textSecondary"
  }

  object Underline extends Enumeration {
    type Value = String

    val none = "none"
    val hover = "hover"
    val always = "always"
  }

  object Alignment extends Enumeration {
    type Value = String

    val inherit = "inherit"
    val left = "left"
    val center = "center"
    val right = "right"
    val justify = "justify"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val underlineNone = "underlineNone"
    val underlineHover = "underlineHover"
    val underlineAlways = "underlineAlways"
    val button = "button"
  }

}
