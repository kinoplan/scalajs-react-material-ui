package io.kinoplan.scalajs.react.material.ui.core.internal

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait Timeout extends js.Object {
  var appear: js.UndefOr[Int] = js.native
  var enter: js.UndefOr[Int] = js.native
  var exit: js.UndefOr[Int] = js.native
}

object Timeout {
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

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[Timeout]
  }
}
