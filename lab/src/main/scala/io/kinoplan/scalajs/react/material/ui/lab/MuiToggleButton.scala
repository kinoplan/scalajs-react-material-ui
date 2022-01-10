package io.kinoplan.scalajs.react.material.ui.lab

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiToggleButton extends ReactBridgeComponent with MuiToggleButtonExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/lab", "ToggleButton")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disableRipple: js.UndefOr[Boolean] = js.undefined,
    action: js.UndefOr[js.Function] = js.undefined,
    buttonRef: js.UndefOr[ComponentRefType] = js.undefined,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    focusRipple: js.UndefOr[Boolean] = js.undefined,
    focusVisibleClassName: js.UndefOr[String] = js.undefined,
    onFocusVisible: js.UndefOr[js.Function] = js.undefined,
    TouchRippleProps: js.UndefOr[js.Object] = js.undefined
  ): WithProps = auto

}

trait MuiToggleButtonExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val disabled = "disabled"
    val selected = "selected"
    val label = "label"
    val focusVisible = "focusVisible"
  }

}
