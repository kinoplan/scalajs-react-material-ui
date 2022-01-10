package io.kinoplan.scalajs.react.material.ui.lab

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.VdomNode

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

object MuiSpeedDialIcon extends ReactBridgeComponent with MuiSpeedDialIconExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/lab", "SpeedDialIcon")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    icon: js.UndefOr[VdomNode] = js.undefined,
    openIcon: js.UndefOr[VdomNode] = js.undefined
  ): WithPropsNoChildren = autoNoChildren

}

trait MuiSpeedDialIconExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val icon = "icon"
    val iconOpen = "iconOpen"
    val iconWithOpenIconOpen = "iconWithOpenIconOpen"
    val openIcon = "openIcon"
    val openIconOpen = "openIconOpen"
  }

}
