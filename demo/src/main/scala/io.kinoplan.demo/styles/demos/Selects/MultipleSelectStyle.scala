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
    margin(theme.spacing.unit.px),
    minWidth(120.px),
    maxWidth(300.px)
  )

  val chips = style(
    display.flex,
    flexWrap.wrap
  )

  val chip = style(
    margin((theme.spacing.unit / 4).px)
  )

  val noLabel = style(
    marginTop((theme.spacing.unit * 3).px)
  )
}

object DefaultMultipleSelectStyle extends MultipleSelectStyle
