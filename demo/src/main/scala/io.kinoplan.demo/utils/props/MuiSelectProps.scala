package io.kinoplan.demo.utils.props

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait MuiSelectProps extends js.Object {
  def native: js.UndefOr[Boolean] = js.native
  def MenuProps: js.UndefOr[js.Object] = js.native
}

object MuiSelectProps {
  def apply(
    native: js.UndefOr[Boolean] = js.undefined,
    MenuProps: js.UndefOr[js.Object] = js.undefined
  ) = {
    val o : Map[String, Any] = Seq(
      MenuProps.toOption.map("MenuProps" -> _),
      native.toOption.map("native" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[MuiSelectProps]
  }
}
