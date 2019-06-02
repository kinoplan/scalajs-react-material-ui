package io.kinoplan.demo.styles.demos

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class PrimarySearchAppBarStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline  {
  import dsl._

  val root = style(
    width(100.%%)
  )

  val title = style(
    display.none,

  )
}

object DefaultPrimarySearchAppBarStyle extends PrimarySearchAppBarStyle
