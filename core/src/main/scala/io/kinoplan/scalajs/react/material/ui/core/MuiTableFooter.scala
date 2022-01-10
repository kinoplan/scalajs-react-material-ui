package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiTableFooter extends ReactBridgeComponent with MuiTableFooterExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "TableFooter")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined
  ): WithProps = auto

}

trait MuiTableFooterExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
  }

}
