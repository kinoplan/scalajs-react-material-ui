package io.kinoplan.demo.styles.demos.Steppers

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class VerticalLinearStepperStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    width(90.%%)
  )

  val button = style(
    marginTop(theme.spacing.unit.px),
    marginRight(theme.spacing.unit.px)
  )

  val actionsContainer = style(
    marginBottom((theme.spacing.unit * 2).px),
  )

  val resetContainer = style(
    padding((theme.spacing.unit * 3).px)
  )
}

object DefaultVerticalLinearStepperStyle extends VerticalLinearStepperStyle
