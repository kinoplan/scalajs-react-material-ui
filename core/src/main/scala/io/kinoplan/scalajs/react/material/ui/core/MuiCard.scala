package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import io.kinoplan.scalajs.react.material.ui.core.internal.PaperClassKey

object MuiCard extends ReactBridgeComponent with MuiCardExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Card")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    raised: js.UndefOr[Boolean] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    elevation: js.UndefOr[Int] = js.undefined,
    square: js.UndefOr[Boolean] = js.undefined
  ): WithPropsNoChildren = autoNoChildren

}

trait MuiCardExtensions {

  object ClassKey extends Enumeration with PaperClassKey {
    type Value = String
  }

}
