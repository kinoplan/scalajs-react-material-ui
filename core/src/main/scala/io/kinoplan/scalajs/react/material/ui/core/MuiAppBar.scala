package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import io.kinoplan.scalajs.react.material.ui.core.internal.PaperClassKey

object MuiAppBar extends ReactBridgeComponent with MuiAppBarExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "AppBar")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    position: js.UndefOr[Position.Value] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    elevation: js.UndefOr[Int] = js.undefined,
    square: js.UndefOr[Boolean] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined
  ): WithProps = auto
}

trait MuiAppBarExtensions {
  object Color extends Enumeration {
    type Value = String

    val default = "default"
    val inherit = "inherit"
    val primary = "primary"
    val secondary = "secondary"
    val transparent = "transparent"
  }

  object Position extends Enumeration {
    type Value = String

    val absolute = "absolute"
    val fixed = "fixed"
    val relative = "relative"
    val static = "static"
    val sticky = "sticky"
  }

  object Variant extends Enumeration {
    type Value = String

    val elevation = "elevation"
    val outlined = "outlined"
  }

  object ClassKey extends Enumeration with PaperClassKey {
    type Value = String

    override val root = "root"
    val positionFixed = "positionFixed"
    val positionAbsolute = "positionAbsolute"
    val positionSticky = "positionSticky"
    val positionStatic = "positionStatic"
    val positionRelative = "positionRelative"
    val colorDefault = "colorDefault"
    val colorPrimary = "colorPrimary"
    val colorSecondary = "colorSecondary"
    val colorInherit = "colorInherit"
    val colorTransparent = "colorTransparent"
  }
}
