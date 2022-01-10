package io.kinoplan.demo.styles

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.components.Layout
import io.kinoplan.scalajs.react.material.ui.core.colors
import io.kinoplan.scalajs.react.material.ui.core.styles.{
  PaletteOptions,
  ThemeOptions,
  TypographyOptions,
  createMuiTheme
}

class CommonStyle extends StyleSheet.Inline {
  import dsl._

  def theme = Layout.defaultTheme.getOrElse(
    createMuiTheme(
      options = ThemeOptions(
        typography = TypographyOptions(useNextVariants = true),
        palette = PaletteOptions(primary = colors.blue)
      )
    )
  )

  val gutters = style(
    paddingLeft :=! theme.spacing(2),
    paddingRight :=! theme.spacing(2),
    media.minWidth(theme.breakpoints.values.sm.px)(
      paddingLeft :=! theme.spacing(3),
      paddingRight :=! theme.spacing(3)
    )
  )

  val emptyStyle = style()

  val flexGrowOne = style(
    flexGrow(1)
  )

  val menuButton = style(
    marginRight :=! theme.spacing(2)
  )

  val menuButtonDesktop = style(
    marginLeft(-18.px),
    marginRight(10.px)
  )

  val title = style(
    flexGrow(1)
  )

  val componentTitleFont = style(
    color.rgba(0, 0, 0, 0.87),
    fontSize(16.px),
    fontFamily :=! "\"Roboto\", \"Helvetica\", \"Arial\", sans-serif;"
  )

  val componentTitlePadding = style(
    padding(0.px, 8.px),
    marginTop(16.px),
    marginBottom(16.px)
  )

  val demo = style(
    borderRadius(theme.shape.borderRadius.px),
    display.flex,
    justifyContent.center,
    paddingTop :=! theme.spacing(2),
    paddingBottom :=! theme.spacing(2),
    paddingLeft :=! theme.spacing(2),
    paddingRight :=! theme.spacing(2),
    media.minWidth(theme.breakpoints.values.sm.px)(
      paddingLeft :=! theme.spacing(3),
      paddingRight :=! theme.spacing(3),
      paddingTop :=! theme.spacing(6),
      paddingBottom :=! theme.spacing(3)
    )
  )

  val demoPaper = styleF.bool(isLight =>
    if (isLight) styleS(backgroundColor :=! theme.palette.grey.`200`)
    else styleS(backgroundColor :=! theme.palette.grey.`900`)
  )

  val paper = styleF.bool(isLight =>
    if (isLight) styleS(backgroundColor :=! colors.common.white)
    else styleS(backgroundColor :=! theme.palette.grey.`800`)
  )

  val demoHiddenHeader = style(
    paddingTop :=! theme.spacing(2),
    media.minWidth(theme.breakpoints.values.sm.px)(
      paddingTop :=! theme.spacing(3)
    )
  )

  val avatar = style(
    margin(10.px)
  )

}

object DefaultCommonStyle extends CommonStyle
