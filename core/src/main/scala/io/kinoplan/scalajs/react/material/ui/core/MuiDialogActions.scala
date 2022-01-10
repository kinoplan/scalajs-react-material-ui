package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiDialogActions extends ReactBridgeComponent with MuiDialogActionsExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "DialogActions")
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
