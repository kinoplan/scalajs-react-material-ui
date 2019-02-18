package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object TableSortLabel extends ReactBridgeComponent with TableSortLabelExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "TableSortLabel")
  @js.native
  object RawComponent extends js.Function

  def apply(
    active: Boolean = false,
    classes: js.Object = js.Object(),
    direction: Direction.Value = Direction.desc,
    hideSortIcon: Boolean = false,
    IconComponent: js.UndefOr[js.Function] = js.undefined
  ): WithProps = auto
}

trait TableSortLabelExtensions {
  object Direction extends Enumeration {
    val asc = Value("asc")
    val desc = Value("desc")
  }
}
