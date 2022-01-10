package io.kinoplan.demo.styles.demos.AppBar

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class BottomAppBarStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  val root = style(
    backgroundColor :=! theme.palette.background.default,
    flexGrow(1),
    border.none,
    boxShadow := theme.shadows(1)
  )

  val text = style(
    paddingTop :=! theme.spacing(2),
    paddingLeft :=! theme.spacing(2),
    paddingRight :=! theme.spacing(2)
  )

  val paper = style(
    maxHeight(300.px),
    overflow.auto
  )

  val list = style(
    paddingBottom :=! theme.spacing(2)
  )

  val subHeader = common.paper

  val appBar = style(
    top.auto,
    bottom :=! 0.toString
  )

  val toolbar = style(
    alignItems.center,
    justifyContent.spaceBetween
  )

  val fabButton = style(
    position.absolute,
    zIndex :=! 1.toString,
    top :=! -30.toString,
    left :=! 0.toString,
    right :=! 0.toString,
    margin :=! "0 auto"
  )

}

object DefaultBottomAppBarStyle extends BottomAppBarStyle
