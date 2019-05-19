package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiTabs extends ReactBridgeComponent with MuiTabsExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Tabs")
  @js.native
  object RawComponent extends js.Function

  def apply(
    action: Option[js.Function] = None,
    centered: Boolean = false,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    component: Option[String | js.Function] = Some("div"),
    indicatorColor: IndicatorColor.Value = IndicatorColor.secondary,
    onChange: Option[js.Function] = None,
    ScrollButtonComponent: Option[String | js.Function] = Some("TabScrollButton"),
    scrollButtons: ScrollButtons.Value = ScrollButtons.auto,
    TabIndicatorProps: js.Object = js.Object(),
    textColor: TextColor.Value = TextColor.inherit,
    value: Option[js.Any] = None,
    variant: Variant.Value = Variant.standard
  ): WithProps = auto
}

trait MuiTabsExtensions {
  object IndicatorColor extends Enumeration {
    val secondary = Value("secondary")
    val primary = Value("primary")
  }

  object ScrollButtons extends Enumeration {
    val auto = Value("auto")
    val on = Value("on")
    val off = Value("off")
  }

  object TextColor extends Enumeration {
    val secondary = Value("secondary")
    val primary = Value("primary")
    val inherit = Value("inherit")
  }

  object Variant extends Enumeration {
    val standard = Value("standard")
    val scrollable = Value("scrollable")
    val fullWidth = Value("fullWidth")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

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
