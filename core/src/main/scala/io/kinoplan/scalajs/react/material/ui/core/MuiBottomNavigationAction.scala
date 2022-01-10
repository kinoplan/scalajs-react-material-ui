package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiBottomNavigationAction extends ReactBridgeComponent with MuiBottomNavigationActionExtensions {
  override protected lazy val componentValue: js.Object = RawComponent

  @JSImport("@mui/material", "BottomNavigationAction")
  @js.native
  object RawComponent extends js.Object

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    icon: js.UndefOr[VdomNode] = js.undefined,
    label: js.UndefOr[VdomNode] = js.undefined,
    showLabel: js.UndefOr[Boolean] = js.undefined,
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

trait MuiBottomNavigationActionExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val selected = "selected"
    val iconOnly = "iconOnly"
    val wrapper = "wrapper"
    val label = "label"
    val disabled = "disabled"
    val focusVisible = "focusVisible"
  }

}
