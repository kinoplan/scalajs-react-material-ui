package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait TransitionsOptions extends js.Object {
  def easing: js.UndefOr[EasingPartial] = js.native
  def duration: js.UndefOr[DurationPartial] = js.native
  def create: js.UndefOr[js.Function2[js.Array[String], js.UndefOr[CreateTransitionsOptions], String]] = js.native
  def getAutoHeightDuration: js.UndefOr[js.Function1[Double, Double]] = js.native
}

object TransitionsOptions {

  def apply(
    easing: js.UndefOr[EasingPartial] = js.undefined,
    duration: js.UndefOr[DurationPartial] = js.undefined,
    create: js.UndefOr[js.Function2[js.Array[String], js.UndefOr[CreateTransitionsOptions], String]] = js.undefined,
    getAutoHeightDuration: js.UndefOr[Double => Double] = js.undefined
  ) = {
    val o: Map[String, Any] = Seq(
      easing.toOption.map("easing" -> _),
      duration.toOption.map("duration" -> _),
      create.toOption.map("create" -> _),
      getAutoHeightDuration.toOption.map("getAutoHeightDuration" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[TransitionsOptions]
  }

}
