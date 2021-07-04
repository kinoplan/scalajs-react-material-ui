package io.kinoplan.scalajs.react.material.ui.core.internal

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait TransitionTimeout extends js.Object {
  var appear: js.UndefOr[Int] = js.native
  var enter: js.UndefOr[Int] = js.native
  var exit: js.UndefOr[Int] = js.native
}

object TransitionTimeout {
  def apply(
    appear: js.UndefOr[Int] = js.undefined,
    enter: js.UndefOr[Int] = js.undefined,
    exit: js.UndefOr[Int] = js.undefined
  ) = {
    val o: Map[String, Any] = Map(
      "appear" -> appear,
      "enter" -> enter,
      "exit" -> exit
    )

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[TransitionTimeout]
  }
}
