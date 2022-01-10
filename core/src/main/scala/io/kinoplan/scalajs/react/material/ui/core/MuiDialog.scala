package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import japgolly.scalajs.react.ReactEvent
import org.scalajs.dom.html

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiDialog extends ReactBridgeComponent with MuiDialogExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Dialog")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    disableBackdropClick: js.UndefOr[Boolean] = js.undefined,
    disableEscapeKeyDown: js.UndefOr[Boolean] = js.undefined,
    fullScreen: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    maxWidth: js.UndefOr[Boolean | MaxWidth.Value] = js.undefined,
    onBackdropClick: js.UndefOr[ReactHandler1[ReactEvent]] = js.undefined,
    onClose: js.UndefOr[ReactHandler2[ReactEvent, String]] = js.undefined,
    onEnter: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onEntering: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onEntered: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onExit: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onExiting: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onExited: js.UndefOr[Handler1[html.Element]] = js.undefined,
    onEscapeKeyDown: js.UndefOr[ReactHandler1[ReactEvent]] = js.undefined,
    open: Boolean,
    PaperComponent: js.UndefOr[ComponentPropType] = js.undefined,
    PaperProps: js.UndefOr[js.Object] = js.undefined,
    scroll: js.UndefOr[Scroll.Value] = js.undefined,
    TransitionComponent: js.UndefOr[ComponentPropType] = js.undefined,
    transitionDuration: js.UndefOr[Int | js.Object] = js.undefined,
    TransitionProps: js.UndefOr[js.Object] = js.undefined,
    BackdropComponent: js.UndefOr[ComponentPropType] = js.undefined,
    BackdropProps: js.UndefOr[js.Object] = js.undefined,
    closeAfterTransition: js.UndefOr[Boolean] = js.undefined,
    container: js.UndefOr[ComponentRefType] = js.undefined,
    disableAutoFocus: js.UndefOr[Boolean] = js.undefined,
    disableEnforceFocus: js.UndefOr[Boolean] = js.undefined,
    disablePortal: js.UndefOr[Boolean] = js.undefined,
    disableRestoreFocus: js.UndefOr[Boolean] = js.undefined,
    hideBackdrop: js.UndefOr[Boolean] = js.undefined,
    keepMounted: js.UndefOr[Boolean] = js.undefined,
    onRendered: js.UndefOr[JsFun0] = js.undefined
  ): WithProps = auto

}

trait MuiDialogExtensions {

  object MaxWidth extends Enumeration {
    type Value = String

    val xs = "xs"
    val sm = "sm"
    val md = "md"
    val lg = "lg"
    val xl = "xl"
  }

  object Scroll extends Enumeration {
    type Value = String

    val body = "body"
    val paper = "paper"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val scrollPaper = "scrollPaper"
    val scrollBody = "scrollBody"
    val container = "container"
    val paper = "paper"
    val paperScrollPaper = "paperScrollPaper"
    val paperScrollBody = "paperScrollBody"
    val paperWidthXs = "paperWidthXs"
    val paperWidthSm = "paperWidthSm"
    val paperWidthMd = "paperWidthMd"
    val paperWidthLg = "paperWidthLg"
    val paperWidthXl = "paperWidthXl"
    val paperFullWidth = "paperFullWidth"
    val paperFullScreen = "paperFullScreen"
    val hidden = "hidden"
  }

}
