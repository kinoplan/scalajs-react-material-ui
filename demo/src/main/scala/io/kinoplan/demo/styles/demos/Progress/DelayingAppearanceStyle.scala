package io.kinoplan.demo.styles.demos.Progress

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class DelayingAppearanceStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  val root = style(
    display.flex,
    flexDirection.column,
    alignItems.center
  )

  val button = style(
    margin :=! theme.spacing(2)
  )

  val placeholder = style(
    height(40.px)
  )

}

object DefaultDelayingAppearanceStyle extends DelayingAppearanceStyle
