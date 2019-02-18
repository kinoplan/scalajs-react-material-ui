package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Table extends ReactBridgeComponent with TableExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Table")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.Object = js.Object(),
    component: Option[String | js.Function] = Some("table"),
    padding: Padding.Value = Padding.default
  ): WithProps = auto
}

trait TableExtensions {
  object Padding extends Enumeration {
    val default = Value("default")
    val checkbox = Value("checkbox")
    val dense = Value("dense")
    val none = Value("none")
  }
}
