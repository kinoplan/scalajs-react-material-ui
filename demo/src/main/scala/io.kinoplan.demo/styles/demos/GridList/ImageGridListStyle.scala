package io.kinoplan.demo.styles.demos.GridList

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class ImageGridListStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
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
}

object DefaultImageGridListStyle extends ImageGridListStyle
