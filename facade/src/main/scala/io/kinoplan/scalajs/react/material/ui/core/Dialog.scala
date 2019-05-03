package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Dialog extends ReactBridgeComponent with DialogExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Dialog")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.Object = js.Object(),
    disableBackdropClick: Boolean = false,
    disableEscapeKeyDown: Boolean = false,
    fullScreen: Boolean = false,
    fullWidth: Boolean = false,
    maxWidth: Option[Boolean | MaxWidth.Value] = Some(MaxWidth.sm),
    onBackdropClick: Option[js.Function] = None,
    onClose: Option[js.Function] = None,
    onEnter: Option[js.Function] = None,
    onEntered: Option[js.Function] = None,
    onEntering: Option[js.Function] = None,
    onEscapeKeyDown: Option[js.Function] = None,
    onExit: Option[js.Function] = None,
    onExited: Option[js.Function] = None,
    onExiting: Option[js.Function] = None,
    open: Boolean,
    PaperComponent: Option[String | js.Function] = Some("Paper"),
    PaperProps: js.Object = js.Object(),
    scroll: Scroll.Value = Scroll.paper,
    TransitionComponent: Option[String | js.Function] = Some("Fade"),
    transitionDuration: Option[Int | js.Object] = None,
    TransitionProps: js.Object = js.Object()
  ): WithProps = auto
}

trait DialogExtensions {
  object MaxWidth extends Enumeration {
    val xs = Value("xs")
    val sm = Value("sm")
    val md = Value("md")
    val lg = Value("lg")
    val xl = Value("xl")
  }

  object Scroll extends Enumeration {
    val body = Value("body")
    val paper = Value("paper")
  }
}
