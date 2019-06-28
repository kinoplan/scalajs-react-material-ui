package io.kinoplan.demo.utils.props

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait MuiInputLabelProps extends js.Object {
  def shrink: js.UndefOr[Boolean] = js.native
}

object MuiInputLabelProps {
  def apply(shrink: Option[Boolean] = None) = {
    val o : Map[String, Any] = Seq(
      shrink.map("shrink" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[MuiInputLabelProps]
  }
}
