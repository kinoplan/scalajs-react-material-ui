package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait SheetManagerTheme extends js.Object {
  def refs: Double = js.native
  def sheet: StyleSheet = js.native
}

object SheetManagerTheme {
  def apply(
    refs: Double,
    sheet: StyleSheet
  ): SheetManagerTheme = {
    val o: Map[String, Any] = Map(
      "refs" -> refs,
      "sheet" -> sheet
    )

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[SheetManagerTheme]
  }
}
