package io.kinoplan.scalajs.react.material.ui.core.styles

import io.kinoplan.scalajs.react.material.ui.core.colors.{ColorPartial, CommonColorsPartial}

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.|

@js.native
trait PaletteOptions extends js.Object {
  def primary: js.UndefOr[PaletteColorOptions | ColorPartial] = js.native
  def secondary: js.UndefOr[PaletteColorOptions | ColorPartial] = js.native
  def error: js.UndefOr[PaletteColorOptions | ColorPartial] = js.native
  def `type`: js.UndefOr[String] = js.native
  def tonalOffset: js.UndefOr[Double] = js.native
  def constrastThreshold: js.UndefOr[Int] = js.native
  def common: js.UndefOr[CommonColorsPartial] = js.native
  def grey: js.UndefOr[ColorPartial] = js.native
  def text: js.UndefOr[TypeTextPartial] = js.native
  def divider: js.UndefOr[String] = js.native
  def action: js.UndefOr[TypeActionPartial] = js.native
  def background: js.UndefOr[TypeBackgroundPartial] = js.native
  def getContrastText: js.UndefOr[js.Function1[String, String]] = js.native
}

object PaletteOptions {
  def apply(
    primary: Option[PaletteColorOptions | ColorPartial] = None,
    secondary: Option[PaletteColorOptions | ColorPartial] = None,
    error: Option[PaletteColorOptions | ColorPartial] = None,
    `type`: Option[PaletteType.Value] = None,
    tonalOffset: Option[Double] = None,
    contrastThreshold: Option[Int] = None,
    common: Option[CommonColorsPartial] = None,
    grey: Option[ColorPartial] = None,
    text: Option[TypeTextPartial] = None,
    divider: Option[String] = None,
    action: Option[TypeActionPartial] = None,
    background: Option[TypeBackgroundPartial] = None,
    getContrastText: Option[String => String] = None
  ) = {
    val o: Map[String, Any] = Seq(
      primary.map("primary" -> _),
      secondary.map("secondary" -> _),
      error.map("error" -> _),
      `type`.map("type" -> _.toString),
      tonalOffset.map("tonalOffset" -> _),
      contrastThreshold.map("contrastThreshold" -> _),
      common.map("common" -> _),
      grey.map("grey" -> _),
      text.map("text" -> _),
      divider.map("divider" -> _),
      action.map("action" -> _),
      background.map("background" -> _),
      getContrastText.map("getContrastText" -> _)
    ).flatten.toMap
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[PaletteOptions]
  }
}
