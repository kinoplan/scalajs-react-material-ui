package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait TypeObject extends js.Object {
  def text: TypeText = js.native
  def action: TypeAction = js.native
  def divider: String = js.native
  def background: TypeBackground = js.native
}

object TypeObject {
  def apply(
    text: TypeText,
    action: TypeAction,
    divider: String,
    background: TypeBackground
  ) = {
    val o: Map[String, Any] = Map(
      "text" -> text,
      "action" -> action,
      "divider" -> divider,
      "background" -> background
    )

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[TypeObject]
  }
}
