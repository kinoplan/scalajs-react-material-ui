package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.JSConverters._

@js.native
trait Transitions extends js.Object {
  def easing: Easing = js.native
  def duration: Duration = js.native
  def create: js.Function2[String | js.Array[String], js.UndefOr[CreateTransitionsOptions], String] = js.native
  def getAutoHeightDuration: js.Function1[Double, Double] = js.native
}

object Transitions {
  def apply(
    easing: Easing,
    duration: Duration,
    create: (String | js.Array[String], Option[CreateTransitionsOptions]) => String,
    getAutoHeightDuration: Double => Double
  ) = {
    val o: Map[String, Any] = Map(
      "easing" -> easing,
      "duration" -> duration,
      "create" -> create,
      "getAutoHeightDuration" -> getAutoHeightDuration
    )
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[Transitions]
  }
}
