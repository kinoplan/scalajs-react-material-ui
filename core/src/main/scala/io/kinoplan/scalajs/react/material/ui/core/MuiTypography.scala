package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiTypography extends ReactBridgeComponent with MuiTypographyExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Typography")
  @js.native
  object RawComponent extends js.Function

  def apply(
    align: js.UndefOr[Alignment.Value] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    gutterBottom: js.UndefOr[Boolean] = js.undefined,
    headlineMapping: js.UndefOr[js.Object] = js.undefined,
    inline: js.UndefOr[Boolean] = js.undefined,
    internalDeprecatedVariant: js.UndefOr[Boolean] = js.undefined,
    noWrap: js.UndefOr[Boolean] = js.undefined,
    paragraph: js.UndefOr[Boolean] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined
  ): WithProps = auto

}

trait MuiTypographyExtensions {

  object Alignment extends Enumeration {
    type Value = String

    val inherit = "inherit"
    val left = "left"
    val center = "center"
    val right = "right"
    val justify = "justify"
  }

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

  object Variant extends Enumeration {
    type Value = String

    val h1 = "h1"
    val h2 = "h2"
    val h3 = "h3"
    val h4 = "h4"
    val h5 = "h5"
    val h6 = "h6"
    val subtitle1 = "subtitle1"
    val subtitle2 = "subtitle2"
    val body1 = "body1"
    val body2 = "body2"
    val caption = "caption"
    val button = "button"
    val overline = "overline"
    val srOnly = "srOnly"
    val inherit = "inherit"
    val display4 = "display4"
    val display3 = "display3"
    val display2 = "display2"
    val display1 = "display1"
    val headline = "headline"
    val title = "title"
    val subheading = "subheading"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val display4 = "display4"
    val display3 = "display3"
    val display2 = "display2"
    val display1 = "display1"
    val headline = "headline"
    val title = "title"
    val subheading = "subheading"
    val body2 = "body2"
    val body1 = "body1"
    val caption = "caption"
    val button = "button"
    val h1 = "h1"
    val h2 = "h2"
    val h3 = "h3"
    val h4 = "h4"
    val h5 = "h5"
    val h6 = "h6"
    val subtitle1 = "subtitle1"
    val subtitle2 = "subtitle2"
    val overline = "overline"
    val srOnly = "srOnly"
    val alignLeft = "alignLeft"
    val alignCenter = "alignCenter"
    val alignRight = "alignRight"
    val alignJustify = "alignJustify"
    val noWrap = "noWrap"
    val gutterBottom = "gutterBottom"
    val paragraph = "paragraph"
    val colorInherit = "colorInherit"
    val colorPrimary = "colorPrimary"
    val colorSecondary = "colorSecondary"
    val colorTextPrimary = "colorTextPrimary"
    val colorTextSecondary = "colorTextSecondary"
    val colorError = "colorError"
    val inline = "inline"
  }

}
