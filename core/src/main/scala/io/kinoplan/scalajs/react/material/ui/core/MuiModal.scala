package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.ReactEvent

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiModal extends ReactBridgeComponent with MuiModalExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Modal")
  @js.native
  object RawComponent extends js.Function

  def apply(
    BackdropComponent: js.UndefOr[ComponentPropType] = js.undefined,
    BackdropProps: js.UndefOr[js.Object] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    closeAfterTransition: js.UndefOr[Boolean] = js.undefined,
    container: js.UndefOr[ComponentRefType] = js.undefined,
    disableAutoFocus: js.UndefOr[Boolean] = js.undefined,
    disableBackdropClick: js.UndefOr[Boolean] = js.undefined,
    disableEnforceFocus: js.UndefOr[Boolean] = js.undefined,
    disableEscapeKeyDown: js.UndefOr[Boolean] = js.undefined,
    disablePortal: js.UndefOr[Boolean] = js.undefined,
    disableRestoreFocus: js.UndefOr[Boolean] = js.undefined,
    hideBackdrop: js.UndefOr[Boolean] = js.undefined,
    keepMounted: js.UndefOr[Boolean] = js.undefined,
    onBackdropClick: js.UndefOr[ReactHandler1[ReactEvent]] = js.undefined,
    onClose: js.UndefOr[ReactHandler2[ReactEvent, String]] = js.undefined,
    onEscapeKeyDown: js.UndefOr[ReactHandler1[ReactEvent]] = js.undefined,
    onRendered: js.UndefOr[JsFun0] = js.undefined,
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
