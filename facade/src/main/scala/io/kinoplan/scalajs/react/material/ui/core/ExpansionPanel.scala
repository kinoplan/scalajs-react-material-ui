package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object ExpansionPanel extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "ExpansionPanel")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.Object = js.Object(),
    CollapseProps: js.Object = js.Object(),
    defaultExpanded: Boolean = false,
    disabled: Boolean = false,
    expanded: Option[Boolean] = None,
    onChange: Option[js.Function] = None
  ): WithProps = auto
}
