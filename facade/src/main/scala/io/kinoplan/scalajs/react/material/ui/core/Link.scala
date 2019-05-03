package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Link extends ReactBridgeComponent with LinkExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Link")
  @js.native
  object RawComponent extends js.Function

  def apply(
    block: Boolean = false,
    classes: js.Object = js.Object(),
    color: Color.Value = Color.primary,
    component: Option[String | js.Function] = Some("a"),
    TypographyClasses: js.Object = js.Object(),
    underline: Underline.Value = Underline.hover,
    variant: String = "inherit"
  ): WithProps = auto
}

trait LinkExtensions {
  object Color extends Enumeration {
    val error = Value("error")
    val inherit = Value("inherit")
    val primary = Value("primary")
    val secondary = Value("secondary")
    val textPrimary = Value("textPrimary")
    val textSecondary = Value("textSecondary")
  }

  object Underline extends Enumeration {
    val none = Value("none")
    val hover = Value("hover")
    val always = Value("always")
  }
}
