package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.|

@js.native
trait TypographyOptions extends js.Object {
  def fontFamily: js.UndefOr[Int | String] = js.native
  def fontSize: js.UndefOr[Int] = js.native
  def fontWeightLight: js.UndefOr[Int | String] = js.native
  def fontWeightRegular: js.UndefOr[Int | String] = js.native
  def fontWeightMedium: js.UndefOr[Int | String] = js.native
  def useNextVariants: js.UndefOr[Boolean] = js.native
  def htmlFontSize: js.UndefOr[Int] = js.native
  def allVariants: js.UndefOr[CSSProperties] = js.native
  def h1: js.UndefOr[TypographyStyleOptions] = js.native
  def h2: js.UndefOr[TypographyStyleOptions] = js.native
  def h3: js.UndefOr[TypographyStyleOptions] = js.native
  def h4: js.UndefOr[TypographyStyleOptions] = js.native
  def h5: js.UndefOr[TypographyStyleOptions] = js.native
  def h6: js.UndefOr[TypographyStyleOptions] = js.native
  def subtitle1: js.UndefOr[TypographyStyleOptions] = js.native
  def subtitle2: js.UndefOr[TypographyStyleOptions] = js.native
  def body1: js.UndefOr[TypographyStyleOptions] = js.native
  def body2: js.UndefOr[TypographyStyleOptions] = js.native
  def caption: js.UndefOr[TypographyStyleOptions] = js.native
  def button: js.UndefOr[TypographyStyleOptions] = js.native
  def overline: js.UndefOr[TypographyStyleOptions] = js.native
}

object TypographyOptions {
  def apply(
    fontFamily: js.UndefOr[Int | String] = js.undefined,
    fontSize: js.UndefOr[Int] = js.undefined,
    fontWeightLight: js.UndefOr[Int | String] = js.undefined,
    fontWeightRegular: js.UndefOr[Int | String] = js.undefined,
    fontWeightMedium: js.UndefOr[Int | String] = js.undefined,
    useNextVariants: js.UndefOr[Boolean] = js.undefined,
    htmlFontSize: js.UndefOr[Int] = js.undefined,
    allVariants: js.UndefOr[Int] = js.undefined,
    h1: js.UndefOr[TypographyStyleOptions] = js.undefined,
    h2: js.UndefOr[TypographyStyleOptions] = js.undefined,
    h3: js.UndefOr[TypographyStyleOptions] = js.undefined,
    h4: js.UndefOr[TypographyStyleOptions] = js.undefined,
    h5: js.UndefOr[TypographyStyleOptions] = js.undefined,
    h6: js.UndefOr[TypographyStyleOptions] = js.undefined,
    subtitle1: js.UndefOr[TypographyStyleOptions] = js.undefined,
    subtitle2: js.UndefOr[TypographyStyleOptions] = js.undefined,
    body1: js.UndefOr[TypographyStyleOptions] = js.undefined,
    body2: js.UndefOr[TypographyStyleOptions] = js.undefined,
    caption: js.UndefOr[TypographyStyleOptions] = js.undefined,
    button: js.UndefOr[TypographyStyleOptions] = js.undefined,
    overline: js.UndefOr[TypographyStyleOptions] = js.undefined
  ): TypographyOptions = {
    val o: Map[String, Any] = Seq(
      fontFamily.toOption.map("fontFamily" -> _),
      fontSize.toOption.map("fontSize" -> _),
      fontWeightLight.toOption.map("fontWeightLight" -> _),
      fontWeightRegular.toOption.map("fontWeightRegular" -> _),
      fontWeightMedium.toOption.map("fontWeightMedium" -> _),
      useNextVariants.toOption.map("useNextVariants" -> _),
      htmlFontSize.toOption.map("htmlFontSize" -> _),
      allVariants.toOption.map("allVariants" -> _),
      h1.toOption.map("h1" -> _),
      h2.toOption.map("h2" -> _),
      h3.toOption.map("h3" -> _),
      h4.toOption.map("h4" -> _),
      h5.toOption.map("h5" -> _),
      h6.toOption.map("h6" -> _),
      subtitle1.toOption.map("subtitle1" -> _),
      subtitle2.toOption.map("subtitle2" -> _),
      body1.toOption.map("body1" -> _),
      body2.toOption.map("body2" -> _),
      caption.toOption.map("caption" -> _),
      button.toOption.map("button" -> _),
      overline.toOption.map("overline" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[TypographyOptions]
  }
}
