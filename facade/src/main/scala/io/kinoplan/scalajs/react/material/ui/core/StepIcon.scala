package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object StepIcon extends ReactBridgeComponent with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "StepIcon")
  @js.native
  object RawComponent extends js.Function

  def apply(
    active: Boolean = false,
    classes: js.Object = js.Object(),
    completed: Boolean = false,
    error: Boolean = false,
    icon: VdomNode
  ): WithPropsNoChildren = autoNoChildren
}
