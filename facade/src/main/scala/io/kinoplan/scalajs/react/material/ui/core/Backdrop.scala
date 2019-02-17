package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import io.kinoplan.scalajs.react.material.ui.internal.Transition

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Backdrop extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Backdrop")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.Object = js.Object(),
    invisible: Boolean = false,
    open: Boolean,
    transitionDuration: Option[Transition.Duration] = None
  ): WithPropsNoChildren = autoNoChildren
}

