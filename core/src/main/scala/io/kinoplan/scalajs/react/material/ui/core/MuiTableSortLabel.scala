package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiTableSortLabel extends ReactBridgeComponent with MuiTableSortLabelExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "TableSortLabel")
  @js.native
  object RawComponent extends js.Function

  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    direction: js.UndefOr[Direction.Value] = js.undefined,
    hideSortIcon: js.UndefOr[Boolean] = js.undefined,
    IconComponent: js.UndefOr[ComponentPropType] = js.undefined,
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

trait MuiTableSortLabelExtensions {

  object Direction extends Enumeration {
    type Value = String

    val asc = "asc"
    val desc = "desc"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val active = "active"
    val disabled = "disabled"
    val focusVisible = "focusVisible"
    val icon = "icon"
    val iconDirectionDesc = "iconDirectionDesc"
    val iconDirectionAsc = "iconDirectionAsc"
  }

}
