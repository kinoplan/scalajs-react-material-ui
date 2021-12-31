package io.kinoplan.demo.styles.demos.GridList

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class AdvancedGridListStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val root = style(
    display.flex,
    flexWrap.wrap,
    justifyContent.spaceAround,
    overflow.hidden
  )

  val rootPaper = common.paper

  val gridList = style(
    width(500.px),
    height(450.px),
    transform := "translateZ(0)"
  )

  val titleBar = style(
    background := "linear-gradient(to bottom, rgba(0,0,0,0.7) 0%, rgba(0,0,0,0.3) 70%, rgba(0,0,0,0) 100%)"
  )

  val iconStyle = style(
    color.white
  )

}

object DefaultAdvancedGridListStyle extends AdvancedGridListStyle
