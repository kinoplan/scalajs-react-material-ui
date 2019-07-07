package io.kinoplan.demo.styles.demos.Tables

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class SimpleTableStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    width(100.%%),
    marginTop((theme.spacing.unit * 3).px),
    overflowX.auto
  )

  val table = style(
    minWidth(700.px)
  )

  val tableContainer = style(
    height(320.px)
  )
}

object DefaultSimpleTableStyle extends SimpleTableStyle
