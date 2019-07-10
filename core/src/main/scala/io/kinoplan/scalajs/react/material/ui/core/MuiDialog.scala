package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.ReactEvent
import org.scalajs.dom.raw.HTMLElement

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
    onClose: ReactHandler1[ReactEvent] = js.undefined,
    onEnter: Handler2[HTMLElement, Boolean] = js.undefined,
    onEntered: Handler2[HTMLElement, Boolean] = js.undefined,
    onEntering: Handler2[HTMLElement, Boolean] = js.undefined,
    onEscapeKeyDown: ReactHandler1[ReactEvent] = js.undefined,
    onExit: Handler1[HTMLElement] = js.undefined,
    onExited: Handler1[HTMLElement] = js.undefined,
    onExiting: Handler1[HTMLElement] = js.undefined,
    open: Boolean,
    PaperComponent: OptComponentPropType = js.undefined,
    PaperProps: js.UndefOr[js.Object] = js.undefined,
    scroll: js.UndefOr[Scroll.Value] = js.undefined,
    TransitionComponent: OptComponentPropType = js.undefined,
    transitionDuration: js.UndefOr[Int | js.Object] = js.undefined,
    TransitionProps: js.UndefOr[js.Object] = js.undefined
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
  }
}
