package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.annotation.JSImport

import io.kinoplan.scalajs.react.material.ui.core.colors.{Color, CommonColors}

@js.native
trait Palette extends js.Object {
  def common: CommonColors = js.native
  def `type`: String = js.native
  def constrastThreshold: Int = js.native
  def tonalOffset: Double = js.native
  def primary: PaletteColor = js.native
  def secondary: PaletteColor = js.native
  def error: PaletteColor = js.native
  def grey: Color = js.native
  def text: TypeText = js.native
  def divider: String = js.native
  def action: TypeAction = js.native
  def background: TypeBackground = js.native
  def getContrastText: js.Function1[String, String] = js.native
  def augmentColor(): Unit = js.native
}

@JSImport("@material-ui/core/styles/createPalette", "light")
@js.native
object Light extends TypeObject

@JSImport("@material-ui/core/styles/createPalette", "dark")
@js.native
object Dark extends TypeObject

object Palette {
  def apply(
    common: CommonColors,
    `type`: PaletteType.Value,
    contrastThreshold: Int,
    tonalOffset: Double,
    primary: PaletteColor,
    secondary: PaletteColor,
    error: PaletteColor,
    grey: Color,
    text: TypeText,
    divider: String,
    action: TypeAction,
    background: TypeBackground,
    getContrastText: String => String,
    augmentColor: Unit
  ): Palette = {
    val o: Map[String, Any] = Map[String, Any](
      "common" -> common,
      "type" -> `type`.toString,
      "contrastThreshold" -> contrastThreshold,
      "tonalOffset" -> tonalOffset,
      "primary" -> primary,
      "secondary" -> secondary,
      "error" -> error,
      "grey" -> grey,
      "text" -> text,
      "divider" -> divider,
      "action" -> action,
      "background" -> background,
      "getContrastText" -> getContrastText,
      "augmentColor" -> augmentColor
    )

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[Palette]
  }
}
