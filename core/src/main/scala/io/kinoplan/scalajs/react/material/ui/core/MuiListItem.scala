package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiListItem extends ReactBridgeComponent with MuiListItemExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "ListItem")
  @js.native
  object RawComponent extends js.Function

  def apply(
    alignItems: js.UndefOr[AlignItems.Value] = js.undefined,
    button: js.UndefOr[Boolean] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: OptComponentPropType = js.undefined,
    ContainerComponent: OptComponentPropType = js.undefined,
    ContainerProps: js.UndefOr[js.Object] = js.undefined,
    dense: js.UndefOr[Boolean] = js.undefined,
    disableGutters: js.UndefOr[Boolean] = js.undefined,
    divider: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto
}

trait MuiListItemExtensions {
  object AlignItems extends Enumeration {
    type Value = String

    val flexStart = "flex-start"
    val center = "center"
  }

  object Underline extends Enumeration {
    type Value = String

    val none = "none"
    val hover = "hover"
    val always = "always"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val container = "container"
    val focusVisible = "focusVisible"
    val default = "default"
    val dense = "dense"
    val alignItemsFlexStart = "alignItemsFlexStart"
    val disabled = "disabled"
    val divider = "divider"
    val gutters = "gutters"
    val button = "button"
    val secondaryAction = "secondaryAction"
    val selected = "selected"
  }
}
