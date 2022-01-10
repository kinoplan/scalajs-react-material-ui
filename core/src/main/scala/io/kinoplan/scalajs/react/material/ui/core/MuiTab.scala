package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

object MuiTab extends ReactBridgeComponent with MuiTabExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Tab")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    icon: js.UndefOr[VdomNode] = js.undefined,
    label: js.UndefOr[VdomNode] = js.undefined,
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
  ): WithPropsNoChildren = autoNoChildren

}

trait MuiTabExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val focusVisible = "focusVisible"
    val labelIcon = "labelIcon"
    val textColorInherit = "textColorInherit"
    val textColorPrimary = "textColorPrimary"
    val textColorSecondary = "textColorSecondary"
    val selected = "selected"
    val disabled = "disabled"
    val fullWidth = "fullWidth"
    val wrapper = "wrapper"
    val labelContainer = "labelContainer"
    val label = "label"
    val labelWrapped = "labelWrapped"
  }

}
