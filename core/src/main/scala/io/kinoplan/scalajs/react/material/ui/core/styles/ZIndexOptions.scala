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
    mobileStepper: js.UndefOr[Int] = js.undefined,
    appBar: js.UndefOr[Int] = js.undefined,
    drawer: js.UndefOr[Int] = js.undefined,
    modal: js.UndefOr[Int] = js.undefined,
    snackbar: js.UndefOr[Int] = js.undefined,
    tooltip: js.UndefOr[Int] = js.undefined
  ): ZIndexOptions = {
    val o: Map[String, Any] = Seq(
      mobileStepper.toOption.map("mobileStepper" -> _),
      appBar.toOption.map("appBar" -> _),
      drawer.toOption.map("drawer" -> _),
      modal.toOption.map("modal" -> _),
      snackbar.toOption.map("snackbar" -> _),
      tooltip.toOption.map("tooltip" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[ZIndexOptions]
  }
}
