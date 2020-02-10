package io.kinoplan.scalajs.react.material.ui.lab

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiSpeedDialIcon extends ReactBridgeComponent with MuiSpeedDialIconExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/lab", "SpeedDialIcon")
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
