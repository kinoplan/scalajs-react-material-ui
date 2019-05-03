package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object BottomNavigationAction extends ReactBridgeComponent with JsWriterImplicits {
  override protected lazy val componentValue: js.Object = RawComponent

  @JSImport("@material-ui/core", "BottomNavigationAction")
  @js.native
  object RawComponent extends js.Object

  def apply(
    classes: js.Object = js.Object(),
    icon: Option[VdomNode] = None,
    label: Option[VdomNode] = None,
    showLabel: Option[Boolean] = None,
    value: Option[js.Any] = None
  ): WithProps = auto
}
