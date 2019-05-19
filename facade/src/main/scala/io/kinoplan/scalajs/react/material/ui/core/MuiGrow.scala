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
    in: Option[Boolean] = None,
    timeout: Int |  js.Object | Timeout.Value = Timeout.auto
  ): WithProps = auto
}

trait MuiGrowExtensions {
  object Timeout extends Enumeration {
    val auto = Value("auto")
  }
}
