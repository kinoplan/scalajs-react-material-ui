package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait EasingPartial extends js.Object {
  def easeInOut: js.UndefOr[String] = js.native
  def easeOut: js.UndefOr[String] = js.native
  def easeIn: js.UndefOr[String] = js.native
  def sharp: js.UndefOr[String] = js.native
}

object EasingPartial {

  def apply(
    easeInOut: js.UndefOr[String] = js.undefined,
    easeOut: js.UndefOr[String] = js.undefined,
    easeIn: js.UndefOr[String] = js.undefined,
    sharp: js.UndefOr[String] = js.undefined
  ) = {
    val o: Map[String, Any] = Seq(
      easeInOut.toOption.map("easeInOut" -> _),
      easeOut.toOption.map("easeOut" -> _),
      easeIn.toOption.map("easeIn" -> _),
      sharp.toOption.map("sharp" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[EasingPartial]
  }

}
