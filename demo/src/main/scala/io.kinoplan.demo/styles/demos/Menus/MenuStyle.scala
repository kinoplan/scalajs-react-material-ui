package io.kinoplan.demo.styles.demos.Menus

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class MenuStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val root = style(
    width(100.%%),
    maxWidth(360.px)
  )

  val rootPaper = common.paper
}

object DefaultMenuStyle extends MenuStyle
