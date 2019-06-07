package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait Typography extends js.Object {
  var useNextVariants: js.UndefOr[Boolean] = js.undefined
}

object Typography {
  def apply(
    useNextVariants: Option[Boolean] = None
  ): Typography = {
    val o: Map[String, Any] = Seq(
      useNextVariants.map("useNextVariants" -> _)
    ).flatten.toMap
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[Typography]
  }
}