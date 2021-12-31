package io.kinoplan.demo.styles.demos.Tables

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class EnhancedTableStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  val root = style(
    width(100.%%),
    marginTop((theme.spacing.unit * 3).px)
  )

  val table = style(
    minWidth(1020.px)
  )

  val tableWrapper = style(
    overflowX.auto
  )

}

object DefaultEnhancedTableStyle extends EnhancedTableStyle
