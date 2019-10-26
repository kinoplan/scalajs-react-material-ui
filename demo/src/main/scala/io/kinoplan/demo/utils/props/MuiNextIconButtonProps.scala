package io.kinoplan.demo.utils.props

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait MuiNextIconButtonProps extends js.Object {
  def ariaLabel: js.UndefOr[String] = js.native
}

object MuiNextIconButtonProps {
  def apply(
    ariaLabel: js.UndefOr[String] = js.undefined
  ) = {
    val o : Map[String, Any] = Seq(
      ariaLabel.toOption.map("aria-label" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[MuiNextIconButtonProps]
  }
}
