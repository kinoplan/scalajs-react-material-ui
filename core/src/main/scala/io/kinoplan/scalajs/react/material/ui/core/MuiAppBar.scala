package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiAppBar extends ReactBridgeComponent with MuiAppBarExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "AppBar")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    position: js.UndefOr[Position.Value] = js.undefined
  ): WithProps = auto
}

trait MuiAppBarExtensions {
  object Color extends Enumeration {
    type Value = String

    val inherit = "inherit"
    val primary = "primary"
    val secondary = "secondary"
    val default = "default"
  }

  object Position extends Enumeration {
    type Value = String

    val fixed = "fixed"
    val absolute = "absolute"
    val sticky = "sticky"
    val static = "static"
    val relative = "relative"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val positionFixed = "positionFixed"
    val positionAbsolute = "positionAbsolute"
    val positionSticky = "positionSticky"
    val positionStatic = "positionStatic"
    val positionRelative = "positionRelative"
    val colorDefault = "colorDefault"
    val colorPrimary = "colorPrimary"
    val colorSecondary = "colorSecondary"
  }
}
