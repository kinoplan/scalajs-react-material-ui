package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiSwipeableDrawer extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "SwipeableDrawer")
  @js.native
  object RawComponent extends js.Function

  def apply(
    disableBackdropTransition: Boolean = false,
    disableDiscovery: Boolean = false,
    disableSwipeToOpen: Option[Boolean] = None,
    hysteresis: Double = 0.55,
    minFlingVelocity: Int = 400,
    onClose: js.Function,
    onOpen: js.Function,
    open: Boolean,
    SwipeAreaProps: js.Object = js.Object(),
    swipeAreaWidth: Int = 20,
    transitionDuration: Option[Int | js.Object] = None
  ): WithPropsNoChildren = autoNoChildren
}
