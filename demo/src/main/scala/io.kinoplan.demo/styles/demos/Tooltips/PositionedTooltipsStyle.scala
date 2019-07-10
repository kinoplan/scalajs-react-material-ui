package io.kinoplan.demo.styles.demos.Tooltips

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class PositionedTooltipsStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val root = style(
    width(500.px)
  )
}

object DefaultPositionedTooltipsStyle extends PositionedTooltipsStyle
