package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.ReactEvent

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object SwipeableViews extends ReactBridgeComponent with SwipeableViewsExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("react-swipeable-views/lib/SwipeableViews.js", JSImport.Default)
  @js.native
  object RawComponent extends js.Function

  def apply(
    action: OnJSEv1[ReactEvent] = js.undefined,
    animateHeight: Boolean = false,
    animateTransitions: Boolean = true,
    axis: Axis.Value = Axis.x,
    containerStyle: js.Object = js.Object(),
    disabled: Boolean = false,
    disableLazyLoading: Boolean = false,
    enableMouseEvents: Boolean = false,
    hysteresis: Double = 0.6,
    ignoreNativeScroll: Boolean = false,
    index: Int = 0,
    onChangeIndex: Handler3[Int, Int, js.Object] = js.undefined,
    onSwitching: Handler2[Int, String] = js.undefined,
    onTransitionEnd: Option[js.Function] = None,
    resistance: Boolean = false,
    slideClassName: Option[String] = None,
    slideStyle: js.Object = js.Object(),
    springConfig: js.UndefOr[js.Object] = js.undefined,
    threshold: Int = 5
  ): WithProps = auto
}

trait SwipeableViewsExtensions {
  object Axis extends Enumeration {
    val x = Value("x")
    val xReverse = Value("x-reverse")
    val y = Value("y")
    val yReverse = Value("y-reverse")
  }
}
