package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.ReactEvent
import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiDialog extends ReactBridgeComponent with MuiDialogExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Dialog")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    disableBackdropClick: js.UndefOr[Boolean] = js.undefined,
    disableEscapeKeyDown: js.UndefOr[Boolean] = js.undefined,
    fullScreen: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    maxWidth: js.UndefOr[Boolean | MaxWidth.Value] = js.undefined,
    onBackdropClick: ReactHandler1[ReactEvent] = js.undefined,
    onClose: ReactHandler2[ReactEvent, String] = js.undefined,
    onEnter: Handler1[html.Element] = js.undefined,
    onEntering: Handler1[html.Element] = js.undefined,
    onEntered: Handler1[html.Element] = js.undefined,
    onExit: Handler1[html.Element] = js.undefined,
    onExiting: Handler1[html.Element] = js.undefined,
    onExited: Handler1[html.Element] = js.undefined,
    onEscapeKeyDown: ReactHandler1[ReactEvent] = js.undefined,
    open: Boolean,
    PaperComponent: OptComponentPropType = js.undefined,
    PaperProps: js.UndefOr[js.Object] = js.undefined,
    scroll: js.UndefOr[Scroll.Value] = js.undefined,
    TransitionComponent: OptComponentPropType = js.undefined,
    transitionDuration: js.UndefOr[Int | js.Object] = js.undefined,
    TransitionProps: js.UndefOr[js.Object] = js.undefined,
    BackdropComponent: OptComponentPropType = js.undefined,
    BackdropProps: js.UndefOr[js.Object] = js.undefined,
    closeAfterTransition: js.UndefOr[Boolean] = js.undefined,
    container: OptComponentContainerType = js.undefined,
    disableAutoFocus: js.UndefOr[Boolean] = js.undefined,
    disableEnforceFocus: js.UndefOr[Boolean] = js.undefined,
    disablePortal: js.UndefOr[Boolean] = js.undefined,
    disableRestoreFocus: js.UndefOr[Boolean] = js.undefined,
    hideBackdrop: js.UndefOr[Boolean] = js.undefined,
    keepMounted: js.UndefOr[Boolean] = js.undefined,
    onRendered: OptJsFun0 = js.undefined
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
