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
  def h1: TypographyStyle = js.native
  def h2: TypographyStyle = js.native
  def h3: TypographyStyle = js.native
  def h4: TypographyStyle = js.native
  def h5: TypographyStyle = js.native
  def h6: TypographyStyle = js.native
  def subtitle1: TypographyStyle = js.native
  def subtitle2: TypographyStyle = js.native
  def body1: TypographyStyle = js.native
  def body2: TypographyStyle = js.native
  def caption: TypographyStyle = js.native
  def button: TypographyStyle = js.native
  def overline: TypographyStyle = js.native
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
    h1: TypographyStyle,
    h2: TypographyStyle,
    h3: TypographyStyle,
    h4: TypographyStyle,
    h5: TypographyStyle,
    h6: TypographyStyle,
    subtitle1: TypographyStyle,
    subtitle2: TypographyStyle,
    body1: TypographyStyle,
    body2: TypographyStyle,
    caption: TypographyStyle,
    button: TypographyStyle,
    overline: TypographyStyle
  ): Typography = {
    val o: Map[String, Any] = Map(
      "pxToRem" -> pxToRem,
      "round" -> round,
      "fontFamily" -> fontFamily,
      "fontSize" -> fontSize,
      "fontWeightLight" -> fontWeightLight,
      "fontWeightRegular" -> fontWeightRegular,
      "fontWeightMedium" -> fontWeightMedium,
      "useNextVariants" -> useNextVariants,
      "h1" -> h1,
      "h2" -> h2,
      "h3" -> h3,
      "h4" -> h4,
      "h5" -> h5,
      "h6" -> h6,
      "subtitle1" -> subtitle1,
      "subtitle2" -> subtitle2,
      "body1" -> body1,
      "body2" -> body2,
      "caption" -> caption,
      "button" -> button,
      "overline" -> overline
    )

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[Typography]
  }
}
