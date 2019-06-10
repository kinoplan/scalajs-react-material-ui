package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiTypography extends ReactBridgeComponent with MuiTypographyExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Typography")
  @js.native
  object RawComponent extends js.Function

  def apply(
    align: Alignment.Value = Alignment.inherit,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    color: Color.Value = Color.default,
    component: OptComponentPropType = js.undefined,
    gutterBottom: Boolean = false,
    headlineMapping: js.Object = js.Object(),
    inline: Boolean = false,
    internalDeprecatedVariant: Option[Boolean] = None,
    noWrap: Boolean = false,
    paragraph: Boolean = false,
    variant: Variant.Value = Variant.body2
  ): WithProps = auto
}

trait MuiTypographyExtensions {
  object Alignment extends Enumeration {
    val inherit = Value("inherit")
    val left = Value("left")
    val center = Value("center")
    val right = Value("right")
    val justify = Value("justify")
  }

  object Color extends Enumeration {
    val default = Value("default")
    val error = Value("error")
    val inherit = Value("inherit")
    val primary = Value("primary")
    val secondary = Value("secondary")
    val textPrimary = Value("textPrimary")
    val textSecondary = Value("textSecondary")
  }

  object Variant extends Enumeration {
    val h1 = Value("h1")
    val h2 = Value("h2")
    val h3 = Value("h3")
    val h4 = Value("h4")
    val h5 = Value("h5")
    val h6 = Value("h6")
    val subtitle1 = Value("subtitle1")
    val subtitle2 = Value("subtitle2")
    val body1 = Value("body1")
    val body2 = Value("body2")
    val caption = Value("caption")
    val button = Value("button")
    val overline = Value("overline")
    val srOnly = Value("srOnly")
    val inherit = Value("inherit")
    val display4 = Value("display4")
    val display3 = Value("display3")
    val display2 = Value("display2")
    val display1 = Value("display1")
    val headline = Value("headline")
    val title = Value("title")
    val subheading = Value("subheading")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

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
