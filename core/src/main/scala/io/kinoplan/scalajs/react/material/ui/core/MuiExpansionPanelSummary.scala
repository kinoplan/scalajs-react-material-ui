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
    IconButtonProps: js.UndefOr[js.Object]= js.undefined
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
  }
}
