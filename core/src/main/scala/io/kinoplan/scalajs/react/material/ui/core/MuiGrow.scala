package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiGrow extends ReactBridgeComponent with MuiGrowExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Grow")
  @js.native
  object RawComponent extends js.Function

  def apply(
    in: js.UndefOr[Boolean] = js.undefined,
    appear: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Int | js.Object | Timeout.Value] = js.undefined,
    TransitionProps: js.UndefOr[js.Object] = js.undefined
  ): WithProps = auto
}

trait MuiGrowExtensions {
  object Timeout extends Enumeration {
    type Value = String

    val auto = "auto"
  }
}
