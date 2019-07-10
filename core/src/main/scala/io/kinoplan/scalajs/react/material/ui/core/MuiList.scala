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
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: OptComponentPropType = js.undefined,
    dense: js.UndefOr[Boolean] = js.undefined,
    disablePadding: js.UndefOr[Boolean] = js.undefined,
    subheader: js.UndefOr[VdomNode] = js.undefined
  ): WithProps = auto
}

trait MuiListExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val padding = "padding"
    val dense = "dense"
    val subheader = "subheader"
  }
}
