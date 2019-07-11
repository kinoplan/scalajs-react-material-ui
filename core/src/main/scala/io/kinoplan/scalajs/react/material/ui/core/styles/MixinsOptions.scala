package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait MixinsOptions extends js.Object {
  def gutters: js.UndefOr[js.Function1[js.UndefOr[CSSProperties], CSSProperties]] = js.native
  def toolbar: js.UndefOr[CSSProperties] = js.native
}

object MixinsOptions {
  def apply(
    gutters: js.UndefOr[js.UndefOr[CSSProperties] => CSSProperties] = js.undefined,
    toolbar: js.UndefOr[CSSProperties] = js.undefined
  ) = {
    val o: Map[String, Any] = Seq(
      gutters.toOption.map("gutters" -> _),
      toolbar.toOption.map("toolbar" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[MixinsOptions]
  }
}
