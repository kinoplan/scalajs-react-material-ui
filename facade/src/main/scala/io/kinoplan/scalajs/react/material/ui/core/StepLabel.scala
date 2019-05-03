package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object StepLabel extends ReactBridgeComponent with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "StepLabel")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.Object = js.Object(),
    disabled: Boolean = false,
    error: Boolean = false,
    icon: Option[VdomNode] = None,
    optional: Option[VdomNode] = None,
    StepIconComponent: Option[String | js.Function] = None,
    StepIconProps: js.Object = js.Object()
  ): WithProps = auto
}
