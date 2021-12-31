package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait PaletteColorOptions extends js.Object {
  def light: js.UndefOr[String] = js.native
  def main: String = js.native
  def dark: js.UndefOr[String] = js.native
  def contrastText: js.UndefOr[String] = js.native
}

object PaletteColorOptions {

  def apply(
    light: js.UndefOr[String] = js.undefined,
    main: String,
    dark: js.UndefOr[String] = js.undefined,
    contrastText: js.UndefOr[String] = js.undefined
  ) = {
    val o: Map[String, Any] = Seq(
      light.toOption.map("light" -> _),
      Some("main" -> main),
      dark.toOption.map("dark" -> _),
      contrastText.toOption.map("contrastText" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[PaletteColorOptions]
  }

}
