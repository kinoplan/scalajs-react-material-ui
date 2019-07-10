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
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    icon: js.UndefOr[VdomNode] = js.undefined,
    label: js.UndefOr[VdomNode] = js.undefined,
    showLabel: js.UndefOr[Boolean] = js.undefined
  ): WithProps = auto
}

trait MuiBottomNavigationActionExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val selected = "selected"
    val iconOnly = "iconOnly"
    val wrapper = "wrapper"
    val label = "label"
  }
}
