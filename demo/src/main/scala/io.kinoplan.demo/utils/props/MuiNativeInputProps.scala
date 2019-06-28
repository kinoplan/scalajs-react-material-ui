package io.kinoplan.demo.utils.props

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait MuiNativeInputProps extends js.Object {
  def step: js.UndefOr[Int] = js.native
}

object MuiNativeInputProps {
  def apply(step: Option[Int] = None) = {
    val o : Map[String, Any] = Seq(
      step.map("step" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[MuiNativeInputProps]
  }
}
