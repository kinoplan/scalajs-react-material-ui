package io.kinoplan.demo.styles.demos.Progress

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class CircularProgressStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  val progress = style(
    margin((theme.spacing.unit * 2).px)
  )

}

object DefaultCircularProgressStyle extends CircularProgressStyle
