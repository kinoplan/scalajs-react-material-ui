package io.kinoplan.scalajs.react.material.ui.core.colors

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait Color extends js.Object {
  def `50`: String = js.native
  def `100`: String = js.native
  def `200`: String = js.native
  def `300`: String = js.native
  def `400`: String = js.native
  def `500`: String = js.native
  def `600`: String = js.native
  def `700`: String = js.native
  def `800`: String = js.native
  def `900`: String = js.native
  def `A100`: String = js.native
  def `A200`: String = js.native
  def `A400`: String = js.native
  def `A700`: String = js.native
}

object Color {
  def apply(
    `50`: String,
    `100`: String,
    `200`: String,
    `300`: String,
    `400`: String,
    `500`: String,
    `600`: String,
    `700`: String,
    `800`: String,
    `900`: String,
    `A100`: String,
    `A200`: String,
    `A400`: String,
    `A700`: String
  ) = {
    val o: Map[String, Any] = Map(
      "50" -> `50`,
      "100" -> `100`,
      "200" -> `200`,
      "300" -> `300`,
      "400" -> `400`,
      "500" -> `500`,
      "600" -> `600`,
      "700" -> `700`,
      "800" -> `800`,
      "900" -> `900`,
      "A100" -> `A100`,
      "A200" -> `A200`,
      "A400" -> `A400`,
      "A700" -> `A700`
    )
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[Color]
  }
}
