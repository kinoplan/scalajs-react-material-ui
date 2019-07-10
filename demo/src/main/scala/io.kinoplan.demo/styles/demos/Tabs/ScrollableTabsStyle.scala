package io.kinoplan.demo.styles.demos.Tabs

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class ScrollableTabsStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val theme = common.theme

  val root = style(
    flexGrow(1),
    width(500.px)
  )

  val rootPaper = common.paper
}

object DefaultScrollableTabsStyle extends ScrollableTabsStyle
