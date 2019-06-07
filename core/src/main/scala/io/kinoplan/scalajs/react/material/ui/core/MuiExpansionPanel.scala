package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiExpansionPanel extends ReactBridgeComponent with MuiExpansionPanelExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "ExpansionPanel")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    CollapseProps: js.Object = js.Object(),
    defaultExpanded: Boolean = false,
    disabled: Boolean = false,
    expanded: Option[Boolean] = None,
    onChange: Option[js.Function] = None
  ): WithProps = auto
}

trait MuiExpansionPanelExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val rounded = "rounded"
    val expanded = "expanded"
    val disabled = "disabled"
  }
}
