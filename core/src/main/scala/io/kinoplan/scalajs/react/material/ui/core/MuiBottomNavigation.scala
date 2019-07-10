package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.ReactEvent

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiBottomNavigation extends ReactBridgeComponent with MuiBottomNavigationExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "BottomNavigation")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: OptComponentPropType = js.undefined,
    onChange: ReactHandler2[ReactEvent, js.Any] = js.undefined,
    showLabels: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto
}

trait MuiBottomNavigationExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
  }
}
