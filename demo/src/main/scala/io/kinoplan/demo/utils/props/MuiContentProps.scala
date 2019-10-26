package io.kinoplan.demo.utils.props

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait MuiContentProps extends js.Object {
  def ariaDescribedby: js.UndefOr[String] = js.native
  def className: js.UndefOr[String] = js.native
}

object MuiContentProps {
  def apply(
    ariaDescribedby: js.UndefOr[String] = js.undefined,
    className: js.UndefOr[String] = js.undefined
  ) = {
    val o : Map[String, Any] = Seq(
      ariaDescribedby.toOption.map("aria-describedby" -> _),
      className.toOption.map("className" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[MuiContentProps]
  }
}
