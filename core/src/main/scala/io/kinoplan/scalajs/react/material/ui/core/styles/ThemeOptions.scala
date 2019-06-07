package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.|

@js.native
trait ThemeOptions extends js.Object {
  def shape: js.UndefOr[ShapeOptions] = js.native
  def breakpoints: js.UndefOr[BreakpointsOptions] = js.native
  def direction: js.UndefOr[String] = js.native
  def mixins: js.UndefOr[MixinsOptions] = js.native
  def overrides: js.UndefOr[Overrides] = js.native
  def palette: js.UndefOr[PaletteOptions] = js.native
  def props: js.UndefOr[js.Object] = js.native
  def shadows: js.UndefOr[js.Array[String]] = js.native
  def spacing: js.UndefOr[SpacingOptions] = js.native
  def transitions: js.UndefOr[TransitionsOptions] = js.native
  def typography: js.UndefOr[TypographyOptions | js.Function1[Palette, TypographyOptions]] = js.native
  def zIndex: js.UndefOr[ZIndexOptions] = js.native
}

object ThemeOptions {
  def apply(
    shape: Option[ShapeOptions] = None,
    breakpoints: Option[BreakpointsOptions] = None,
    direction: Option[Direction.Value] = None,
    mixins: Option[MixinsOptions] = None,
    overrides: Option[Overrides] = None,
    palette: Option[PaletteOptions] = None,
    props: Option[js.Object] = None,
    shadows: Option[Array[String]] = None,
    spacing: Option[SpacingOptions] = None,
    transitions: Option[TransitionsOptions] = None,
    typography: Option[TypographyOptions | js.Function1[Palette, TypographyOptions]] = None
  ) = {
    val o: Map[String, Any] = Seq(
      shape.map("shape" -> _),
      breakpoints.map("breakpoints" -> _),
      direction.map("direction" -> _.toString),
      mixins.map("mixins" -> _),
      overrides.map("overrides" -> _),
      palette.map("palette" -> _),
      props.map("props" -> _),
      shadows.map("shadows" -> _),
      spacing.map("spacing" -> _),
      transitions.map("transitions" -> _),
      typography.map("typography" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[ThemeOptions]
  }
}
