package io.kinoplan.demo.styles.demos.Dividers

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class DividersStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    width(100.%%),
    maxWidth(360.px)
  )

  val rootPaper = common.paper

  val dividerFullWidth = style(
    margin :=! s"5px 0 0 ${theme.spacing.unit * 2}px"
  )

  val dividerInset = style(
    margin :=! s"5px 0 0 ${theme.spacing.unit * 9}px"
  )

  val chip = style(
    marginRight(theme.spacing.unit.px)
  )

  val section1 = style(
    margin :=! s"${theme.spacing.unit * 3}px ${theme.spacing.unit * 2}px"
  )

  val section2 = style(
    margin((theme.spacing.unit * 2).px)
  )

  val section3 = style(
    margin :=! s"${theme.spacing.unit * 6}px ${theme.spacing.unit * 2}px ${theme.spacing.unit * 2}px"
  )
}

object DefaultDividersStyle extends DividersStyle
