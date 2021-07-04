package io.kinoplan.scalajs.react.material.ui.core.internal

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait BadgeOrigin extends js.Object {
  var horizontal: String = js.native
  var vertical: String = js.native
}

object BadgeOrigin {
  def apply(
    horizontal: String,
    vertical: String
  ) = {
    val o: Map[String, Any] = Map(
      "horizontal" -> horizontal,
      "vertical" -> vertical
    )

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[BadgeOrigin]
  }
}
