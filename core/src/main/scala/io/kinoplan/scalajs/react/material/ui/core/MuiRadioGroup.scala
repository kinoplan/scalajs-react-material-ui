package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiRadioGroup extends ReactBridgeComponent with MuiRadioGroupExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "RadioGroup")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    row: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto

}

trait MuiRadioGroupExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val row = "row"
  }

}
