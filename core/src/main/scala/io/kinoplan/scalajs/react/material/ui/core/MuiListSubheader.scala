package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiListSubheader extends ReactBridgeComponent with MuiListSubheaderExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "ListSubheader")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    disableGutters: js.UndefOr[Boolean] = js.undefined,
    disableSticky: js.UndefOr[Boolean] = js.undefined,
    inset: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto

}

trait MuiListSubheaderExtensions {

  object Color extends Enumeration {
    type Value = String

    val default = "default"
    val primary = "primary"
    val inherit = "inherit"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val colorPrimary = "colorPrimary"
    val colorInherit = "colorInherit"
    val gutters = "gutters"
    val inset = "inset"
    val sticky = "sticky"
  }

}
