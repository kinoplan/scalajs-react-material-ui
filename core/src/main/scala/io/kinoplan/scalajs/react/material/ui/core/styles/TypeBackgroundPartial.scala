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
    default: js.UndefOr[String] = js.undefined,
    paper: js.UndefOr[String] = js.undefined
  ) = {
    val o: Map[String, Any] = Seq(
      default.toOption.map("default" -> _),
      paper.toOption.map("paper" -> _),
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[TypeBackgroundPartial]
  }
}
