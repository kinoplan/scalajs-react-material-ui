package io.kinoplan.demo.styles.labs.SpeedDial

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class SpeedDialStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  val root = style(
    height(380.px)
  )

  val speedDial = style(
    position.relative,
    float.right,
    bottom :=! theme.spacing(2)
  )

}

object DefaultSpeedDialStyle extends SpeedDialStyle
