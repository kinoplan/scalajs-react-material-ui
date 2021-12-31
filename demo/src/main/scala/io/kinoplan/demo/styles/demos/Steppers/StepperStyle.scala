package io.kinoplan.demo.styles.demos.Steppers

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class StepperStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  val root = style(
    width(90.%%)
  )

  val button = style(
    marginRight(theme.spacing.unit.px)
  )

  val completed = style(
    display.inlineBlock
  )

  val instructions = style(
    marginTop(theme.spacing.unit.px),
    marginBottom(theme.spacing.unit.px)
  )

}

object DefaultStepperStyle extends StepperStyle
