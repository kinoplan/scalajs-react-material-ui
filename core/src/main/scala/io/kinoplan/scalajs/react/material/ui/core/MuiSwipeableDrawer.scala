package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import japgolly.scalajs.react.ReactEventFromHtml

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiSwipeableDrawer extends ReactBridgeComponent with MuiSwipeableDrawerExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "SwipeableDrawer")
  @js.native
  object RawComponent extends js.Function

  def apply(
    anchor: Anchor.Value = Anchor.left,
    disableBackdropTransition: Boolean = false,
    disableDiscovery: Boolean = false,
    disableSwipeToOpen: Option[Boolean] = None,
    hysteresis: Double = 0.55,
    minFlingVelocity: Int = 400,
    onClose: ReactHandler1[ReactEventFromHtml],
    onOpen: ReactHandler1[ReactEventFromHtml],
    open: Boolean,
    SwipeAreaProps: js.Object = js.Object(),
    swipeAreaWidth: Int = 20,
    transitionDuration: Option[Int | js.Object] = None
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiSwipeableDrawerExtensions {
  object Anchor extends Enumeration {
    val left = Value("left")
    val top = Value("top")
    val right = Value("right")
    val bottom = Value("bottom")
  }
}

