package io.kinoplan.scalajs.react.material.ui.core.internal

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.|

@js.native
trait Origin extends js.Object {
  var horizontal: String | Double = js.native
  var vertical: String | Double = js.native
}

object Origin {
  def apply(
    horizontal: String | Double,
    vertical: String | Double
  ) = {
    val o: Map[String, Any] = Map(
      "horizontal" -> horizontal,
      "vertical" -> vertical
    )
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[Origin]
  }
}
