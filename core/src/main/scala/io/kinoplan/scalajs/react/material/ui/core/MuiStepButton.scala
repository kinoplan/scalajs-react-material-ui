package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiStepButton extends ReactBridgeComponent with MuiStepButtonExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "StepButton")
  @js.native
  object RawComponent extends js.Function

  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    completed: js.UndefOr[Boolean] = js.undefined,
    icon: js.UndefOr[VdomNode] = js.undefined,
    optional: js.UndefOr[VdomNode] = js.undefined,
    action: js.UndefOr[js.Function] = js.undefined,
    buttonRef: js.UndefOr[ComponentRefType] = js.undefined,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    disableRipple: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    focusRipple: js.UndefOr[Boolean] = js.undefined,
    focusVisibleClassName: js.UndefOr[String] = js.undefined,
    onFocusVisible: js.UndefOr[js.Function] = js.undefined,
    TouchRippleProps: js.UndefOr[js.Object] = js.undefined
  ): WithProps = auto

}

trait MuiStepButtonExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val horizontal = "horizontal"
    val vertical = "vertical"
    val touchRipple = "touchRipple"
    val disabled = "disabled"
    val focusVisible = "focusVisible"
  }

}
