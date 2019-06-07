package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait EasingPartial extends  js.Object {
  def easeInOut: js.UndefOr[String] = js.native
  def easeOut: js.UndefOr[String] = js.native
  def easeIn: js.UndefOr[String] = js.native
  def sharp: js.UndefOr[String] = js.native
}

object EasingPartial {
  def apply(
    easeInOut: Option[String] = None,
    easeOut: Option[String] = None,
    easeIn: Option[String] = None,
    sharp: Option[String] = None
  ) = {
    val o: Map[String, Any] = Seq(
      easeInOut.map("easeInOut" -> _),
      easeOut.map("easeOut" -> _),
      easeIn.map("easeIn" -> _),
      sharp.map("sharp" -> _)
    ).flatten.toMap
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[EasingPartial]
  }
}
