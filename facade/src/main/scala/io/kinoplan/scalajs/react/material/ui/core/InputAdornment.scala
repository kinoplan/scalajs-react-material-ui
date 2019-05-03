package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object InputAdornment extends ReactBridgeComponent with InputAdornmentExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "InputAdornment")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.Object = js.Object(),
    component: Option[String | js.Function] = Some("div"),
    disablePointerEvents: Boolean = false,
    disableTypography: Boolean = false,
    position: Option[Position.Value] = None,
    variant: Option[Variant.Value] = None
  ): WithProps = auto
}

trait InputAdornmentExtensions {
  object Position extends Enumeration {
    val start = Value("start")
    val end = Value("end")
  }

  object Variant extends Enumeration {
    val standard = Value("standard")
    val outlined = Value("outlined")
    val filled = Value("filled")
  }
}
