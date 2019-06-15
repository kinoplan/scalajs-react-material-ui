package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.ReactEvent
import japgolly.scalajs.react.raw.React

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiDialog extends ReactBridgeComponent with MuiDialogExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Dialog")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    disableBackdropClick: Boolean = false,
    disableEscapeKeyDown: Boolean = false,
    fullScreen: Boolean = false,
    fullWidth: Boolean = false,
    maxWidth: Option[Boolean | MaxWidth.Value] = Some(MaxWidth.sm),
    onBackdropClick: Option[js.Function] = None,
    onClose: ReactHandler1[ReactEvent] = js.undefined,
    onEnter: Option[js.Function] = None,
    onEntered: Option[js.Function] = None,
    onEntering: Option[js.Function] = None,
    onEscapeKeyDown: Option[js.Function] = None,
    onExit: Option[js.Function] = None,
    onExited: Option[js.Function] = None,
    onExiting: Option[js.Function] = None,
    open: Boolean,
    PaperComponent: OptComponentPropType = js.undefined,
    PaperProps: js.Object = js.Object(),
    scroll: Scroll.Value = Scroll.paper,
    TransitionComponent: js.UndefOr[() => React.ElementType] = js.undefined,
    transitionDuration: Option[Int | js.Object] = None,
    TransitionProps: js.Object = js.Object()
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
    type ClassKey = String

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
