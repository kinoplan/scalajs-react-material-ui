package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiMenuItem extends ReactBridgeComponent with MuiMenuItemExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "MenuItem")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    disableGutters: js.UndefOr[Boolean] = js.undefined,
    alignItems: js.UndefOr[AlignItems.Value] = js.undefined,
    button: js.UndefOr[Boolean] = js.undefined,
    ContainerComponent: js.UndefOr[ComponentPropType] = js.undefined,
    ContainerProps: js.UndefOr[js.Object] = js.undefined,
    dense: js.UndefOr[Boolean] = js.undefined,
    divider: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto

}

trait MuiMenuItemExtensions {

  object TransitionDuration extends Enumeration {
    type Value = String

    val auto = "auto"
  }

  object AlignItems extends Enumeration {
    type Value = String

    val flexStart = "flex-start"
    val center = "center"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val paper = "paper"
    val gutters = "gutters"
    val selected = "selected"
    val root = "root"
    val container = "container"
    val focusVisible = "focusVisible"
    val default = "default"
    val dense = "dense"
    val alignItemsFlexStart = "alignItemsFlexStart"
    val disabled = "disabled"
    val divider = "divider"
    val button = "button"
    val secondaryAction = "secondaryAction"
  }

}
