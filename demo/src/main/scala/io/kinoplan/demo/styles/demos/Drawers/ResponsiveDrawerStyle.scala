package io.kinoplan.demo.styles.demos.Drawers

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class ResponsiveDrawerStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val theme = common.theme

  private val drawerWidth = 240

  val root = style(
    flexGrow(1),
    height(400.px),
    zIndex(1),
    overflow.hidden,
    position.relative,
    display.flex,
    width(100.%%)
  )

  val drawer = style(
    overflow.auto,
    media.minWidth(theme.breakpoints.values.md.px)(
      width(drawerWidth.px),
      flexShrink(0)
    )
  )

  val appBar = style(
    position.absolute,
    marginLeft(drawerWidth.px),
    media.minWidth(theme.breakpoints.values.md.px)(
      width :=! s"calc(100% - ${drawerWidth}px)"
    )
  )

  val menuButton = style(
    media.minWidth(theme.breakpoints.values.md.px)(
      display.none
    )
  )

  val toolbarCustom = style(
    minHeight(56.px),
    media.minWidth(theme.breakpoints.values.xs.px).landscape(
      minHeight(48.px)
    ),
    media.minWidth(600.px)(
      minHeight(64.px)
    )
  )

  val drawerPaper = style(
    width(drawerWidth.px),
    media.minWidth(theme.breakpoints.values.md.px)(
      position.relative
    )
  )

  val content = style(
    overflow.auto,
    flexGrow(1),
    backgroundColor :=! theme.palette.background.default,
    padding((theme.spacing.unit * 3).px)
  )
}

object DefaultResponsiveDrawerStyle extends ResponsiveDrawerStyle
