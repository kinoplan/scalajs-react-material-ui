package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait BreakpointValues extends js.Object {
  def xs: Double = js.native
  def sm: Double = js.native
  def md: Double = js.native
  def lg: Double = js.native
  def xl: Double = js.native
}

object BreakpointValues {
  def apply(
    xs: Double,
    sm: Double,
    md: Double,
    lg: Double,
    xl: Double
  ) = {
    val o: Map[String, Any] = Map(
      "xs" -> xs,
      "sm" -> sm,
      "md" -> md,
      "lg" -> lg,
      "xl" -> xl
    )
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[BreakpointValues]
  }
}
