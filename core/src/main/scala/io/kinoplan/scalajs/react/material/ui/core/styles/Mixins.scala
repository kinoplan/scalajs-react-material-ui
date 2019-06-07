package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait Mixins extends js.Object {
  def gutters: js.Function1[js.UndefOr[CSSProperties], CSSProperties] = js.native
  def toolbar: CSSProperties = js.native
}

object Mixins {
  def apply(
    gutters: Option[CSSProperties] => CSSProperties,
    toolbar: CSSProperties
  ) = {
    val o: Map[String, Any] = Map(
      "gutters" -> gutters,
      "toolbar" -> toolbar
    )
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[Mixins]
  }
}
