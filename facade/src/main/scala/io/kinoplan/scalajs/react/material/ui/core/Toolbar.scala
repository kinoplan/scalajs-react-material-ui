package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Toolbar extends ReactBridgeComponent with ToolbarExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Toolbar")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.Object = js.Object(),
    disableGutters: Boolean = false,
    variant: Variant.Value = Variant.regular
  ): WithProps = auto
}

trait ToolbarExtensions {
  object Variant extends Enumeration {
    val regular = Value("regular")
    val dense = Value("dense")
  }
}
