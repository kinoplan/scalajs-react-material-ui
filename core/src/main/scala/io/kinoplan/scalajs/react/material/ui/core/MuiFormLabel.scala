package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiFormLabel extends ReactBridgeComponent with MuiFormLabelExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "FormLabel")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: OptComponentPropType = js.undefined,
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
