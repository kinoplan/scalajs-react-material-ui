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
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    expandIcon: Option[VdomNode] = None,
    IconButtonProps: js.Object = js.Object()
  ): WithProps = auto
}

trait MuiExpansionPanelSummaryExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val expanded = "expanded"
    val focused = "focused"
    val disabled = "disabled"
    val content = "content"
    val expandIcon = "expandIcon"
  }
}
