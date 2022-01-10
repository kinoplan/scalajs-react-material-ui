package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import japgolly.scalajs.react.ReactEventFromHtml

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

object MuiSwipeableDrawer extends ReactBridgeComponent with MuiSwipeableDrawerExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "SwipeableDrawer")
  @js.native
  object RawComponent extends js.Function

  def apply(
    disableBackdropTransition: js.UndefOr[Boolean] = js.undefined,
    disableDiscovery: js.UndefOr[Boolean] = js.undefined,
    disableSwipeToOpen: js.UndefOr[Boolean] = js.undefined,
    hysteresis: js.UndefOr[Double] = js.undefined,
    minFlingVelocity: js.UndefOr[Int] = js.undefined,
    onClose: js.UndefOr[ReactHandler1[ReactEventFromHtml]],
    onOpen: js.UndefOr[ReactHandler1[ReactEventFromHtml]],
    open: Boolean,
    SwipeAreaProps: js.UndefOr[js.Object] = js.undefined,
    swipeAreaWidth: js.UndefOr[Int] = js.undefined,
    transitionDuration: js.UndefOr[Int | js.Object] = js.undefined,
    anchor: js.UndefOr[Anchor.Value] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    elevation: js.UndefOr[Int] = js.undefined,
    ModalProps: js.UndefOr[js.Object] = js.undefined,
    PaperProps: js.UndefOr[js.Object] = js.undefined,
    SlideProps: js.UndefOr[js.Object] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined
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

  object Variant extends Enumeration {
    type Value = String

    val permanent = "permanent"
    val persistent = "persistent"
    val temporary = "temporary"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val docked = "docked"
    val paper = "paper"
    val paperAnchorLeft = "paperAnchorLeft"
    val paperAnchorRight = "paperAnchorRight"
    val paperAnchorTop = "paperAnchorTop"
    val paperAnchorBottom = "paperAnchorBottom"
    val paperAnchorDockedLeft = "paperAnchorDockedLeft"
    val paperAnchorDockedTop = "paperAnchorDockedTop"
    val paperAnchorDockedRight = "paperAnchorDockedRight"
    val paperAnchorDockedBottom = "paperAnchorDockedBottom"
    val modal = "modal"
  }

}
