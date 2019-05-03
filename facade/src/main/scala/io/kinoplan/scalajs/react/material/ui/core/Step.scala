package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Step extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Step")
  @js.native
  object RawComponent extends js.Function

  def apply(
    active: Boolean = false,
    classes: js.Object = js.Object(),
    completed: Boolean = false,
    disabled: Boolean = false
  ): WithProps = auto
}
