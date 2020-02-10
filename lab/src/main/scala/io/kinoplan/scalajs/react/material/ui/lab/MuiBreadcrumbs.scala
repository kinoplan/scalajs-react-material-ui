package io.kinoplan.scalajs.react.material.ui.lab

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.html_<^.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiBreadcrumbs extends ReactBridgeComponent with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/lab", "Breadcrumbs")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[String, String]] = js.undefined,
    component: OptComponentPropType = js.undefined,
    itemsAfterCollapse: js.UndefOr[Int] = js.undefined,
    itemsBeforeCollapse: js.UndefOr[Int] = js.undefined,
    maxItems: js.UndefOr[Int] = js.undefined,
    separator: js.UndefOr[VdomNode] = js.undefined
  ): WithProps = auto
}
