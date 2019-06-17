package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiList extends ReactBridgeComponent with MuiListExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "List")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty,
    component: OptComponentPropType = js.undefined,
    dense: Boolean = false,
    disablePadding: Boolean = false,
    subheader: Option[VdomNode] = None
  ): WithProps = auto
}

trait MuiListExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val padding = "padding"
    val dense = "dense"
    val subheader = "subheader"
  }
}
