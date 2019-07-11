package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait Easing extends js.Object {
  def easeInOut: String = js.native
  def easeOut: String = js.native
  def easeIn: String = js.native
  def sharp: String = js.native
}

object Easing {
  def apply(
    easeInOut: String,
    easeOut: String,
    easeIn: String,
    sharp: String
  ) = {
    val o: Map[String, Any] = Map(
      "easeInOut" -> easeInOut,
      "easeOut" -> easeOut,
      "easeIn" -> easeIn,
      "sharp" -> sharp
    )
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[Easing]
  }
}
