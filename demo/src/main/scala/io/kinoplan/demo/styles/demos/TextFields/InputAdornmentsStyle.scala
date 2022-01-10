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
    margin :=! theme.spacing(1)
  )

  val top = style(
    marginTop :=! theme.spacing(2)
  )

  val withoutLabel = style(
    marginTop :=! theme.spacing(3)
  )

  val textField = style(
    flexBasis := 200.px
  )

}

object DefaultInputAdornmentsStyle extends InputAdornmentsStyle
