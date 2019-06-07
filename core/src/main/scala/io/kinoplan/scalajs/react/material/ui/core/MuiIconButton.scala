package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiIconButton extends ReactBridgeComponent with MuiIconButtonExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "IconButton")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    color: Color.Value = Color.default,
    disabled: Boolean = false,
    disableRipple: Option[Boolean] = None
  ): WithProps = auto
}

trait MuiIconButtonExtensions {
  object Color extends Enumeration {
    val default = Value("default")
    val inherit = Value("inherit")
    val primary = Value("primary")
    val secondary = Value("secondary")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val colorInherit = "colorInherit"
    val colorPrimary = "colorPrimary"
    val colorSecondary = "colorSecondary"
    val disabled = "disabled"
    val label = "label"
  }
}
