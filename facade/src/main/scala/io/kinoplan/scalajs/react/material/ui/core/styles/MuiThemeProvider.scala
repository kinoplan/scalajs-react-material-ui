package io.kinoplan.scalajs.react.material.ui.core.styles

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiThemeProvider extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core/styles", "MuiThemeProvider")
  @js.native
  object RawComponent extends js.Function

  def apply(
    disableStylesGeneration: Option[Boolean] = None,
    sheetsManager: js.Object = js.Object,
    theme: js.Object | js.Function
  ): WithProps = auto
}
