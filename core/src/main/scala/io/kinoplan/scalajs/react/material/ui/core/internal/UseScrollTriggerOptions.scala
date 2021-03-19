package io.kinoplan.scalajs.react.material.ui.core.internal

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.|

import org.scalajs.dom.raw.{Node, Window}

@js.native
trait UseScrollTriggerOptions extends js.Object {
  var disableHysteresis: js.UndefOr[Boolean] = js.native
  var target: js.UndefOr[Node | Window] = js.native
  var threshold: js.UndefOr[Int] = js.native
}

object UseScrollTriggerOptions {
  def apply(
    disableHysteresis: js.UndefOr[Boolean] = js.undefined,
    target: js.UndefOr[Node | Window] = js.undefined,
    threshold: js.UndefOr[Int] = js.undefined
  ) = {
    val o: Map[String, Any] = Map(
      "disableHysteresis" -> disableHysteresis,
      "target" -> target,
      "threshold" -> threshold
    )

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[UseScrollTriggerOptions]
  }
}
