package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.{UndefOr, undefined}

object MuiTableRow extends ReactBridgeComponent with MuiTableRowExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "TableRow")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.Value, String] = Map.empty,
    component: OptComponentPropType = undefined,
    hover: UndefOr[Boolean] = undefined
  ): WithProps = auto
}

trait MuiTableRowExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val selected = "selected"
    val hover = "hover"
    val head = "head"
    val footer = "footer"
  }
}
