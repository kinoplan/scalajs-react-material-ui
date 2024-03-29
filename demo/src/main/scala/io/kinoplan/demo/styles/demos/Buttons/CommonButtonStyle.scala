package io.kinoplan.demo.styles.demos.Buttons

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class CommonButtonStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val theme = common.theme

  val marginButton = style(
    margin(theme.spacing.unit.px)
  )

  val inputButton = style(
    display.none
  )

  val extendedIcon = style(
    marginRight(theme.spacing.unit.px)
  )

}

object DefaultCommonButtonStyle extends CommonButtonStyle
