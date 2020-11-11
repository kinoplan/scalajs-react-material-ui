package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.|

import io.kinoplan.scalajs.react.material.ui.core.colors.{Color, ColorPartial, CommonColorsPartial}

@js.native
trait PaletteOptions extends js.Object {
  def primary: js.UndefOr[PaletteColorOptions | ColorPartial | Color] = js.native
  def secondary: js.UndefOr[PaletteColorOptions | ColorPartial | Color] = js.native
  def error: js.UndefOr[PaletteColorOptions | ColorPartial | Color] = js.native
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
    primary: js.UndefOr[PaletteColorOptions | ColorPartial | Color] = js.undefined,
    secondary: js.UndefOr[PaletteColorOptions | ColorPartial | Color] = js.undefined,
    error: js.UndefOr[PaletteColorOptions | ColorPartial | Color] = js.undefined,
    `type`: js.UndefOr[PaletteType.Value] = js.undefined,
    tonalOffset: js.UndefOr[Double] = js.undefined,
    contrastThreshold: js.UndefOr[Int] = js.undefined,
    common: js.UndefOr[CommonColorsPartial] = js.undefined,
    grey: js.UndefOr[ColorPartial] = js.undefined,
    text: js.UndefOr[TypeTextPartial] = js.undefined,
    divider: js.UndefOr[String] = js.undefined,
    action: js.UndefOr[TypeActionPartial] = js.undefined,
    background: js.UndefOr[TypeBackgroundPartial] = js.undefined,
    getContrastText: js.UndefOr[String => String] = js.undefined
  ) = {
    val o: Map[String, Any] = Seq(
      primary.toOption.map("primary" -> _),
      secondary.toOption.map("secondary" -> _),
      error.toOption.map("error" -> _),
      `type`.toOption.map("type" -> _),
      tonalOffset.toOption.map("tonalOffset" -> _),
      contrastThreshold.toOption.map("contrastThreshold" -> _),
      common.toOption.map("common" -> _),
      grey.toOption.map("grey" -> _),
      text.toOption.map("text" -> _),
      divider.toOption.map("divider" -> _),
      action.toOption.map("action" -> _),
      background.toOption.map("background" -> _),
      getContrastText.toOption.map("getContrastText" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[PaletteOptions]
  }
}
