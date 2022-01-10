package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

object MuiCardContent extends ReactBridgeComponent with MuiCardContentExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "CardContent")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined
  ): WithPropsNoChildren = autoNoChildren

}

trait MuiCardContentExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
  }

}
