package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.ReactEvent

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiTabs extends ReactBridgeComponent with MuiTabsExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Tabs")
  @js.native
  object RawComponent extends js.Function

  def apply(
    action: js.UndefOr[OnJSEv1[ReactEvent]] = js.undefined,
    centered: js.UndefOr[Boolean] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    indicatorColor: js.UndefOr[IndicatorColor.Value] = js.undefined,
    onChange: js.UndefOr[ReactHandler2[ReactEvent, js.Any]] = js.undefined,
    ScrollButtonComponent: js.UndefOr[ComponentPropType] = js.undefined,
    scrollButtons: js.UndefOr[ScrollButtons.Value] = js.undefined,
    TabIndicatorProps: js.UndefOr[js.Object] = js.undefined,
    textColor: js.UndefOr[TextColor.Value] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined
  ): WithProps = auto

}

trait MuiTabsExtensions {

  object IndicatorColor extends Enumeration {
    type Value = String

    val secondary = "secondary"
    val primary = "primary"
  }

  object ScrollButtons extends Enumeration {
    type Value = String

    val auto = "auto"
    val on = "on"
    val off = "off"
  }

  object TextColor extends Enumeration {
    type Value = String

    val secondary = "secondary"
    val primary = "primary"
    val inherit = "inherit"
  }

  object Variant extends Enumeration {
    type Value = String

    val standard = "standard"
    val scrollable = "scrollable"
    val fullWidth = "fullWidth"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val flexContainer = "flexContainer"
    val centered = "centered"
    val scroller = "scroller"
    val fixed = "fixed"
    val scrollable = "scrollable"
    val scrollButtons = "scrollButtons"
    val scrollButtonsAuto = "scrollButtonsAuto"
    val indicator = "indicator"
  }

}
