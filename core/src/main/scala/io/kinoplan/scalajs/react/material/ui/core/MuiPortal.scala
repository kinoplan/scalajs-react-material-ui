package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiPortal extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Portal")
  @js.native
  object RawComponent extends js.Function

  def apply(
    container: OptComponentContainerType = js.undefined,
    disablePortal: js.UndefOr[Boolean] = js.undefined,
    onRendered: OptJsFun0 = js.undefined
  ): WithProps = auto
}
