package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiTableSortLabel extends ReactBridgeComponent with MuiTableSortLabelExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "TableSortLabel")
  @js.native
  object RawComponent extends js.Function

  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    direction: js.UndefOr[Direction.Value] = js.undefined,
    hideSortIcon: js.UndefOr[Boolean] = js.undefined,
    IconComponent: OptComponentPropType = js.undefined,
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
