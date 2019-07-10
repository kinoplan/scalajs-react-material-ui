package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiMenuItem extends ReactBridgeComponent with MuiMenuItemExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "MenuItem")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: OptComponentPropType = js.undefined,
    disableGutters: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto
}

trait MuiMenuItemExtensions {
  object TransitionDuration extends Enumeration {
    type Value = String

    val auto = "auto"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val paper = "paper"
    val gutters = "gutters"
    val selected = "selected"
  }
}
