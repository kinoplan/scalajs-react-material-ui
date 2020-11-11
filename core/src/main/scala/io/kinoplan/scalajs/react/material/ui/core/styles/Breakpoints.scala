package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.|

@js.native
trait Breakpoints extends js.Object {
  def keys: js.Array[String] = js.native
  def values: BreakpointValues = js.native
  def up: js.Function1[String | Double, String] = js.native
  def down: js.Function1[String | Double, String] = js.native
  def between: js.Function2[String, String, String] = js.native
  def only: js.Function1[String, String] = js.native
  def width: js.Function1[String, Double] = js.native
}

object Breakpoints {
  def apply(
    keys: js.Array[String],
    values: BreakpointValues,
    up: String | Double => String,
    down: String | Double => String,
    between: String | Double => String,
    only: String | Double => String,
    width: String | Double => String
  ) = {
    val o: Map[String, Any] = Map(
      "keys" -> keys,
      "values" -> values,
      "up" -> up,
      "down" -> down,
      "between" -> between,
      "only" -> only,
      "width" -> width
    )

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[Breakpoints]
  }
}
