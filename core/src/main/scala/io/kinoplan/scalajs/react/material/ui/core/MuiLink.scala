package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiLink extends ReactBridgeComponent with MuiLinkExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Link")
  @js.native
  object RawComponent extends js.Function

  def apply(
    block: js.UndefOr[Boolean] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    color: js.UndefOr[Color.Value]= js.undefined,
    component: OptComponentPropType = js.undefined,
    TypographyClasses: js.UndefOr[js.Object] = js.undefined,
    underline: js.UndefOr[Underline.Value] = js.undefined,
    variant: js.UndefOr[String] = js.undefined
  ): WithProps = auto
}

trait MuiLinkExtensions {
  object Color extends Enumeration {
    type Value = String

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

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val underlineNone = "underlineNone"
    val underlineHover = "underlineHover"
    val underlineAlways = "underlineAlways"
    val button = "button"
  }
}
