package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object FormControl extends ReactBridgeComponent with FormControlExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "FormControl")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.Object = js.Object(),
    component: Option[String | js.Function] = Some("div"),
    disabled: Boolean = false,
    error: Boolean = false,
    fullWidth: Boolean = false,
    margin: Margin.Value = Margin.none,
    required: Boolean = false,
    variant: Variant.Value = Variant.standard
  ): WithProps = auto
}

trait FormControlExtensions {
  object Margin extends Enumeration {
    val none = Value("none")
    val dense = Value("dense")
    val normal = Value("normal")
  }

  object Variant extends Enumeration {
    val standard = Value("standard")
    val outlined = Value("outlined")
    val filled = Value("filled")
  }
}
