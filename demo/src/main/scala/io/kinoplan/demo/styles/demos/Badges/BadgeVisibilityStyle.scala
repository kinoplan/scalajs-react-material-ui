package io.kinoplan.demo.styles.demos.Badges

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class BadgeVisibilityStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  val root = style(
    display.flex,
    flexDirection.column,
    alignItems.center,
    width(100.%%)
  )

  val badgeMargin = style(
    margin(theme.spacing.unit.px)
  )

  val divider = style(
    width(100.%%)
  )

  val row = style(
    marginTop((theme.spacing.unit * 2).px)
  )

}

object DefaultBadgeVisibilityStyle extends BadgeVisibilityStyle
