package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait ShapeOptions extends js.Object {
  def borderRadius: js.UndefOr[Double] = js.native
}

object ShapeOptions {
  def apply(borderRadius: js.UndefOr[Double] = js.undefined) = {
    val o: Map[String, Any] = borderRadius.toOption.map("borderRadius" -> _).toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[ShapeOptions]
  }
}
