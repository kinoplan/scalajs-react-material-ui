package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object TouchRipple extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core/ButtonBase", "TouchRipple")
  @js.native
  object RawComponent extends js.Function

  def apply(
    center: Boolean = false,
    classes: js.Object = js.Object()
  ): WithPropsNoChildren = autoNoChildren
}
