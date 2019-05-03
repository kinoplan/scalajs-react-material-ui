package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object ListItemSecondary extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "ListItemSecondary")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.Object = js.Object()
  ): WithProps = auto
}
