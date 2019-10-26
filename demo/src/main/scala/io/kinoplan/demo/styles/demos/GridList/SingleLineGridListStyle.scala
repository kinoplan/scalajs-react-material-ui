package io.kinoplan.demo.styles.demos.GridList

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class SingleLineGridListStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    display.flex,
    flexWrap.wrap,
    justifyContent.spaceAround,
    overflow.hidden
  )

  val rootPaper = common.paper

  val gridList = style(
    flexWrap.nowrap,
    transform := "translateZ(0)"
  )

  val title = style(
    color :=! theme.palette.primary.light
  )

  val titleBar = style(
    background := "linear-gradient(to top, rgba(0,0,0,0.7) 0%, rgba(0,0,0,0.3) 70%, rgba(0,0,0,0) 100%)"
  )
}

object DefaultSingleLineGridListStyle extends SingleLineGridListStyle
