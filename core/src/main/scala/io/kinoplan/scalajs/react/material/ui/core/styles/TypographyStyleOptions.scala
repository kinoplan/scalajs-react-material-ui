package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.|

@js.native
trait TypographyStyleOptions extends js.Object {
  def fontFamily: js.UndefOr[Int | String] = js.native
  def fontSize: js.UndefOr[Int | String] = js.native
  def fontWeight: js.UndefOr[Int | String] = js.native
  def fontStyle: js.UndefOr[Int | String] = js.native
  def color: js.UndefOr[Int | String] = js.native
  def letterSpacing: js.UndefOr[Int | String] = js.native
  def lineHeight: js.UndefOr[Int | String] = js.native
  def textTransform: js.UndefOr[Int | String] = js.native
}

object TypographyStyleOptions {
  def apply(
    fontFamily: js.UndefOr[Int | String] = js.undefined,
    fontSize: js.UndefOr[Int | String] = js.undefined,
    fontWeight: js.UndefOr[Int | String] = js.undefined,
    fontStyle: js.UndefOr[Int | String] = js.undefined,
    color: js.UndefOr[Int | String] = js.undefined,
    letterSpacing: js.UndefOr[Int | String] = js.undefined,
    lineHeight: js.UndefOr[Int | String] = js.undefined,
    textTransform: js.UndefOr[Int | String] = js.undefined
  ): TypographyStyleOptions = {
    val o: Map[String, Any] = Seq(
      fontFamily.toOption.map("fontFamily" -> _),
      fontSize.toOption.map("fontSize" -> _),
      fontWeight.toOption.map("fontWeight" -> _),
      fontStyle.toOption.map("fontStyle" -> _),
      color.toOption.map("color" -> _),
      letterSpacing.toOption.map("letterSpacing" -> _),
      lineHeight.toOption.map("lineHeight" -> _),
      textTransform.toOption.map("textTransform" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[TypographyStyleOptions]
  }
}
