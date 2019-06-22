package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait Theme extends js.Object {
  def shape: Shape = js.native
  def breakpoints: Breakpoints = js.native
  def direction: String = js.native
  def mixins: Mixins = js.native
  def overrides: js.UndefOr[Overrides] = js.native
  def palette: Palette = js.native
  def props: js.Object = js.native
  def shadows: js.Array[String] = js.native
  def typography: Typography = js.native
  def transitions: Transitions = js.native
  def spacing: Spacing = js.native
  def zIndex: ZIndex = js.native
}

object Theme {
  def apply(
    shape: Shape,
    breakpoints: Breakpoints,
    direction: Direction.Value = Direction.ltr,
    mixins: Mixins,
    overrides: Option[Overrides] = None,
    palette: Palette,
    props: Option[js.Object] = None,
    shadows: Array[String],
    spacing: Spacing,
    transitions: Transitions,
    typography: Typography,
    zIndex: ZIndex
  ): Theme = {
    val o: Map[String, Any] = Seq(
      Some("shape" -> shape),
      Some("breakpoints" -> breakpoints),
      Some("direction" -> direction.toString),
      Some("mixins" -> mixins),
      overrides.map("overrides" -> _),
      Some("palette" -> palette),
      props.map("props" -> _),
      Some("shadows" -> shadows),
      Some("spacing" -> spacing),
      Some("transitions" -> transitions),
      Some("typography" -> typography),
      Some("zIndex" -> ZIndex)
    ).flatten.toMap
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[Theme]
  }
}
