package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiInputAdornment extends ReactBridgeComponent with MuiInputAdornmentExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "InputAdornment")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    disablePointerEvents: js.UndefOr[Boolean] = js.undefined,
    disableTypography: js.UndefOr[Boolean] = js.undefined,
    position: js.UndefOr[Position.Value] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined
  ): WithProps = auto

}

trait MuiInputAdornmentExtensions {

  object Position extends Enumeration {
    type Value = String

    val start = "start"
    val end = "end"
  }

  object Variant extends Enumeration {
    type Value = String

    val standard = "standard"
    val outlined = "outlined"
    val filled = "filled"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val filled = "filled"
    val positionStart = "positionStart"
    val positionEnd = "positionEnd"
    val disablePointerEvents = "disablePointerEvents"
  }

}
