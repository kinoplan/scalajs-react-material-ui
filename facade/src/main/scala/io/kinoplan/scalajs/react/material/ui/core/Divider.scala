package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Divider extends ReactBridgeComponent with DividerExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Divider")
  @js.native
  object RawComponent extends js.Function

  def apply(
    absolute: Boolean = false,
    classes: js.Object = js.Object(),
    component: Option[String | js.Function] = Some("hr"),
    inset: Option[Boolean] = None,
    light: Boolean = false,
    variant: Variant.Value = Variant.fullWidth
  ): WithPropsNoChildren = autoNoChildren
}

trait DividerExtensions {
  object Variant extends Enumeration {
    val fullWidth = Value("fullWidth")
    val inset = Value("inset")
    val middle = Value("middle")
  }
}
