package io.kinoplan.demo.styles.labs.Slider

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class SliderStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val root = style(
    width(300.px)
  )

  val slider = style(
    padding(22.px, 0.px)
  )

  val thumbIcon = style(
    borderRadius(50.%%)
  )

  val thumbIconWrapper = style(
    backgroundColor :=! "#2196f3"
  )
}

object DefaultSliderStyle extends SliderStyle
