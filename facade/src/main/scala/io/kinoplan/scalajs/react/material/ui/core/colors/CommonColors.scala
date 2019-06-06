package io.kinoplan.scalajs.react.material.ui.core.colors

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait CommonColors extends js.Object {
  def black: String = js.native
  def white: String = js.native
}

object CommonColors {
  def apply(
    black: String,
    white: String
  ) = {
    val o: Map[String, Any] = Map(
      "black" -> black,
      "white" -> white
    )
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[CommonColors]
  }
}