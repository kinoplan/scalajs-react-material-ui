package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import japgolly.scalajs.react.ReactEvent

object MuiBottomNavigation extends ReactBridgeComponent with MuiBottomNavigationExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "BottomNavigation")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    component: Option[String | js.Function] = Some("div"),
    onChange: ReactHandler2[ReactEvent, js.Any] = js.undefined,
    showLabels: Boolean = false,
    value: Option[js.Any] = None
  ): WithProps = auto
}

trait MuiBottomNavigationExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
  }
}
