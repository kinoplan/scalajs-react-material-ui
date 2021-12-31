package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait SpacingOptions extends js.Object {
  def unit: js.UndefOr[Double] = js.native
}

object SpacingOptions {

  def apply(unit: js.UndefOr[Double] = js.undefined) = {
    val o: Map[String, Any] = unit.toOption.map("unit" -> _).toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[SpacingOptions]
  }

}
