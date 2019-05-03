package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object LinearProgress extends ReactBridgeComponent with LinearProgressExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "LinearProgress")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.Object = js.Object(),
    color: Color.Value = Color.primary,
    value: Option[Int] = None,
    valueBuffer: Option[Int] = None,
    variant: Variant.Value = Variant.indeterminate
  ): WithProps = auto
}

trait LinearProgressExtensions {
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
}
