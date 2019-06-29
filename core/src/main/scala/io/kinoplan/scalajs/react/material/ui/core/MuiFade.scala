package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiFade extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Fade")
  @js.native
  object RawComponent extends js.Function

  def apply(
    in: Option[Boolean] = None,
    timeout: Option[Int | js.Object] = None,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto
}
