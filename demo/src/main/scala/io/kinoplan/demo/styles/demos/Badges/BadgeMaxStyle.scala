package io.kinoplan.demo.styles.demos.Badges

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class BadgeMaxStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  val badgeMargin = style(
    marginTop :=! theme.spacing(2),
    marginBottom :=! theme.spacing(2),
    marginLeft :=! theme.spacing(2),
    marginRight :=! theme.spacing(2)
  )

}

object DefaultBadgeMaxStyle extends BadgeMaxStyle
