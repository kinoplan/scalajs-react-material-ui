package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiTable extends ReactBridgeComponent with MuiTableExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Table")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    component: Option[String | js.Function] = Some("table"),
    padding: Padding.Value = Padding.default
  ): WithProps = auto
}

trait MuiTableExtensions {
  object Padding extends Enumeration {
    val default = Value("default")
    val checkbox = Value("checkbox")
    val dense = Value("dense")
    val none = Value("none")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
  }
}
