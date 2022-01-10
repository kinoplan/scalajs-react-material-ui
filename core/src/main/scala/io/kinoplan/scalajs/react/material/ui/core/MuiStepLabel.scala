package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiStepLabel extends ReactBridgeComponent with MuiStepLabelExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "StepLabel")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    icon: js.UndefOr[VdomNode] = js.undefined,
    optional: js.UndefOr[VdomNode] = js.undefined,
    StepIconComponent: js.UndefOr[ComponentPropType] = js.undefined,
    StepIconProps: js.UndefOr[js.Object] = js.undefined
  ): WithProps = auto

}

trait MuiStepLabelExtensions {

  object ClassKey extends Enumeration {
    type Value = String

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
