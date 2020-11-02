package io.kinoplan.scalajs.react.material.ui.core

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiPortal extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Portal")
  @js.native
  object RawComponent extends js.Function

  def apply(
    container: js.UndefOr[ComponentRefType] = js.undefined,
    disablePortal: js.UndefOr[Boolean] = js.undefined,
    onRendered: js.UndefOr[JsFun0] = js.undefined
  ): WithProps = auto
}
