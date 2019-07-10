package io.kinoplan.demo.styles.demos.Tooltips

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class VariableWidthStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val button = style(
    margin(theme.spacing.unit.px)
  )

  val customWidth = style(
    maxWidth(500.px)
  )

  val noMaxWidth = style(
    maxWidth.none
  )
}

object DefaultVariableWidthStyle extends VariableWidthStyle
