package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait TypographyOptions extends js.Object {
  var useNextVariants: js.UndefOr[Boolean] = js.undefined
  var suppressDeprecationWarnings: js.UndefOr[Boolean] = js.undefined
}

object TypographyOptions {
  def apply(
    useNextVariants: Option[Boolean] = None,
    suppressDeprecationWarnings: Option[Boolean] = None
  ): TypographyOptions = {
    val o: Map[String, Any] = Seq(
      useNextVariants.map("useNextVariants" -> _),
      suppressDeprecationWarnings.map("suppressDeprecationWarnings" -> _)
    ).flatten.toMap
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[TypographyOptions]
  }
}
