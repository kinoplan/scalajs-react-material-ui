package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^.VdomNode

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiAccordionSummary extends ReactBridgeComponent with MuiAccordionSummaryExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "AccordionSummary")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    expandIcon: js.UndefOr[VdomNode] = js.undefined,
    IconButtonProps: js.UndefOr[js.Object]= js.undefined
  ): WithProps = auto
}

trait MuiAccordionSummaryExtensions {
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
