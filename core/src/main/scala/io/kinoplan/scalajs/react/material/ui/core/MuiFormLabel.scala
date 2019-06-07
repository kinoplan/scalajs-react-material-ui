package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiFormLabel extends ReactBridgeComponent with MuiFormLabelExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "FormLabel")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    component: Option[String | js.Function] = Some("label"),
    disabled: Option[Boolean] = None,
    error: Option[Boolean] = None,
    filled: Option[Boolean] = None,
    focused: Option[Boolean] = None,
    required: Option[Boolean] = None
  ): WithProps = auto
}

trait MuiFormLabelExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val focused = "focused"
    val disabled = "disabled"
    val error = "error"
    val filled = "filled"
    val required = "required"
    val asterisk = "asterisk"
  }
}
