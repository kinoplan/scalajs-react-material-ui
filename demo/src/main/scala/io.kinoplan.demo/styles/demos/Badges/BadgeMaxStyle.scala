package io.kinoplan.demo.styles.demos.Badges

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class BadgeMaxStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val badgeMargin = style(
    marginTop((theme.spacing.unit * 2).px),
    marginBottom((theme.spacing.unit * 2).px),
    marginLeft((theme.spacing.unit * 2).px),
    marginRight((theme.spacing.unit * 3).px)
  )
}

object DefaultBadgeMaxStyle extends BadgeMaxStyle
