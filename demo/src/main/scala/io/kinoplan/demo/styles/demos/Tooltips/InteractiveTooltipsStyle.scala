package io.kinoplan.demo.styles.demos.Tooltips

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class InteractiveTooltipsStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  val button = style(
    margin(theme.spacing.unit.px)
  )

}

object DefaultInteractiveTooltipsStyle extends InteractiveTooltipsStyle
