package io.kinoplan.demo.styles

import io.kinoplan.demo.CssSettings._

case class SimpleTableStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val tableContainer = style(
    height(320.px)
  )

  val root = style(
    width(100.%%),
    overflowX.auto
  )

  val table = style(
    minWidth(700.px)
  )
}

object DefaultSimpleTableStyle extends SimpleTableStyle
