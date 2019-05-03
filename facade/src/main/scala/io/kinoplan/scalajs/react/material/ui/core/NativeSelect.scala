package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.raw.React

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object NativeSelect extends ReactBridgeComponent with NativeSelectExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "NativeSelect")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.Object = js.Object(),
    IconComponent: Option[String | js.Function] = Some("ArrowDropDownIcon"),
    input: Option[React.Element] = None,
    inputProps: js.Object = js.Object(),
    onChange: Option[js.Function] = None,
    value: Option[String | Int | Boolean] = None,
    variant: Option[Variant.Value] = None
  ): WithProps = auto
}

trait NativeSelectExtensions {
  object Variant extends Enumeration {
    val standard = Value("standard")
    val outlined = Value("outlined")
    val filled = Value("filled")
  }
}
