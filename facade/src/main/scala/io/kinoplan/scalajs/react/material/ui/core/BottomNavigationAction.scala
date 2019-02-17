package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.raw.React

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object BottomNavigationAction extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "BottomNavigationAction")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.Object = js.Object(),
    component: Option[String | js.Function] = None,
    icon: Option[String | React.Element] = None,
    label: Option[String | React.Element] = None,
    showLabel: Option[Boolean] = None
  ): WithProps = auto
}
