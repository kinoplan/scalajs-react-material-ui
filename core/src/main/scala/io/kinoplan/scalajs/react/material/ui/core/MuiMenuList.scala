package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiMenuList extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "MenuList")
  @js.native
  object RawComponent extends js.Function

  def apply(
    disableListWrap: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto
}
