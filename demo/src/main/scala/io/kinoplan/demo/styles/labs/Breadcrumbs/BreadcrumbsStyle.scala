package io.kinoplan.demo.styles.labs.Breadcrumbs

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class BreadcrumbsStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    justifyContent.center,
    flexWrap.wrap
  )

  val paper = style(
    padding(theme.spacing.unit.px, (theme.spacing.unit * 2).px)
  )

  val link = style(
    display.flex
  )

  val icon = style(
    marginRight((theme.spacing.unit / 2).px),
    width(20.px),
    height(20.px)
  )
}

object DefaultBreadcrumbsStyle extends BreadcrumbsStyle
