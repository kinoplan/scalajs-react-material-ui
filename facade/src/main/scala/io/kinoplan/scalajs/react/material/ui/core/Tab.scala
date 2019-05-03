package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Tab extends ReactBridgeComponent with SwitchExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Tab")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.Object = js.Object(),
    disabled: Boolean = false,
    icon: Option[VdomNode] = None,
    label: Option[VdomNode] = None,
    value: Option[js.Any] = None
  ): WithPropsNoChildren = autoNoChildren
}
