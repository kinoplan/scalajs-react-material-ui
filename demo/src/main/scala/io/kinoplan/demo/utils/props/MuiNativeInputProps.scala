package io.kinoplan.demo.utils.props

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait MuiNativeInputProps extends js.Object {
  def step: js.UndefOr[Int] = js.native
  def name: js.UndefOr[String] = js.native
  def id: js.UndefOr[String] = js.native
}

object MuiNativeInputProps {

  def apply(
    step: Option[Int] = None,
    name: Option[String] = None,
    id: Option[String] = None
  ) = {
    val o: Map[String, Any] = Seq(
      step.map("step" -> _),
      name.map("name" -> _),
      id.map("id" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[MuiNativeInputProps]
  }

}
