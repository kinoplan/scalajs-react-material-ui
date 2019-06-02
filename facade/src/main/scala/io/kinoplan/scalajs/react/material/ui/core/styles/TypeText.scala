package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait TypeText extends js.Object {
  def primary: String = js.native
  def secondary: String = js.native
  def disabled: String = js.native
  def hint: String = js.native
}

object TypeText {
  def apply(
    primary: String,
    secondary: String,
    disabled: String,
    hint: String
  ) = {
    val o: Map[String, Any] = Map(
      "primary" -> primary,
      "secondary" -> secondary,
      "disabled" -> disabled,
      "hint" -> hint
    )
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[TypeText]
  }
}
