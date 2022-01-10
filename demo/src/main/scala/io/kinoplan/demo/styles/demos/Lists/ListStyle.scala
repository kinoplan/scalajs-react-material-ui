package io.kinoplan.demo.styles.demos.Lists

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class ListStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  val root = style(
    width(100.%%),
    maxWidth(360.px)
  )

  val rootPaper = common.paper

  val nested = style(
    paddingLeft :=! theme.spacing(4)
  )

  val inline = style(
    display.inline
  )

}

object DefaultListStyle extends ListStyle
