package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiButton extends ReactBridgeComponent with MuiButtonExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Button")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    color: Color.Value = Color.default,
    component: Option[String | js.Function] = Some("button"),
    disabled: Boolean = false,
    disableFocusRipple: Boolean = false,
    disableRipple: Option[Boolean] = None,
    fullWidth: Boolean = false,
    href: Option[String] = None,
    mini: Boolean = false,
    size: Size.Value = Size.medium,
    variant: Variant.Value = Variant.text
  ): WithProps = auto
}

trait MuiButtonExtensions {
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
    val text = Value("text")
    val outlined = Value("outlined")
    val contained = Value("contained")
    val fab = Value("fab")
    val extendedFab = Value("extendedFab")
    val flat = Value("flat")
    val raised = Value("raised")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val label = "label"
    val text = "text"
    val textPrimary = "textPrimary"
    val textSecondary = "textSecondary"
    val flat = "flat"
    val flatPrimary = "flatPrimary"
    val flatSecondary = "flatSecondary"
    val outlined = "outlined"
    val outlinedPrimary = "outlinedPrimary"
    val outlinedSecondary = "outlinedSecondary"
    val contained = "contained"
    val containedPrimary = "containedPrimary"
    val containedSecondary = "containedSecondary"
    val raised = "raised"
    val raisedPrimary = "raisedPrimary"
    val raisedSecondary = "raisedSecondary"
    val fab = "fab"
    val extendedFab = "extendedFab"
    val focusVisible = "focusVisible"
    val disabled = "disabled"
    val colorInherit = "colorInherit"
    val mini = "mini"
    val sizeSmall = "sizeSmall"
    val sizeLarge = "sizeLarge"
    val fullWidth = "fullWidth"
  }
}
