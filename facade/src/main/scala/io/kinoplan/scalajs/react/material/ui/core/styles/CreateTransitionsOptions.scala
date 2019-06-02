package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.|

@js.native
trait CreateTransitionsOptions extends js.Object {
  def duration: js.UndefOr[Double | String] = js.native
  def easing: js.UndefOr[String] = js.native
  def delay: js.UndefOr[Double | String] = js.native
}

object CreateTransitionsOptions {
  def apply(
    duration: Option[Double | String] = None,
    easing: Option[String] = None,
    delay: Option[Double | String] = None
  ) = {
    val o: Map[String, Any] = Seq(
      duration.map("duration" -> _),
      easing.map("easing" -> _),
      delay.map("delay" -> _)
    ).flatten.toMap
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[CreateTransitionsOptions]
  }
}
