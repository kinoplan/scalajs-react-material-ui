package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiGridList extends ReactBridgeComponent with MuiGridListExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "GridList")
  @js.native
  object RawComponent extends js.Function

  def apply(
    cellHeight: js.UndefOr[Int | CellHeight.Value] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    spacing: js.UndefOr[Int] = js.undefined
  ): WithProps = auto

}

trait MuiGridListExtensions {

  object CellHeight extends Enumeration {
    type Value = String

    val auto = "auto"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
  }

}
