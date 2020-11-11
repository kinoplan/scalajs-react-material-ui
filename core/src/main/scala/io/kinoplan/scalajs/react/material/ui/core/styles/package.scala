package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import japgolly.scalajs.react.vdom.VdomNode

package object styles {
  @JSImport("@material-ui/core/styles/colorManipulator.js", JSImport.Default)
  @js.native
  object colorManipulator extends js.Object {
    def hexToRgb(hex: String): String = js.native

    def rgbToHex(color: String): String = js.native

    def hslToRgb(color: String): String = js.native

    def decomposeColor(color: String): ColorObject = js.native

    def recomposeColor(color: ColorObject): String = js.native

    def getContrastRatio(foreground: String, background: String): Double = js.native

    def getLuminance(color: String): Double = js.native

    def emphasize(color: String, coefficient: js.UndefOr[Double]): String = js.native

    def fade(color: String, value: Double): String = js.native

    def darken(color: String, coefficient: js.UndefOr[Double]): String = js.native

    def lighten(color: String, coefficient: js.UndefOr[Double]): String = js.native
  }

  @JSImport("@material-ui/core/styles/createMuiTheme.js", JSImport.Default)
  @js.native
  object createMuiTheme extends js.Function1[js.UndefOr[ThemeOptions], Theme] {
    override def apply(options: js.UndefOr[ThemeOptions] = js.undefined): Theme = js.native
  }

  @JSImport("@material-ui/core/styles/createPalette.js", JSImport.Default)
  @js.native
  object createPalette extends js.Function1[PaletteOptions, Palette] {
    override def apply(palette: PaletteOptions): Palette = js.native
  }

  @JSImport("@material-ui/core/styles/createMixins.js", JSImport.Default)
  @js.native
  object createMixins extends js.Function3[Breakpoints, Spacing, MixinsOptions, Mixins] {
    override def apply(breakpoints: Breakpoints, spacing: Spacing, mixins: MixinsOptions): Mixins = js.native
  }

  @JSImport("@material-ui/core/styles/createBreakpoints.js", JSImport.Default)
  @js.native
  object createBreakpoints extends js.Function1[BreakpointsOptions, Breakpoints] {
    override def apply(options: BreakpointsOptions): Breakpoints = js.native
  }

  @JSImport("@material-ui/core/styles/createTypography.js", JSImport.Default)
  @js.native
  object createTypography extends js.Function2[Palette, TypographyOptions | js.Function1[Palette, TypographyOptions], Typography] {
    override def apply(
      palette: Palette,
      typography: TypographyOptions | js.Function1[Palette, TypographyOptions]
    ): Typography = js.native
  }

  @JSImport("@material-ui/core/styles/getStylesCreator.js", JSImport.Default)
  @js.native
  object getStylesCreator extends js.Function1[js.Object | js.Function, js.Object] {
    override def apply(stylesOrCreator: js.Object | js.Function): js.Object = js.native
  }

  @JSImport("@material-ui/core/styles/getThemeProps.js", JSImport.Default)
  @js.native
  object getThemeProps extends js.Function1[js.Object, js.Any] {
    override def apply(params: js.Object): js.Any = js.native
  }

  @JSImport("@material-ui/core/styles/shadows.js", JSImport.Default)
  @js.native
  object shadows extends js.Array[String]

  @JSImport("@material-ui/core/styles/spacing.js", JSImport.Default)
  @js.native
  object spacing extends Spacing

  @JSImport("@material-ui/core/styles/transitions.js", JSImport.Default)
  @js.native
  object transitions extends Transitions

  @JSImport("@material-ui/core/styles/withStyles.js", "noopTheme")
  @js.native
  object noopTheme extends Theme

  @JSImport("@material-ui/core/styles/withStyles.js", "defaultTheme")
  @js.native
  object defaultTheme extends Theme

  @JSImport("@material-ui/core/styles/withTheme.js", JSImport.Default)
  @js.native
  object withTheme extends js.Function0[js.Function1[VdomNode, VdomNode]] {
    override def apply(): js.Function1[VdomNode, VdomNode] = js.native
  }

  @JSImport("@material-ui/core/styles/zIndex.js", JSImport.Default)
  @js.native
  object zIndex extends ZIndex
}
