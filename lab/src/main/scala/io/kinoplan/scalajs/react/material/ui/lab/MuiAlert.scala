package io.kinoplan.scalajs.react.material.ui.lab

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.ReactEvent
import japgolly.scalajs.react.vdom.html_<^.VdomNode

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import io.kinoplan.scalajs.react.material.ui.lab.internal.IconMapping

object MuiAlert extends ReactBridgeComponent with MuiAlertExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/lab", "Alert")
  @js.native
  object RawComponent extends js.Function

  def apply(
    action: js.UndefOr[VdomNode] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    closeText: js.UndefOr[String] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    icon: js.UndefOr[VdomNode] = js.undefined,
    iconMapping: js.UndefOr[IconMapping] = js.undefined,
    onClose: js.UndefOr[ReactHandler1[ReactEvent]] = js.undefined,
    severity: js.UndefOr[Severity.Value] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined
  ): WithProps = auto
}

trait MuiAlertExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val standardSuccess = "standardSuccess"
    val standardInfo = "standardInfo"
    val standardWarning = "standardWarning"
    val standardError	= "standardError"
    val outlinedSuccess = "outlinedSuccess"
    val outlinedInfo = "outlinedInfo"
    val outlinedWarning = "outlinedWarning"
    val outlinedError = "outlinedError"
    val filledSuccess = "filledSuccess"
    val filledInfo = "filledInfo"
    val filledWarning = "filledWarning"
    val filledError = "filledError"
    val icon = "icon"
    val message = "message"
    val action = "action"
  }

  object Color extends Enumeration {
    type Value = String

    val error = "error"
    val info = "info"
    val success = "success"
    val warning = "warning"
  }

  object Severity extends Enumeration {
    type Value = String

    val error = "error"
    val info = "info"
    val success = "success"
    val warning = "warning"
  }

  object Variant extends Enumeration {
    type Value = String

    val filled = "filled"
    val outlined = "outlined"
    val standard = "standard"
  }
}
