package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object InputLabel extends ReactBridgeComponent with InputLabelExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "InputLabel")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.Object = js.Object(),
    disableAnimation: Boolean = false,
    disabled: Option[Boolean] = None,
    error: Option[Boolean] = None,
    focused: Option[Boolean] = None,
    FormLabelClasses: js.Object = js.Object(),
    margin: Option[Margin.Value] = None,
    required: Option[Boolean] = None,
    shrink: Option[Boolean] = None,
    variant: Option[Variant.Value] = None
  ): WithProps = auto
}

trait InputLabelExtensions {
  object Margin extends Enumeration {
    val dense = Value("dense")
  }

  object Variant extends Enumeration {
    val standard = Value("standard")
    val outlined = Value("outlined")
    val filled = Value("filled")
  }
}
