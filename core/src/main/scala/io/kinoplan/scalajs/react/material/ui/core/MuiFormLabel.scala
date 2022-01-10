package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiFormLabel extends ReactBridgeComponent with MuiFormLabelExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "FormLabel")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    filled: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto

}

trait MuiFormLabelExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val focused = "focused"
    val disabled = "disabled"
    val error = "error"
    val filled = "filled"
    val required = "required"
    val asterisk = "asterisk"
  }

}
