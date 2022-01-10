package io.kinoplan.demo.styles.demos.Steppers

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.colors

case class TextMobileStepperStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val theme = common.theme

  val root = style(
    maxWidth(400.px),
    flexGrow(1)
  )

  val header = style(
    display.flex,
    alignItems.center,
    height(50.px),
    paddingLeft :=! theme.spacing(4)
  )

  val headerPaper = styleF.bool(isLight =>
    if (isLight) styleS(backgroundColor :=! colors.grey.`50`)
    else styleS(backgroundColor :=! "#303030")
  )

  val img = style(
    height(255.px),
    maxWidth(400.px),
    overflow.hidden,
    display.block,
    width(100.%%)
  )

}

object DefaultTextMobileStepperStyle extends TextMobileStepperStyle
