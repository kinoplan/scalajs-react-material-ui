package io.kinoplan.demo.styles.demos.Lists

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class PinnedSubheaderListStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val root = style(
    width(100.%%),
    maxWidth(360.px),
    position.relative,
    overflow.auto,
    maxHeight(300.px)
  )

  val rootPaper = common.paper

  val listSection = style(
    backgroundColor.inherit
  )

  val ul = style(
    backgroundColor.inherit,
    padding(0.px)
  )
}

object DefaultPinnedSubheaderListStyle extends PinnedSubheaderListStyle
