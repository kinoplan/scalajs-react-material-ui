package io.kinoplan.scalajs.react.material.ui.lab

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^.VdomNode

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiBreadcrumbs extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/lab", "Breadcrumbs")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[String, String]] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    itemsAfterCollapse: js.UndefOr[Int] = js.undefined,
    itemsBeforeCollapse: js.UndefOr[Int] = js.undefined,
    maxItems: js.UndefOr[Int] = js.undefined,
    separator: js.UndefOr[VdomNode] = js.undefined
  ): WithProps = auto

}
