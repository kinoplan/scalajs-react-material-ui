package io.kinoplan.demo.utils

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait PaperProps extends js.Object {
  def style: js.Dictionary[String] = js.native
}

object PaperProps {
  def apply(
    style: js.Dictionary[String]
  ) = {
    val o: Map[String, Any] = Map(
      "style" -> style
    )
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[PaperProps]
  }
}
