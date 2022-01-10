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
    marginLeft :=! theme.spacing(1),
    marginRight :=! theme.spacing(1),
    width(200.px)
  )

  val grid = style(
    width(60.%%)
  )

}

object DefaultPickersStyle extends PickersStyle
