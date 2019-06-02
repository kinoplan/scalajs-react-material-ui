package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.JSConverters._

@js.native
trait TransitionsOptions extends js.Object {
  def easing: js.UndefOr[EasingPartial] = js.native
  def duration: js.UndefOr[DurationPartial] = js.native
  def create: js.UndefOr[js.Function2[String | js.Array[String], js.UndefOr[CreateTransitionsOptions], String]] = js.native
  def getAutoHeightDuration: js.UndefOr[js.Function1[Double, Double]] = js.native
}

object TransitionsOptions {
  def apply(
    easing: Option[EasingPartial] = None,
    duration: Option[DurationPartial] = None,
    create: Option[(String | js.Array[String], Option[CreateTransitionsOptions]) => String] = None,
    getAutoHeightDuration: Option[Double => Double] = None
  ) = {
    val o: Map[String, Any] = Seq(
      easing.map("easing" -> _),
      duration.map("duration" -> _),
      create.map("create" -> _),
      getAutoHeightDuration.map("getAutoHeightDuration" -> _)
    ).flatten.toMap
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[TransitionsOptions]
  }
}
