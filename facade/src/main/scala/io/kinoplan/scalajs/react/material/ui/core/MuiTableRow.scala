package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiTableRow extends ReactBridgeComponent with MuiTableRowExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "TableRow")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    component: Option[String | js.Function] = Some("tr"),
    hover: Boolean = false,
    selected: Boolean = false
  ): WithProps = auto
}

trait MuiTableRowExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val selected = "selected"
    val hover = "hover"
    val head = "head"
    val footer = "footer"
  }
}
