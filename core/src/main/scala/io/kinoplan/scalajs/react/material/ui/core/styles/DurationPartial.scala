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
    shortest: Option[Int] = None,
    shorter: Option[Int] = None,
    short: Option[Int] = None,
    standard: Option[Int] = None,
    complex: Option[Int] = None,
    enteringScreen: Option[Int] = None,
    leavingScreen: Option[Int] = None
  ) = {
    val o: Map[String, Any] = Seq(
      shortest.map("shortest" -> _),
      shorter.map("shorter" -> _),
      short.map("short" -> _),
      standard.map("standard" -> _),
      complex.map("complex" -> _),
      enteringScreen.map("enteringScreen" -> _),
      leavingScreen.map("leavingScreen" -> _)
    ).flatten.toMap
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[DurationPartial]
  }
}
