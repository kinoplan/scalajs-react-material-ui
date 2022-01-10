package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiCircularProgress extends ReactBridgeComponent with MuiCircularProgressExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "CircularProgress")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    disableShrink: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Int | String] = js.undefined,
    thickness: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Int] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined
  ): WithProps = auto

}

trait MuiCircularProgressExtensions {

  object Color extends Enumeration {
    type Value = String

    val primary = "primary"
    val secondary = "secondary"
    val inherit = "inherit"
  }

  object Variant extends Enumeration {
    type Value = String

    val determinate = "determinate"
    val indeterminate = "indeterminate"
    val static = "static"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val static = "static"
    val indeterminate = "indeterminate"
    val colorPrimary = "colorPrimary"
    val colorSecondary = "colorSecondary"
    val svg = "svg"
    val circle = "circle"
    val circleStatic = "circleStatic"
    val circleIndeterminate = "circleIndeterminate"
    val circleDisableShrink = "circleDisableShrink"
  }

}
