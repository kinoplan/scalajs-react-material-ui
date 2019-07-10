package io.kinoplan.demo.utils.props

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait MuiMenuProps extends js.Object {
  def PaperProps: js.UndefOr[js.Object] = js.native
  def className: js.UndefOr[String] = js.native
}

object MuiMenuProps {
  def apply(
    PaperProps: js.UndefOr[js.Object] = js.undefined,
    className: js.UndefOr[String] = js.undefined
  ) = {
    val o : Map[String, Any] = Seq(
      PaperProps.toOption.map("PaperProps" -> _),
      className.toOption.map("className" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[MuiMenuProps]
  }
}
