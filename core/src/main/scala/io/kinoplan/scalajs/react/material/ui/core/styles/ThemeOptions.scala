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
  def typography: js.UndefOr[TypographyOptions | Palette => TypographyOptions] = js.native
  def zIndex: js.UndefOr[ZIndexOptions] = js.native
}

object ThemeOptions {

  def apply(
    shape: js.UndefOr[ShapeOptions] = js.undefined,
    breakpoints: js.UndefOr[BreakpointsOptions] = js.undefined,
    direction: js.UndefOr[Direction.Value] = js.undefined,
    mixins: js.UndefOr[MixinsOptions] = js.undefined,
    overrides: js.UndefOr[Overrides] = js.undefined,
    palette: js.UndefOr[PaletteOptions] = js.undefined,
    props: js.UndefOr[js.Object] = js.undefined,
    shadows: js.UndefOr[js.Array[String]] = js.undefined,
    spacing: js.UndefOr[SpacingOptions] = js.undefined,
    transitions: js.UndefOr[TransitionsOptions] = js.undefined,
    typography: js.UndefOr[TypographyOptions | js.Function1[Palette, TypographyOptions]] = js.undefined
  ) = {
    val o: Map[String, Any] = Seq(
      shape.toOption.map("shape" -> _),
      breakpoints.toOption.map("breakpoints" -> _),
      direction.toOption.map("direction" -> _.toString),
      mixins.toOption.map("mixins" -> _),
      overrides.toOption.map("overrides" -> _),
      palette.toOption.map("palette" -> _),
      props.toOption.map("props" -> _),
      shadows.toOption.map("shadows" -> _),
      spacing.toOption.map("spacing" -> _),
      transitions.toOption.map("transitions" -> _),
      typography.toOption.map("typography" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[ThemeOptions]
  }

}
