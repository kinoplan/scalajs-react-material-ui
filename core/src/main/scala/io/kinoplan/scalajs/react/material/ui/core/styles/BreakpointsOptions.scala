package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.|

@js.native
trait BreakpointsOptions extends js.Object {
  def unit: js.UndefOr[String] = js.native
  def step: js.UndefOr[Double] = js.native
  def keys: js.UndefOr[js.Array[String]] = js.native
  def values: js.UndefOr[BreakpointValues] = js.native
  def up: js.UndefOr[js.Function1[String | Double, String]] = js.native
  def down: js.UndefOr[js.Function1[String | Double, String]] = js.native
  def between: js.UndefOr[js.Function2[String, String, String]] = js.native
  def only: js.UndefOr[js.Function1[String, String]] = js.native
  def width: js.UndefOr[js.Function1[String, Double]] = js.native
}

object BreakpointsOptions {

  def apply(
    unit: js.UndefOr[String] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    keys: js.UndefOr[js.Array[String]] = js.undefined,
    values: js.UndefOr[BreakpointValues] = js.undefined,
    up: js.UndefOr[String | Double => String] = js.undefined,
    down: js.UndefOr[String | Double => String] = js.undefined,
    between: js.UndefOr[(String, String) => String] = js.undefined,
    only: js.UndefOr[String => String] = js.undefined,
    width: js.UndefOr[String => Double] = js.undefined
  ) = {
    val o: Map[String, Any] = Seq(
      unit.toOption.map("unit" -> _),
      step.toOption.map("step" -> _),
      keys.toOption.map("keys" -> _),
      values.toOption.map("values" -> _),
      up.toOption.map("up" -> _),
      down.toOption.map("down" -> _),
      between.toOption.map("between" -> _),
      only.toOption.map("only" -> _),
      width.toOption.map("width" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[BreakpointsOptions]
  }

}
