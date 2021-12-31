package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.|

@js.native
trait CreateTransitionsOptions extends js.Object {
  def duration: js.UndefOr[Int | String] = js.native
  def easing: js.UndefOr[String] = js.native
  def delay: js.UndefOr[Int | String] = js.native
}

object CreateTransitionsOptions {

  def apply(
    duration: js.UndefOr[Int | String] = js.undefined,
    easing: js.UndefOr[String] = js.undefined,
    delay: js.UndefOr[Int | String] = js.undefined
  ) = {
    val o: Map[String, Any] = Seq(
      duration.toOption.map("duration" -> _),
      easing.toOption.map("easing" -> _),
      delay.toOption.map("delay" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[CreateTransitionsOptions]
  }

}
