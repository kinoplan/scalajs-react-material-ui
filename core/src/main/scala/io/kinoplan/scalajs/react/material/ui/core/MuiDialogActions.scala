package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiDialogActions extends ReactBridgeComponent with MuiDialogActionsExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "DialogActions")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    disableActionSpacing: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto
}

trait MuiDialogActionsExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val action = "action"
  }
}
