package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiExpansionPanelSummary extends ReactBridgeComponent with MuiExpansionPanelSummaryExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "ExpansionPanelSummary")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    expandIcon: js.UndefOr[VdomNode] = js.undefined,
    IconButtonProps: js.UndefOr[js.Object]= js.undefined,
    action: js.UndefOr[js.Function] = js.undefined,
    buttonRef: OptComponentRefType = js.undefined,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    component: OptComponentPropType = js.undefined,
    disableRipple: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    focusRipple: js.UndefOr[Boolean] = js.undefined,
    focusVisibleClassName: js.UndefOr[String] = js.undefined,
    onFocusVisible: js.UndefOr[js.Function] = js.undefined,
    TouchRippleProps: js.UndefOr[js.Object] = js.undefined
  ): WithProps = auto
}

trait MuiExpansionPanelSummaryExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val expanded = "expanded"
    val focused = "focused"
    val disabled = "disabled"
    val content = "content"
    val expandIcon = "expandIcon"
    val focusVisible = "focusVisible"
  }
}
