package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.{UndefOr, undefined}

object MuiTableSortLabel extends ReactBridgeComponent with MuiTableSortLabelExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "TableSortLabel")
  @js.native
  object RawComponent extends js.Function

  def apply(
    active: UndefOr[Boolean] = undefined,
    classes: Map[ClassKey.Value, String] = Map.empty,
    direction: UndefOr[Direction.Value] = undefined,
    hideSortIcon: UndefOr[Boolean] = undefined,
    IconComponent: OptComponentPropType = undefined,
    action: UndefOr[js.Function] = undefined,
    buttonRef: OptComponentRefType = undefined,
    centerRipple: UndefOr[Boolean] = undefined,
    component: OptComponentPropType = undefined,
    disableRipple: UndefOr[Boolean] = undefined,
    disableTouchRipple: UndefOr[Boolean] = undefined,
    focusRipple: UndefOr[Boolean] = undefined,
    focusVisibleClassName: UndefOr[String] = undefined,
    onFocusVisible: UndefOr[js.Function] = undefined,
    TouchRippleProps: UndefOr[js.Object] = undefined
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
