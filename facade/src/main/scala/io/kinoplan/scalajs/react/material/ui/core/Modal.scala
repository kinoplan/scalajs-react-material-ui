package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Modal extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Modal")
  @js.native
  object RawComponent extends js.Function

  def apply(
    BackdropComponent: Option[String | js.Function] = Some("Backdrop"),
    BackdropProps: js.Object = js.Object,
    classes: js.Object = js.Object(),
    closeAfterTransition: Boolean = false,
    container: Option[js.Object | js.Function] = None,
    disableAutoFocus: Boolean = false,
    disableBackdropClick: Boolean = false,
    disableEnforceFocus: Boolean = false,
    disableEscapeKeyDown: Boolean = false,
    disablePortal: Boolean = false,
    disableRestoreFocus: Boolean = false,
    hideBackdrop: Boolean = false,
    keepMounted: Boolean = false,
    onBackdropClick: Option[js.Function] = None,
    onClose: Option[js.Function] = None,
    onEscapeKeyDown: Option[js.Function] = None,
    onRendered: Option[js.Function] = None,
    open: Boolean
  ): WithProps = auto
}
