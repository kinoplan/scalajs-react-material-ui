package io.kinoplan.demo.styles.demos.Steppers

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class MobileStepperStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val theme = common.theme

  val root = style(
    maxWidth(400.px),
    flexGrow(1)
  )

}

object DefaultMobileStepperStyle extends MobileStepperStyle
