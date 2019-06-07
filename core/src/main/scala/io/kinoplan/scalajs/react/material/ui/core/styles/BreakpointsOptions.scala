package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.|

@js.native
trait BreakpointsOptions extends js.Object {
  def unit: js.UndefOr[String] = js.native
  def step: js.UndefOr[Double] = js.native
  def keys: Array[String] = js.native
  def values: BreakpointValues = js.native
  def up: js.Function1[String | Double, String] = js.native
  def down: js.Function1[String | Double, String] = js.native
  def between: js.Function2[String, String, String] = js.native
  def only: js.Function1[String, String] = js.native
  def width: js.Function1[String, Double] = js.native
}

object BreakpointsOptions {
  def apply(
    unit: Option[String] = None,
    step: Option[Double] = None,
    keys: Option[Array[String]] = None,
    values: Option[BreakpointValues] = None,
    up: Option[String | Double => String] = None,
    down: Option[String | Double => String] = None,
    between: Option[(String, String) => String] = None,
    only: Option[String => String] = None,
    width: Option[String => Double] = None
  ) = {
    val o: Map[String, Any] = Seq(
      unit.map("unit" -> _),
      step.map("step" -> _),
      keys.map("keys" -> _),
      values.map("values" -> _),
      up.map("up" -> _),
      down.map("down" -> _),
      between.map("between" -> _),
      only.map("only" -> _),
      width.map("width" -> _)
    ).flatten.toMap
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[BreakpointsOptions]
  }
}
