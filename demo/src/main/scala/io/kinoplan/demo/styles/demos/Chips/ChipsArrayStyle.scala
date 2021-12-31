package io.kinoplan.demo.styles.demos.Chips

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class ChipsArrayStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import dsl._
  import common.theme

  val root = style(
    display.flex,
    justifyContent.center,
    flexWrap.wrap,
    padding((theme.spacing.unit / 2).px)
  )

  val chip = style(
    margin((theme.spacing.unit / 2).px)
  )

}

object DefaultChipsArrayStyle extends ChipsArrayStyle
