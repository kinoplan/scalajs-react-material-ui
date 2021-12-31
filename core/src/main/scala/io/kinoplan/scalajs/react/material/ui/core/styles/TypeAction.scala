package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait TypeAction extends js.Object {
  def active: String = js.native
  def hover: String = js.native
  def hoverOpacity: Double = js.native
  def selected: String = js.native
  def disabled: String = js.native
  def disabledBackground: String = js.native
}

object TypeAction {

  def apply(
    active: String,
    hover: String,
    hoverOpacity: Double,
    selected: String,
    disabled: String,
    disabledBackground: String
  ) = {
    val o: Map[String, Any] = Map(
      "active" -> active,
      "hover" -> hover,
      "hoverOpacity" -> hoverOpacity,
      "selected" -> selected,
      "disabled" -> disabled,
      "disabledBackground" -> disabledBackground
    )

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[TypeAction]
  }

}
