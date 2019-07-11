package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait BreakpointValues extends js.Object {
  def xs: Int = js.native
  def sm: Int = js.native
  def md: Int = js.native
  def lg: Int = js.native
  def xl: Int = js.native
}

object BreakpointValues {
  def apply(
    xs: Int,
    sm: Int,
    md: Int,
    lg: Int,
    xl: Int
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
