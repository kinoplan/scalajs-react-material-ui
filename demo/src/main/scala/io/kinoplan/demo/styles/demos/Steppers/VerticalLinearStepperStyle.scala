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
    marginTop :=! theme.spacing(1),
    marginRight :=! theme.spacing(1)
  )

  val actionsContainer = style(
    marginBottom :=! theme.spacing(2)
  )

  val resetContainer = style(
    padding :=! theme.spacing(3)
  )

}

object DefaultVerticalLinearStepperStyle extends VerticalLinearStepperStyle
