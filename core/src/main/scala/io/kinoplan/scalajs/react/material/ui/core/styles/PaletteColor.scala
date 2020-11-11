package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

import io.kinoplan.scalajs.react.material.ui.core.colors.Color

@js.native
trait PaletteColor extends Color {
  def light: String = js.native
  def main: String = js.native
  def dark: String = js.native
  def contrastText: String = js.native
}

object PaletteColor {
  def apply(
    light: String,
    main: String,
    dark: String,
    contrastText: String
  ) = {
    val o: Map[String, Any] = Map(
      "light" -> light,
      "main" -> main,
      "dark" -> dark,
      "contrastText" -> contrastText
    )

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[PaletteColor]
  }
}
