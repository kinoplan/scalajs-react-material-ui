package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiPortal extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Portal")
  @js.native
  object RawComponent extends js.Function

  def apply(
    container: Option[js.Object | js.Function] = None,
    disablePortal: Boolean = false,
    onRendered: Option[js.Function] = None
  ): WithProps = auto
}
