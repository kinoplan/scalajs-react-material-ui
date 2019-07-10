package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiTab extends ReactBridgeComponent with MuiTabExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Tab")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.Value, String] = Map.empty,
    icon: js.UndefOr[VdomNode] = js.undefined,
    label: js.UndefOr[VdomNode] = js.undefined,
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
    val textColorSecondary	= "textColorSecondary"
    val selected = "selected"
    val disabled = "disabled"
    val fullWidth = "fullWidth"
    val wrapper = "wrapper"
    val labelContainer = "labelContainer"
    val label = "label"
    val labelWrapped = "labelWrapped"
  }
}
