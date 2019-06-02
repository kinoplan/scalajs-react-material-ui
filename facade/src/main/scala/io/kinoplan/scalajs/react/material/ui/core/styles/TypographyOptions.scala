package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait TypographyOptions extends js.Object {}

object TypographyOptions {
  def apply(options: (String, Any)*): TypographyOptions = {
    val o: Map[String, Any] = options.toMap
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[TypographyOptions]
  }
}
