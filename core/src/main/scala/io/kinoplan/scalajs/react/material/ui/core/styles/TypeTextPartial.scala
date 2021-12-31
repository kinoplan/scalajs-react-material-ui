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
    primary: js.UndefOr[String] = js.undefined,
    secondary: js.UndefOr[String] = js.undefined,
    disabled: js.UndefOr[String] = js.undefined,
    hint: js.UndefOr[String] = js.undefined
  ) = {
    val o: Map[String, Any] = Seq(
      primary.toOption.map("primary" -> _),
      secondary.toOption.map("secondary" -> _),
      disabled.toOption.map("disabled" -> _),
      hint.toOption.map("hint" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[TypeTextPartial]
  }

}
