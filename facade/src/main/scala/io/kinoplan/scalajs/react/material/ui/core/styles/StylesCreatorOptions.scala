package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait StylesCreatorOptions extends js.Object {
  def index: Int = js.native
}

object StylesCreatorOptions {
  def apply(index: Int) = {
    val o: Map[String, Any] = Map("index" -> index)
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[StylesCreatorOptions]
  }
}
