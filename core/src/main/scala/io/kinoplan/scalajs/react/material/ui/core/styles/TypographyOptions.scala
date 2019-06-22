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
    pxToRem: Option[Int => String] = None,
    round: Option[Double => Int] = None,
    fontFamily: Option[String] = None,
    fontSize: Option[Int] = None,
    fontWeightLight: Option[Int] = None,
    fontWeightRegular: Option[Int] = None,
    fontWeightMedium: Option[Int] = None,
    useNextVariants: Option[Boolean] = None
  ): TypographyOptions = {
    val o: Map[String, Any] = Seq(
      pxToRem.map("pxToRem" -> _),
      round.map("round" -> _),
      fontFamily.map("fontFamily" -> _),
      fontSize.map("fontSize" -> _),
      fontWeightLight.map("fontWeightLight" -> _),
      fontWeightRegular.map("fontWeightRegular" -> _),
      fontWeightMedium.map("fontWeightMedium" -> _),
      useNextVariants.map("useNextVariants" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[TypographyOptions]
  }
}
