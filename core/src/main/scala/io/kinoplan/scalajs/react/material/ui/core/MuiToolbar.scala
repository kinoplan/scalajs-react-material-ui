package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiToolbar extends ReactBridgeComponent with MuiToolbarExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Toolbar")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    disableGutters: js.UndefOr[Boolean] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined
  ): WithProps = auto

}

trait MuiToolbarExtensions {

  object Variant extends Enumeration {
    type Value = String

    val regular = "regular"
    val dense = "dense"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val gutters = "gutters"
    val regular = "regular"
    val dense = "dense"
  }

}
