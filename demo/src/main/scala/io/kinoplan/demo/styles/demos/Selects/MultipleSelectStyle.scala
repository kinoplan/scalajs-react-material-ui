package io.kinoplan.demo.styles.demos.Selects

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class MultipleSelectStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val theme = common.theme

  val root = style(
    display.flex,
    flexWrap.wrap
  )

  val formControl = style(
    margin :=! theme.spacing(1),
    minWidth(120.px),
    maxWidth(300.px)
  )

  val chips = style(
    display.flex,
    flexWrap.wrap
  )

  val chip = style(
    margin :=! theme.spacing(0.25)
  )

  val noLabel = style(
    marginTop :=! theme.spacing(3)
  )

}

object DefaultMultipleSelectStyle extends MultipleSelectStyle
