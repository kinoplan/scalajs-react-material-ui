package io.kinoplan.demo.styles.demos.Pickers

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class PickersStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  val container = style(
    display.flex,
    flexWrap.wrap
  )

  val textField = style(
    marginLeft(theme.spacing.unit.px),
    marginRight(theme.spacing.unit.px),
    width(200.px)
  )

  val grid = style(
    width(60.%%)
  )

}

object DefaultPickersStyle extends PickersStyle
