package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait TypeTextPartial extends js.Object {
  def primary: js.UndefOr[String] = js.native
  def secondary: js.UndefOr[String] = js.native
  def disabled: js.UndefOr[String] = js.native
  def hint: js.UndefOr[String] = js.native
}

object TypeTextPartial {
  def apply(
    primary: Option[String] = None,
    secondary: Option[String] = None,
    disabled: Option[String] = None,
    hint: Option[String] = None
  ) = {
    val o: Map[String, Any] = Seq(
      primary.map("primary" -> _),
      secondary.map("secondary" -> _),
      disabled.map("disabled" -> _),
      hint.map("hint" -> _)
    ).flatten.toMap
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[TypeTextPartial]
  }
}
