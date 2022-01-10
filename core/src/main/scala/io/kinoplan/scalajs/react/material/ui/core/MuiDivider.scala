package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

object MuiDivider extends ReactBridgeComponent with MuiDividerExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Divider")
  @js.native
  object RawComponent extends js.Function

  def apply(
    absolute: js.UndefOr[Boolean] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    inset: js.UndefOr[Boolean] = js.undefined,
    light: js.UndefOr[Boolean] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined
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
