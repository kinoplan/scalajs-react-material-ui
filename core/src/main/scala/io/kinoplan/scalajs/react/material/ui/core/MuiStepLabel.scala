package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiStepLabel extends ReactBridgeComponent with MuiStepLabelExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "StepLabel")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    icon: Option[VdomNode] = None,
    optional: Option[VdomNode] = None,
    StepIconComponent: OptComponentPropType = js.undefined,
    StepIconProps: js.UndefOr[js.Object] = js.undefined
  ): WithProps = auto
}

trait MuiStepLabelExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val horizontal = "horizontal"
    val vertical = "vertical"
    val label = "label"
    val active = "active"
    val completed = "completed"
    val error = "error"
    val disabled = "disabled"
    val iconContainer = "iconContainer"
    val alternativeLabel = "alternativeLabel"
    val labelContainer = "labelContainer"
  }
}
