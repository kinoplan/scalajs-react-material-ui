package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.undefined

object MuiTableBody extends ReactBridgeComponent with MuiTableBodyExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "TableBody")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.Value, String] = Map.empty,
    component: OptComponentPropType = undefined
  ): WithProps = auto
}


trait MuiTableBodyExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
  }
}
