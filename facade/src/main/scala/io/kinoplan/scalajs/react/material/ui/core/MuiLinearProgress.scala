package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiLinearProgress extends ReactBridgeComponent with MuiLinearProgressExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "LinearProgress")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    color: Color.Value = Color.primary,
    value: Option[Int] = None,
    valueBuffer: Option[Int] = None,
    variant: Variant.Value = Variant.indeterminate
  ): WithProps = auto
}

trait MuiLinearProgressExtensions {
  object Color extends Enumeration {
    val primary = Value("primary")
    val secondary = Value("secondary")
  }

  object Variant extends Enumeration {
    val determinate = Value("determinate")
    val indeterminate = Value("indeterminate")
    val buffer = Value("buffer")
    val query = Value("query")
  }

  object ClassKey extends Enumeration {
    type ClassKey = String

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
