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
    disableBackdropTransition: js.UndefOr[Boolean] = js.undefined,
    disableDiscovery: js.UndefOr[Boolean] = js.undefined,
    disableSwipeToOpen: js.UndefOr[Boolean] = js.undefined,
    hysteresis: js.UndefOr[Double] = js.undefined,
    minFlingVelocity: js.UndefOr[Int] = js.undefined,
    onClose: ReactHandler1[ReactEventFromHtml],
    onOpen: ReactHandler1[ReactEventFromHtml],
    open: Boolean,
    SwipeAreaProps: js.UndefOr[js.Object] = js.undefined,
    swipeAreaWidth: js.UndefOr[Int] = js.undefined,
    transitionDuration: js.UndefOr[Int | js.Object] = js.undefined,
    anchor: js.UndefOr[Anchor.Value] = js.undefined
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiSwipeableDrawerExtensions {
  object Anchor extends Enumeration {
    type Value = String

    val left = "left"
    val top = "top"
    val right = "right"
    val bottom = "bottom"
  }
}
