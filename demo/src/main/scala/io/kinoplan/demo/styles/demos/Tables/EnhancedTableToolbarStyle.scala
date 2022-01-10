package io.kinoplan.demo.styles.demos.Tables

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.styles.colorManipulator

case class EnhancedTableToolbarStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  val root = style(
    paddingRight :=! theme.spacing(1)
  )

  val highlight = styleF.bool(isLight =>
    if (isLight) styleS(
      color :=! theme.palette.secondary.main,
      backgroundColor :=! colorManipulator.lighten(theme.palette.secondary.light, 0.85)
    )
    else styleS(
      color :=! theme.palette.text.primary,
      backgroundColor :=! theme.palette.secondary.dark
    )
  )

  val spacer = style(
    flex := "1 1 100%"
  )

  val actions = style(
    color :=! theme.palette.text.secondary
  )

  val title = style(
    flex := "0 0 auto"
  )

}

object DefaultEnhancedTableToolbarStyle extends EnhancedTableToolbarStyle
