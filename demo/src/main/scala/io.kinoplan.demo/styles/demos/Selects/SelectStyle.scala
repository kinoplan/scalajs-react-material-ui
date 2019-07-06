package io.kinoplan.demo.styles.demos.Selects

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class SelectStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    display.flex,
    flexWrap.wrap
  )

  val formControl = style(
    margin(theme.spacing.unit.px),
    minWidth(120.px)
  )

  val selectEmpty = style(
    marginTop((theme.spacing.unit * 2).px)
  )
}

object DefaultSelectStyle extends SelectStyle
