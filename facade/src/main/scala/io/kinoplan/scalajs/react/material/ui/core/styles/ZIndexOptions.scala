package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait ZIndexOptions extends js.Object {
  def mobileStepper: js.UndefOr[Int] = js.native
  def appBar: js.UndefOr[Int] = js.native
  def drawer: js.UndefOr[Int] = js.native
  def modal: js.UndefOr[Int] = js.native
  def snackbar: js.UndefOr[Int] = js.native
  def tooltip: js.UndefOr[Int] = js.native
}

object ZIndexOptions {
  def apply(
    mobileStepper: Option[Int] = None,
    appBar: Option[Int] = None,
    drawer: Option[Int] = None,
    modal: Option[Int] = None,
    snackbar: Option[Int] = None,
    tooltip: Option[Int] = None
  ): ZIndexOptions = {
    val o: Map[String, Any] = Seq(
      mobileStepper.map("mobileStepper" -> _),
      appBar.map("appBar" -> _),
      drawer.map("drawer" -> _),
      modal.map("modal" -> _),
      snackbar.map("snackbar" -> _),
      tooltip.map("tooltip" -> _)
    ).flatten.toMap
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[ZIndexOptions]
  }
}
