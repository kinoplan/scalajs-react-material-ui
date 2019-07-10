package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.ReactEvent

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiModal extends ReactBridgeComponent with MuiModalExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Modal")
  @js.native
  object RawComponent extends js.Function

  def apply(
    BackdropComponent: OptComponentPropType = js.undefined,
    BackdropProps: js.UndefOr[js.Object] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    closeAfterTransition: js.UndefOr[Boolean] = js.undefined,
    container: OptComponentContainerType = js.undefined,
    disableAutoFocus: js.UndefOr[Boolean] = js.undefined,
    disableBackdropClick: js.UndefOr[Boolean] = js.undefined,
    disableEnforceFocus: js.UndefOr[Boolean] = js.undefined,
    disableEscapeKeyDown: js.UndefOr[Boolean] = js.undefined,
    disablePortal: js.UndefOr[Boolean] = js.undefined,
    disableRestoreFocus: js.UndefOr[Boolean] = js.undefined,
    hideBackdrop: js.UndefOr[Boolean] = js.undefined,
    keepMounted: js.UndefOr[Boolean] = js.undefined,
    onBackdropClick: ReactHandler1[ReactEvent] = js.undefined,
    onClose: ReactHandler2[ReactEvent, String] = js.undefined,
    onEscapeKeyDown: ReactHandler1[ReactEvent] = js.undefined,
    onRendered: OptJsFun0 = js.undefined,
    open: Boolean
  ): WithProps = auto
}

trait MuiModalExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val hidden = "hidden"
  }
}
