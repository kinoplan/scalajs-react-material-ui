package io.kinoplan.demo.styles.demos.TextFields

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class InputAdornmentsStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    display.flex,
    flexWrap.wrap
  )

  val cssMargin = style(
    margin(theme.spacing.unit.px)
  )

  val top = style(
    marginTop((theme.spacing.unit * 2).px)
  )

  val withoutLabel = style(
    marginTop((theme.spacing.unit * 3).px)
  )

  val textField = style(
    flexBasis := 200.px
  )
}

object DefaultInputAdornmentsStyle extends InputAdornmentsStyle
