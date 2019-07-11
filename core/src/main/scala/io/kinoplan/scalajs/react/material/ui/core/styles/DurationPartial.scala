package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait DurationPartial extends js.Object {
  def shortest: js.UndefOr[Int] = js.native
  def shorter: js.UndefOr[Int] = js.native
  def short: js.UndefOr[Int] = js.native
  def standard: js.UndefOr[Int] = js.native
  def complex: js.UndefOr[Int] = js.native
  def enteringScreen: js.UndefOr[Int] = js.native
  def leavingScreen: js.UndefOr[Int] = js.native
}

object DurationPartial {
  def apply(
    shortest: js.UndefOr[Int] = js.undefined,
    shorter: js.UndefOr[Int] = js.undefined,
    short: js.UndefOr[Int] = js.undefined,
    standard: js.UndefOr[Int] = js.undefined,
    complex: js.UndefOr[Int] = js.undefined,
    enteringScreen: js.UndefOr[Int] = js.undefined,
    leavingScreen: js.UndefOr[Int] = js.undefined
  ) = {
    val o: Map[String, Any] = Seq(
      shortest.toOption.map("shortest" -> _),
      shorter.toOption.map("shorter" -> _),
      short.toOption.map("short" -> _),
      standard.toOption.map("standard" -> _),
      complex.toOption.map("complex" -> _),
      enteringScreen.toOption.map("enteringScreen" -> _),
      leavingScreen.toOption.map("leavingScreen" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[DurationPartial]
  }
}
