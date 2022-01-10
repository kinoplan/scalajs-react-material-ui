package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiTable extends ReactBridgeComponent with MuiTableExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Table")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    padding: js.UndefOr[Padding.Value] = js.undefined
  ): WithProps = auto

}

trait MuiTableExtensions {

  object Padding extends Enumeration {
    type Value = String

    val default = "default"
    val checkbox = "checkbox"
    val dense = "dense"
    val none = "none"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
  }

}
