package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiRootRef extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "RootRef")
  @js.native
  object RawComponent extends js.Function

  def apply(
    rootRef: js.Function | js.Object
  ): WithProps = auto
}
