package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiTableRow extends ReactBridgeComponent with MuiTableRowExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "TableRow")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    hover: js.UndefOr[Boolean] = js.undefined
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
