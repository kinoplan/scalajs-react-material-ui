package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.|

@js.native
trait TypographyStyle extends js.Object {
  def fontFamily: Int | String = js.native
  def fontSize: Int | String = js.native
  def fontWeight: Int | String = js.native
  def fontStyle: Int | String = js.native
  def color: Int | String = js.native
  def letterSpacing: js.UndefOr[Int | String] = js.native
  def lineHeight: js.UndefOr[Int | String] = js.native
  def textTransform: js.UndefOr[Int | String] = js.native
}

object TypographyStyle {

  def apply(
    fontFamily: Int | String,
    fontSize: Int | String,
    fontWeight: Int | String,
    fontStyle: Int | String,
    color: Int | String,
    letterSpacing: js.UndefOr[Int | String] = js.undefined,
    lineHeight: js.UndefOr[Int | String] = js.undefined,
    textTransform: js.UndefOr[Int | String] = js.undefined
  ): TypographyStyle = {
    val o: Map[String, Any] = Seq(
      Some("fontFamily" -> fontFamily),
      Some("fontSize" -> fontSize),
      Some("fontWeight" -> fontWeight),
      Some("fontStyle" -> fontStyle),
      Some("color" -> color),
      letterSpacing.toOption.map("letterSpacing" -> _),
      lineHeight.toOption.map("lineHeight" -> _),
      textTransform.toOption.map("textTransform" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[TypographyStyle]
  }

}
