package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait TypeBackgroundPartial extends js.Object {
  def default: js.UndefOr[String] = js.native
  def paper: js.UndefOr[String] = js.native
}

object TypeBackgroundPartial {
  def apply(
    default: Option[String] = None,
    paper: Option[String] = None
  ) = {
    val o: Map[String, Any] = Seq(
      default.map("default" -> _),
      paper.map("paper" -> _)
    ).flatten.toMap
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[TypeBackgroundPartial]
  }
}
