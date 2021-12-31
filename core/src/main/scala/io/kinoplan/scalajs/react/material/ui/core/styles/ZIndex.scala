package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait ZIndex extends js.Object {
  def mobileStepper: Int = js.native
  def appBar: Int = js.native
  def drawer: Int = js.native
  def modal: Int = js.native
  def snackbar: Int = js.native
  def tooltip: Int = js.native
}

object ZIndex {

  def apply(
    mobileStepper: Int,
    appBar: Int,
    drawer: Int,
    modal: Int,
    snackbar: Int,
    tooltip: Int
  ): ZIndex = {
    val o: Map[String, Any] = Map(
      "mobileStepper" -> mobileStepper,
      "appBar" -> appBar,
      "drawer" -> drawer,
      "modal" -> modal,
      "snackbar" -> snackbar,
      "tooltip" -> tooltip
    )

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[ZIndex]
  }

}
