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
    `50`: js.UndefOr[String] = js.undefined,
    `100`: js.UndefOr[String] = js.undefined,
    `200`: js.UndefOr[String] = js.undefined,
    `300`: js.UndefOr[String] = js.undefined,
    `400`: js.UndefOr[String] = js.undefined,
    `500`: js.UndefOr[String] = js.undefined,
    `600`: js.UndefOr[String] = js.undefined,
    `700`: js.UndefOr[String] = js.undefined,
    `800`: js.UndefOr[String] = js.undefined,
    `900`: js.UndefOr[String] = js.undefined,
    `A100`: js.UndefOr[String] = js.undefined,
    `A200`: js.UndefOr[String] = js.undefined,
    `A400`: js.UndefOr[String] = js.undefined,
    `A700`: js.UndefOr[String] = js.undefined
  ) = {
    val o: Map[String, Any] = Seq(
      `50`.toOption.map("50" -> _),
      `100`.toOption.map("100" -> _),
      `200`.toOption.map("200" -> _),
      `300`.toOption.map("300" -> _),
      `400`.toOption.map("400" -> _),
      `500`.toOption.map("500" -> _),
      `600`.toOption.map("600" -> _),
      `700`.toOption.map("700" -> _),
      `800`.toOption.map("800" -> _),
      `900`.toOption.map("900" -> _),
      `A100`.toOption.map("A100" -> _),
      `A200`.toOption.map("A200" -> _),
      `A400`.toOption.map("A400" -> _),
      `A700`.toOption.map("A700" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[ColorPartial]
  }

}
