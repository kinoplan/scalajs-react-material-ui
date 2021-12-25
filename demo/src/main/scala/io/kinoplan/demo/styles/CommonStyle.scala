package io.kinoplan.demo.styles

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.components.Layout
import io.kinoplan.scalajs.react.material.ui.core.colors
import io.kinoplan.scalajs.react.material.ui.core.styles.colorManipulator.fade
import io.kinoplan.scalajs.react.material.ui.core.styles.{PaletteOptions, ThemeOptions, TypographyOptions, createMuiTheme}

class CommonStyle extends StyleSheet.Inline {
  import dsl._

  def theme = Layout.defaultTheme.getOrElse(createMuiTheme(
    options = ThemeOptions(
      typography = TypographyOptions(useNextVariants = true),
      palette = PaletteOptions(primary = colors.blue)
    )
  ))

  val gutters = style(
    paddingLeft((theme.spacing.unit * 2).px),
    paddingRight((theme.spacing.unit * 2).px),
    media.minWidth(theme.breakpoints.values.sm.px)(
      paddingLeft((theme.spacing.unit * 3).px),
      paddingRight((theme.spacing.unit * 3).px)
    )
  )

  val emptyStyle = style()

  val flexGrowOne = style(
    flexGrow(1)
  )

  val menuButton = style(
    marginRight((theme.spacing.unit * 2).px)
  )

  val menuButtonDesktop = style(
    marginLeft(-18.px),
    marginRight(10.px)
  )

  val title = style(
    flexGrow(1)
  )

  val demo = style(
    position.relative,
    outline(0.px),
    margin.auto,
    display.flex,
    justifyContent.center,
    media.minWidth(theme.breakpoints.values.sm.px)(
      borderRadius(theme.shape.borderRadius.px)
    )
  )

  val demoBgOutlined = style(
    padding((theme.spacing.unit * 3).px),
    border :=! s"1px solid ${fade(theme.palette.action.active, 0.12)}",
    borderLeftWidth(0.px),
    borderRightWidth(0.px),
    media.minWidth(theme.breakpoints.values.sm.px)(
      borderLeftWidth(1.px),
      borderRightWidth(1.px),
    )
  )

  val paper = styleF.bool(isLight =>
    if (isLight) {
      styleS(backgroundColor :=! colors.common.white)
    } else {
      styleS(backgroundColor :=!  theme.palette.grey.`800`)
    }
  )

  val demoHiddenHeader = style(
    paddingTop((theme.spacing.unit * 2).px),
    media.minWidth(theme.breakpoints.values.sm.px)(
      paddingTop((theme.spacing.unit * 3).px)
    )
  )

  val avatar = style(
    margin(10.px)
  )
}

object DefaultCommonStyle extends CommonStyle
