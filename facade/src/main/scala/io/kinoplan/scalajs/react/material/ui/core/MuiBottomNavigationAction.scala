package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiBottomNavigationAction extends ReactBridgeComponent with MuiBottomNavigationActionExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Object = RawComponent

  @JSImport("@material-ui/core", "BottomNavigationAction")
  @js.native
  object RawComponent extends js.Object

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    icon: Option[VdomNode] = None,
    label: Option[VdomNode] = None,
    showLabel: Option[Boolean] = None,
    value: Option[js.Any] = None
  ): WithProps = auto
}

trait MuiBottomNavigationActionExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val selected = "selected"
    val iconOnly = "iconOnly"
    val wrapper = "wrapper"
    val label = "label"
  }
}
