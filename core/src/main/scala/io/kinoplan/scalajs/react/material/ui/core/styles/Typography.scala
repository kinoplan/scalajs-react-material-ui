package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait Typography extends js.Object {
  def pxToRem: js.Function1[Int, String] = js.native
  def round: js.Function1[Double, Int] = js.native
  def fontFamily: String = js.native
  def fontSize: Int = js.native
  def fontWeightLight: Int = js.native
  def fontWeightRegular: Int = js.native
  def fontWeightMedium: Int = js.native
  def useNextVariants: Boolean = js.native
}

object Typography {
  def apply(
    pxToRem: Int => String,
    round: Double => Int,
    fontFamily: String,
    fontSize: Int,
    fontWeightLight: Int,
    fontWeightRegular: Int,
    fontWeightMedium: Int,
    useNextVariants: Boolean,
  ): Typography = {
    val o: Map[String, Any] = Map(
      "pxToRem" -> pxToRem,
      "round" -> round,
      "fontFamily" -> fontFamily,
      "fontSize" -> fontSize,
      "fontWeightLight" -> fontWeightLight,
      "fontWeightRegular" -> fontWeightRegular,
      "fontWeightMedium" -> fontWeightMedium,
      "useNextVariants" -> useNextVariants
    )

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[Typography]
  }
}
