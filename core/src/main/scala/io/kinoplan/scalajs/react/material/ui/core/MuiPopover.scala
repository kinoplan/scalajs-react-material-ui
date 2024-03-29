package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import japgolly.scalajs.react.ReactEvent
import org.scalajs.dom.html

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import io.kinoplan.scalajs.react.material.ui.core.internal.Origin

object MuiPopover extends ReactBridgeComponent with MuiPopoverExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Popover")
  @js.native
  object RawComponent extends js.Function

  def apply(
    action: js.UndefOr[js.Function] = js.undefined,
    anchorEl: js.UndefOr[html.Element | js.Function1[html.Element, html.Element]] = js.undefined,
    anchorOrigin: js.UndefOr[Origin] = js.undefined,
    anchorPosition: js.UndefOr[js.Object] = js.undefined,
    anchorReference: js.UndefOr[AnchorReference.Value] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    container: js.UndefOr[ComponentRefType] = js.undefined,
    elevation: js.UndefOr[Int] = js.undefined,
    getContentAnchorEl: js.UndefOr[html.Element | js.Function1[html.Element, html.Element]] = js.undefined,
    marginThreshold: js.UndefOr[Int] = js.undefined,
    ModalClasses: js.UndefOr[js.Object] = js.undefined,
    onClose: js.UndefOr[ReactHandler2[ReactEvent, String]] = js.undefined,
    onEnter: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onEntered: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onEntering: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onExit: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onExited: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onExiting: js.UndefOr[Handler1[html.Element]] = js.undefined,
    open: Boolean,
    PaperProps: js.UndefOr[js.Object] = js.undefined,
    transformOrigin: js.UndefOr[Origin] = js.undefined,
    TransitionComponent: js.UndefOr[ComponentPropType] = js.undefined,
    transitionDuration: js.UndefOr[Int | js.Object | TransitionDuration.Value] = js.undefined,
    TransitionProps: js.UndefOr[js.Object] = js.undefined,
    BackdropComponent: js.UndefOr[ComponentPropType] = js.undefined,
    BackdropProps: js.UndefOr[js.Object] = js.undefined,
    closeAfterTransition: js.UndefOr[Boolean] = js.undefined,
    disableAutoFocus: js.UndefOr[Boolean] = js.undefined,
    disableBackdropClick: js.UndefOr[Boolean] = js.undefined,
    disableEnforceFocus: js.UndefOr[Boolean] = js.undefined,
    disableEscapeKeyDown: js.UndefOr[Boolean] = js.undefined,
    disablePortal: js.UndefOr[Boolean] = js.undefined,
    disableRestoreFocus: js.UndefOr[Boolean] = js.undefined,
    hideBackdrop: js.UndefOr[Boolean] = js.undefined,
    keepMounted: js.UndefOr[Boolean] = js.undefined,
    onBackdropClick: js.UndefOr[ReactHandler1[ReactEvent]] = js.undefined,
    onEscapeKeyDown: js.UndefOr[ReactHandler1[ReactEvent]] = js.undefined,
    onRendered: js.UndefOr[JsFun0] = js.undefined
  ): WithProps = auto

}

trait MuiPopoverExtensions {

  object AnchorReference extends Enumeration {
    type Value = String

    val anchorEl = "anchorEl"
    val anchorPosition = "anchorPosition"
    val none = "none"
  }

  object TransitionDuration extends Enumeration {
    type Value = String

    val auto = "auto"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val paper = "paper"
    val root = "root"
    val hidden = "hidden"
  }

}
