package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object FormHelperText extends ReactBridgeComponent with FormHelperTextExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "FormHelperText")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.Object = js.Object(),
    component: Option[String | js.Function] = Some("p"),
    disabled: Option[Boolean] = None,
    error: Option[Boolean] = None,
    filled: Option[Boolean] = None,
    focused: Option[Boolean] = None,
    margin: Option[Margin.Value] = None,
    required: Option[Boolean] = None,
    variant: Option[Variant.Value] = None
  ): WithProps = auto
}

trait FormHelperTextExtensions {
  object Margin extends Enumeration {
    val dense = Value("dense")
  }

  object Variant extends Enumeration {
    val standard = Value("standard")
    val outlined = Value("outlined")
    val filled = Value("filled")
  }
}
