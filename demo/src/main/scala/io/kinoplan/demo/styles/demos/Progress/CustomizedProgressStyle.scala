package io.kinoplan.demo.styles.demos.Progress

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class CustomizedProgressStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  val progress = style(
    margin :=! theme.spacing(2),
    color :=! "#00695c"
  )

  val linearColorPrimary = style(
    backgroundColor :=! "#b2dfdb"
  )

  val linearBarColorPrimary = style(
    backgroundColor :=! "#00695c"
  )

  val facebook = style(
    margin :=! theme.spacing(2),
    position.relative
  )

  val facebook1 = style(
    color :=! "#eef3fd"
  )

  val facebook2 = style(
    color :=! "#6798e5",
    animationDuration :=! "550ms",
    position.absolute,
    left(0.px)
  )

}

object DefaultCustomizedProgressStyle extends CustomizedProgressStyle
