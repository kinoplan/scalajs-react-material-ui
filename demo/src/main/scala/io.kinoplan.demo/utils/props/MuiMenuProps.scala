package io.kinoplan.demo.utils.props

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait MuiMenuProps extends js.Object {
  def PaperProps: js.Object = js.native
}

object MuiMenuProps {
  def apply(
    PaperProps: js.Object = js.Object()
  ) = {
    val o: Map[String, Any] = Map(
      "PaperProps" -> PaperProps
    )

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[MuiMenuProps]
  }
}
