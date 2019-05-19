package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiFab extends ReactBridgeComponent with MuiFabExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Fab")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
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

trait MuiFabExtensions {
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

  object ClassKey extends Enumeration {
    type ClassKey = String

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
