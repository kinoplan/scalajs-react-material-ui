package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait TypographyOptions extends js.Object {
  def pxToRem: js.Function1[Int, String] = js.native
  def round: js.Function1[Double, Int] = js.native
  def fontFamily: js.UndefOr[String] = js.native
  def fontSize: js.UndefOr[Int] = js.native
  def fontWeightLight: js.UndefOr[Int] = js.native
  def fontWeightRegular: js.UndefOr[Int] = js.native
  def fontWeightMedium: js.UndefOr[Int] = js.native
  def useNextVariants: js.UndefOr[Boolean] = js.native
}

object TypographyOptions {
  def apply(
    pxToRem: js.UndefOr[Int => String] = js.undefined,
    round: js.UndefOr[Double => Int] = js.undefined,
    fontFamily: js.UndefOr[String] = js.undefined,
    fontSize: js.UndefOr[Int] = js.undefined,
    fontWeightLight: js.UndefOr[Int] = js.undefined,
    fontWeightRegular: js.UndefOr[Int] = js.undefined,
    fontWeightMedium: js.UndefOr[Int] = js.undefined,
    useNextVariants: js.UndefOr[Boolean] = js.undefined
  ): TypographyOptions = {
    val o: Map[String, Any] = Seq(
      pxToRem.toOption.map("pxToRem" -> _),
      round.toOption.map("round" -> _),
      fontFamily.toOption.map("fontFamily" -> _),
      fontSize.toOption.map("fontSize" -> _),
      fontWeightLight.toOption.map("fontWeightLight" -> _),
      fontWeightRegular.toOption.map("fontWeightRegular" -> _),
      fontWeightMedium.toOption.map("fontWeightMedium" -> _),
      useNextVariants.toOption.map("useNextVariants" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[TypographyOptions]
  }
}
