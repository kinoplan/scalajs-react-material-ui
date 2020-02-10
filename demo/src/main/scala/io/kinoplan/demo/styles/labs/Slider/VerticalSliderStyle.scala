package io.kinoplan.demo.styles.labs.Slider

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class VerticalSliderStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val root = style(
    display.flex,
    height(300.px)
  )

  val slider = style(
    padding(0.px, 22.px)
  )
}

object DefaultVerticalSliderStyle extends VerticalSliderStyle
