package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiTouchRipple extends ReactBridgeComponent with MuiTouchRippleExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core/ButtonBase", "TouchRipple")
  @js.native
  object RawComponent extends js.Function

  def apply(
    center: js.UndefOr[Boolean] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiTouchRippleExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val ripple = "ripple"
    val rippleVisible = "rippleVisible"
    val ripplePulsate = "ripplePulsate"
    val child = "child"
    val childLeaving = "childLeaving"
    val childPulsate = "childPulsate"
  }
}
