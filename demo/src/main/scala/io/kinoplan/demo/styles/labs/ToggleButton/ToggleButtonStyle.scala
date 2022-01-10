package io.kinoplan.demo.styles.labs.ToggleButton

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class ToggleButtonStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  val toggleContainer = style(
    height(56.px),
    padding :=! s"${theme.spacing(1)} ${theme.spacing(2)}",
    display.flex,
    alignItems.center,
    justifyContent.flexStart,
    margin :=! s"${theme.spacing(1)} 0px",
    background := theme.palette.background.default
  )

}

object DefaultToggleButtonStyle extends ToggleButtonStyle
