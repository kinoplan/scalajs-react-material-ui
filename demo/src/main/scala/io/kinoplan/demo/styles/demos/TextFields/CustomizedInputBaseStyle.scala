package io.kinoplan.demo.styles.demos.TextFields

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class CustomizedInputBaseStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val root = style(
    padding(2.px, 4.px),
    display.flex,
    alignItems.center,
    width(400.px)
  )

  val input = style(
    marginLeft(8.px),
    flex := 1.px
  )

  val iconButton = style(
    padding(10.px)
  )

  val divider = style(
    width(1.px),
    height(28.px),
    margin(4.px)
  )

}

object DefaultCustomizedInputBaseStyle extends CustomizedInputBaseStyle
