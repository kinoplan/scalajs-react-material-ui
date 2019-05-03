package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Popover extends ReactBridgeComponent with PopoverExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Popover")
  @js.native
  object RawComponent extends js.Function

  def apply(
    action: Option[js.Function] = None,
    anchorEl: Option[js.Object | js.Function] = None,
    anchorOrigin: js.Object = js.Object(),
    anchorPosition: js.Object = js.Object(),
    anchorReference: AnchorReference.Value = AnchorReference.anchorEl,
    classes: js.Object = js.Object(),
    container: Option[js.Object | js.Function] = None,
    elevation: Int = 8,
    getContentAnchorEl: Option[js.Function] = None,
    marginThreshold: Int = 16,
    ModalClasses: js.Object = js.Object(),
    onClose: Option[js.Function] = None,
    onEnter: Option[js.Function] = None,
    onEntered: Option[js.Function] = None,
    onEntering: Option[js.Function] = None,
    onExit: Option[js.Function] = None,
    onExited: Option[js.Function] = None,
    onExiting: Option[js.Function] = None,
    open: Boolean,
    PaperProps: js.Object = js.Object,
    transformOrigin: js.Object = js.Object(),
    TransitionComponent: Option[String | js.Function] = Some("Grow"),
    transitionDuration: Int | js.Object | TransitionDuration.Value = TransitionDuration.auto,
    TransitionProps: js.Object = js.Object()
  ): WithProps = auto
}

trait PopoverExtensions {
  object AnchorReference extends Enumeration {
    val anchorEl = Value("anchorEl")
    val anchorPosition = Value("anchorPosition")
    val none = Value("none")
  }

  object TransitionDuration extends Enumeration {
    val auto = Value("auto")
  }
}
