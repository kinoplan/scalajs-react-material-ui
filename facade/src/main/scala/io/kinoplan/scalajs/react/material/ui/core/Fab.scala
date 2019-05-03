package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Fab extends ReactBridgeComponent with FabExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Fab")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.Object = js.Object(),
    color: Color.Value = Color.default,
    component: Option[String | js.Function] = Some("button"),
    disabled: Boolean = false,
    disableFocusRipple: Boolean = false,
    disableRipple: Option[Boolean] = None,
    href: Option[String] = None,
    size: Size.Value = Size.large,
    variant: Variant.Value = Variant.round
  ): WithProps = auto
}

trait FabExtensions {
  object Color extends Enumeration {
    val default = Value("default")
    val inherit = Value("inherit")
    val primary = Value("primary")
    val secondary = Value("secondary")
  }

  object Size extends Enumeration {
    val small = Value("small")
    val medium = Value("medium")
    val large = Value("large")
  }

  object Variant extends Enumeration {
    val round = Value("round")
    val extended = Value("extended")
  }
}
