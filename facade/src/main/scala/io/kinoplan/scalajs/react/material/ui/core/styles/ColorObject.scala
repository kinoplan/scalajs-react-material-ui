package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.|

@js.native
trait ColorObject extends js.Object {
  def `type`: ColorFormatValues = js.native
  def values: (Double, Double, Double) | (Double, Double, Double, Double) = js.native
}

object ColorObject {
  def apply(
    `type`: ColorFormatValues,
    values: (Double, Double, Double) | (Double, Double, Double, Double)
  ) = {
    val o: Map[String, Any] = Map(
      "type" -> `type`,
      "values" -> values
    )
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[ColorObject]
  }
}
