package io.kinoplan.demo.styles.labs.Slider

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class DisabledSliderStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val root = style(
    width(300.px)
  )

  val slider = style(
    padding(8.px, 0.px)
  )
}

object DefaultDisabledSliderStyle extends DisabledSliderStyle
