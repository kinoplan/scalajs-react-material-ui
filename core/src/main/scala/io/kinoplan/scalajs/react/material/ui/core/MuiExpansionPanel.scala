package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import io.kinoplan.scalajs.react.material.ui.core.internal.PaperClassKey

object MuiExpansionPanel extends ReactBridgeComponent with MuiExpansionPanelExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "ExpansionPanel")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    CollapseProps: js.UndefOr[js.Object] = js.undefined,
    defaultExpanded: js.UndefOr[Boolean] = js.undefined,
    expanded: js.UndefOr[Boolean] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    elevation: js.UndefOr[Int] = js.undefined,
    square: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto

}

trait MuiExpansionPanelExtensions {

  object ClassKey extends Enumeration with PaperClassKey {
    type Value = String

    override val root = "root"
    override val rounded = "rounded"
    val expanded = "expanded"
    val disabled = "disabled"
  }

}
