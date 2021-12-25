package io.kinoplan.demo.styles.demos.Badges

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class CustomizedBadgeStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val badge = style(
    right((-3).px),
    top(13.px),
    border :=! s"2px solid ${theme.palette.background.paper}",
    padding :=! "0 4px"
  )
}

object DefaultCustomizedBadgeStyle extends CustomizedBadgeStyle

