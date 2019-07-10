package io.kinoplan.demo.utils.props

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait MuiInputLabelProps extends js.Object {
  def shrink: js.UndefOr[Boolean] = js.native
  def classes: js.UndefOr[js.Object] = js.native
}

object MuiInputLabelProps {
  def apply(
    shrink: js.UndefOr[Boolean] = js.undefined,
    classes: js.UndefOr[js.Object] = js.undefined
  ) = {
    val o: Map[String, Any] = Seq(
      shrink.toOption.map("shrink" -> _),
      classes.toOption.map("classes" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[MuiInputLabelProps]
  }
}
