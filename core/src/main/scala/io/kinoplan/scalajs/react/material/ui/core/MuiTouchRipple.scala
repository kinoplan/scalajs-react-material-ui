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
    center: Boolean = false,
    classes: Map[ClassKey.ClassKey, String] = Map.empty
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiTouchRippleExtensions {
  object Placement extends Enumeration {
    val bottomEnd = Value("bottom-end")
    val bottomStart = Value("bottom-start")
    val bottom = Value("bottom")
    val leftEnd = Value("left-end")
    val leftStart = Value("left-start")
    val left = Value("left")
    val rightEnd = Value("right-end")
    val rightStart = Value("right-start")
    val right = Value("right")
    val topEnd = Value("top-end")
    val topStart = Value("top-start")
    val top = Value("top")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val ripple = "ripple"
    val rippleVisible = "rippleVisible"
    val ripplePulsate = "ripplePulsate"
    val child = "child"
    val childLeaving = "childLeaving"
    val childPulsate = "childPulsate"
  }
}
