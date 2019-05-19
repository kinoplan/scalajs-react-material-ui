package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiToolbar extends ReactBridgeComponent with MuiToolbarExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Toolbar")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    disableGutters: Boolean = false,
    variant: Variant.Value = Variant.regular
  ): WithProps = auto
}

trait MuiToolbarExtensions {
  object Variant extends Enumeration {
    val regular = Value("regular")
    val dense = Value("dense")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val gutters = "gutters"
    val regular = "regular"
    val dense = "dense"
  }
}
