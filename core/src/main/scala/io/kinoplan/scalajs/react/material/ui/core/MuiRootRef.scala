package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiRootRef extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "RootRef")
  @js.native
  object RawComponent extends js.Function

  def apply(
    rootRef: ComponentRefType
  ): WithProps = auto

}
