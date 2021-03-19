package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.ReactEvent

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiAccordion extends ReactBridgeComponent with MuiAccordionExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Accordion")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    defaultExpanded: js.UndefOr[Boolean] = js.undefined,
    expanded: js.UndefOr[Boolean] = js.undefined,
    onChange: js.UndefOr[ReactHandler2[ReactEvent, Boolean]] = js.undefined,
    square: js.UndefOr[Boolean] = js.undefined,
    TransitionComponent: js.UndefOr[ComponentPropType] = js.undefined,
    TransitionProps: js.UndefOr[js.Object] = js.undefined
  ): WithProps = auto
}

trait MuiAccordionExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val rounded = "rounded"
    val expanded = "expanded"
    val disabled = "disabled"
  }
}
