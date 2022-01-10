package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

object MuiLinearProgress extends ReactBridgeComponent with MuiLinearProgressExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "LinearProgress")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    value: js.UndefOr[Int] = js.undefined,
    valueBuffer: js.UndefOr[Int] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined
  ): WithPropsNoChildren = autoNoChildren

}

trait MuiLinearProgressExtensions {

  object Color extends Enumeration {
    type Value = String

    val primary = "primary"
    val secondary = "secondary"
  }

  object Variant extends Enumeration {
    type Value = String

    val determinate = "determinate"
    val indeterminate = "indeterminate"
    val buffer = "buffer"
    val query = "query"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val colorPrimary = "colorPrimary"
    val colorSecondary = "colorSecondary"
    val determinate = "determinate"
    val indeterminate = "indeterminate"
    val buffer = "buffer"
    val query = "query"
    val dashed = "dashed"
    val dashedColorPrimary = "dashedColorPrimary"
    val dashedColorSecondary = "dashedColorSecondary"
    val bar = "bar"
    val barColorPrimary = "barColorPrimary"
    val barColorSecondary = "barColorSecondary"
    val bar1Indeterminate = "bar1Indeterminate"
    val bar1Determinate = "bar1Determinate"
    val bar1Buffer = "bar1Buffer"
    val bar2Indeterminate = "bar2Indeterminate"
    val bar2Buffer = "bar2Buffer"
  }

}
