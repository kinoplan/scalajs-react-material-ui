package io.kinoplan.demo.styles.labs.ToggleButton

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class ToggleButtonStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val toggleContainer = style(
    height(56.px),
    padding(theme.spacing.unit.px, (theme.spacing.unit * 2).px),
    display.flex,
    alignItems.center,
    justifyContent.flexStart,
    margin(theme.spacing.unit.px, 0.px),
    background := theme.palette.background.default
  )
}

object DefaultToggleButtonStyle extends ToggleButtonStyle
