package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiGridListTile extends ReactBridgeComponent with MuiGridListTileExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "GridListTile")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined
  ): WithProps = auto

}

trait MuiGridListTileExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val tile = "tile"
    val imgFullHeight = "imgFullHeight"
    val imgFullWidth = "imgFullWidth"
  }

}
