package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.ReactEvent
import japgolly.scalajs.react.vdom.html_<^._
import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiSnackbar extends ReactBridgeComponent with MuiSnackbarExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Snackbar")
  @js.native
  object RawComponent extends js.Function

  def apply(
    action: Option[VdomNode] = None,
    anchorOrigin: js.UndefOr[js.Object] = js.undefined,
    autoHideDuration: js.UndefOr[Int] = js.undefined,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    ClickAwayListenerProps: js.Object = js.Object(),
    ContentProps: js.Object = js.Object(),
    disableWindowBlurListener: Boolean = false,
    message: Option[VdomNode] = None,
    onClose: ReactHandler2[ReactEvent, String] = js.undefined,
    onEnter: Handler1[html.Element] = js.undefined,
    onEntered: Handler1[html.Element] = js.undefined,
    onEntering: Handler1[html.Element] = js.undefined,
    onExit: Handler1[html.Element] = js.undefined,
    onExited: Handler1[html.Element] = js.undefined,
    onExiting: Handler1[html.Element] = js.undefined,
    open: js.UndefOr[Boolean] = js.undefined,
    resumeHideDuration: js.UndefOr[Int] = js.undefined,
    TransitionComponent: OptComponentPropType = js.undefined,
    transitionDuration: js.UndefOr[Int | js.Object] = js.undefined,
    TransitionProps: js.Object = js.Object()
  ): WithProps = auto
}

trait MuiSnackbarExtensions {
  object Direction extends Enumeration {
    val left = Value("left")
    val right = Value("right")
    val up = Value("up")
    val down = Value("down")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val anchorOriginTopCenter = "anchorOriginTopCenter"
    val anchorOriginBottomCenter = "anchorOriginBottomCenter"
    val anchorOriginTopRight = "anchorOriginTopRight"
    val anchorOriginBottomRight = "anchorOriginBottomRight"
    val anchorOriginTopLeft = "anchorOriginTopLeft"
    val anchorOriginBottomLeft = "anchorOriginBottomLeft"
  }
}
