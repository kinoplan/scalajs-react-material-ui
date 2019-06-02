package io.kinoplan.scalajs.react.material.ui.core.colors

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait CommonColorsPartial extends js.Object {
  def black: js.UndefOr[String] = js.native
  def white: js.UndefOr[String] = js.native
}

object CommonColorsPartial {
  def apply(
    black: Option[String] = None,
    white: Option[String] = None
  ) = {
    val o: Map[String, Any] = Seq(
      black.map("black" -> _),
      white.map("white" -> _)
    ).flatten.toMap
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[CommonColorsPartial]
  }
}
