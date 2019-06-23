package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiGridList extends ReactBridgeComponent with MuiGridListExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "GridList")
  @js.native
  object RawComponent extends js.Function

  def apply(
    cellHeight: Int | CellHeight.Value = 180,
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    cols: Double = 2,
    component: Option[String | js.Function] = Some("ul"),
    spacing: Int = 4
  ): WithProps = auto
}

trait MuiGridListExtensions {
  object CellHeight extends Enumeration {
    val auto = Value("auto")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
  }
}
