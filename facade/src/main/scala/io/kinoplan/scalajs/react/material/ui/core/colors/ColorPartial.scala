package io.kinoplan.scalajs.react.material.ui.core.colors

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait ColorPartial extends js.Object {
  def `50`: js.UndefOr[String] = js.native
  def `100`: js.UndefOr[String] = js.native
  def `200`: js.UndefOr[String] = js.native
  def `300`: js.UndefOr[String] = js.native
  def `400`: js.UndefOr[String] = js.native
  def `500`: js.UndefOr[String] = js.native
  def `600`: js.UndefOr[String] = js.native
  def `700`: js.UndefOr[String] = js.native
  def `800`: js.UndefOr[String] = js.native
  def `900`: js.UndefOr[String] = js.native
  def `A100`: js.UndefOr[String] = js.native
  def `A200`: js.UndefOr[String] = js.native
  def `A400`: js.UndefOr[String] = js.native
  def `A700`: js.UndefOr[String] = js.native
}

object ColorPartial {
  def apply(
    `50`: Option[String] = None,
    `100`: Option[String] = None,
    `200`: Option[String] = None,
    `300`: Option[String] = None,
    `400`: Option[String] = None,
    `500`: Option[String] = None,
    `600`: Option[String] = None,
    `700`: Option[String] = None,
    `800`: Option[String] = None,
    `900`: Option[String] = None,
    `A100`: Option[String] = None,
    `A200`: Option[String] = None,
    `A400`: Option[String] = None,
    `A700`: Option[String] = None
  ) = {
    val o: Map[String, Any] = Seq(
      `50`.map("50" -> _),
      `100`.map("100" -> _),
      `200`.map("200" -> _),
      `300`.map("300" -> _),
      `400`.map("400" -> _),
      `500`.map("500" -> _),
      `600`.map("600" -> _),
      `700`.map("700" -> _),
      `800`.map("800" -> _),
      `900`.map("900" -> _),
      `A100`.map("A100" -> _),
      `A200`.map("A200" -> _),
      `A400`.map("A400" -> _),
      `A700`.map("A700" -> _)
    ).flatten.toMap
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[ColorPartial]
  }
}
