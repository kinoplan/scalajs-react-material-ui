package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiFormGroup extends ReactBridgeComponent with MuiFormGroupExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "FormGroup")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.ClassKey, String]] = js.undefined,
    row: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto

}

trait MuiFormGroupExtensions {

  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val row = "row"
  }

}
