package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait ColorFormatValues extends js.Object {
  def rgb: String = js.native
  def rgba: String = js.native
  def hsl: String = js.native
  def hsla: String = js.native
}

object ColorFormatValues {
  def apply(
    rgb: String,
    rgba: String,
    hsl: String,
    hsla: String
  ) = {
    val o: Map[String, Any] = Map(
      "rgb" -> rgb,
      "rgba" -> rgba,
      "hsl" -> hsl,
      "hsla" -> hsla
    )
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[ColorFormatValues]
  }
}