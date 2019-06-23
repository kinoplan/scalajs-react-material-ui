package io.kinoplan.demo.styles.demos.GridList

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class TitlebarGridListStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    display.flex,
    flexWrap.wrap,
    justifyContent.spaceAround,
    overflow.hidden,
    backgroundColor :=! theme.palette.background.paper
  )

  val gridList = style(
    width(500.px),
    height(450.px)
  )

  val iconStyle = style(
    color :=! "rgba(255, 255, 255, 0.54)"
  )
}

object DefaultTitlebarGridListStyle extends TitlebarGridListStyle
