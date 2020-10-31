package io.kinoplan.scalajs.react.material.ui.core

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiCssBaseline extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "CssBaseline")
  @js.native
  object RawComponent extends js.Function

  def apply(): WithProps = auto
}
