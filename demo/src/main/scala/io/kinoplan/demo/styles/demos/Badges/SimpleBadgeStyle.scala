package io.kinoplan.demo.styles.demos.Badges

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class SimpleBadgeStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  val badgeMargin = style(
    margin :=! theme.spacing(2)
  )

  val badgePadding = style(
    padding :=! s"0 ${theme.spacing(2)}px"
  )

}

object DefaultSimpleBadgeStyle extends SimpleBadgeStyle
