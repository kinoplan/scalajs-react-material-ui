package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiGridListTile extends ReactBridgeComponent with MuiGridListTileExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "GridListTile")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    cols: Int = 1,
    component: OptComponentPropType = "li",
    rows: Int = 1
  ): WithProps = auto
}

trait MuiGridListTileExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val tile = "tile"
    val imgFullHeight = "imgFullHeight"
    val imgFullWidth = "imgFullWidth"
  }
}
