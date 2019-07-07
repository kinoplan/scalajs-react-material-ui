package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.{Function, Object, UndefOr, undefined}

object MuiButtonBase extends ReactBridgeComponent with MuiButtonBaseExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "ButtonBase")
  @js.native
  object RawComponent extends js.Function

  def apply(
    action: UndefOr[Function] = undefined,
    buttonRef: OptComponentRefType = undefined,
    centerRipple: UndefOr[Boolean] = undefined,
    classes: Map[ClassKey.Value, String] = Map.empty,
    component: OptComponentPropType = undefined,
    disableRipple: UndefOr[Boolean] = undefined,
    disableTouchRipple: UndefOr[Boolean] = undefined,
    focusRipple: UndefOr[Boolean] = undefined,
    focusVisibleClassName: UndefOr[String] = undefined,
    onFocusVisible: UndefOr[Function] = undefined,
    TouchRippleProps: UndefOr[Object] = undefined
  ): WithProps = auto
}

trait MuiButtonBaseExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val disabled = "disabled"
    val focusVisible = "focusVisible"
  }
}
