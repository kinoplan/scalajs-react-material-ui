package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiCardActionArea extends ReactBridgeComponent with MuiCardActionAreaExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "CardActionArea")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    action: js.UndefOr[js.Function] = js.undefined,
    buttonRef: OptComponentRefType = js.undefined,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    component: OptComponentPropType = js.undefined,
    disableRipple: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    focusRipple: js.UndefOr[Boolean] = js.undefined,
    focusVisibleClassName: js.UndefOr[String] = js.undefined,
    onFocusVisible: js.UndefOr[js.Function] = js.undefined,
    TouchRippleProps: js.UndefOr[js.Object] = js.undefined
  ): WithProps = auto
}

trait MuiCardActionAreaExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val focusVisible = "focusVisible"
    val focusHighlight = "focusHighlight"
    val disabled = "disabled"
  }
}
