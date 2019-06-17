package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiDivider extends ReactBridgeComponent with MuiDividerExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Divider")
  @js.native
  object RawComponent extends js.Function

  def apply(
    absolute: Boolean = false,
    classes: Map[ClassKey.Value, String] = Map.empty,
    component: OptComponentPropType = js.undefined,
    inset: Option[Boolean] = None,
    light: Boolean = false,
    variant: Variant.Value = Variant.fullWidth
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiDividerExtensions {
  object Variant extends Enumeration {
    type Value = String

    val fullWidth = "fullWidth"
    val inset = "inset"
    val middle = "middle"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val absolute = "absolute"
    val inset = "inset"
    val light = "light"
    val middle = "middle"
  }
}
