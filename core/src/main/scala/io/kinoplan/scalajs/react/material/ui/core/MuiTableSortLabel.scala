package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiTableSortLabel extends ReactBridgeComponent with MuiTableSortLabelExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "TableSortLabel")
  @js.native
  object RawComponent extends js.Function

  def apply(
    active: Boolean = false,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    direction: Direction.Value = Direction.desc,
    hideSortIcon: Boolean = false,
    IconComponent: Option[String | js.Function] = Some("ArrowDownwardIcon")
  ): WithProps = auto
}

trait MuiTableSortLabelExtensions {
  object Direction extends Enumeration {
    val asc = Value("asc")
    val desc = Value("desc")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val active = "active"
    val icon = "icon"
    val iconDirectionDesc = "iconDirectionDesc"
    val iconDirectionAsc = "iconDirectionAsc"
  }
}
