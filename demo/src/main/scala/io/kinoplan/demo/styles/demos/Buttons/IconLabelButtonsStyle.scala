package io.kinoplan.demo.styles.demos.Buttons

import io.kinoplan.demo.CssSettings._

case class IconLabelButtonsStyle(common: CommonButtonStyle = DefaultCommonButtonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val leftIcon = style(
    marginRight(theme.spacing.unit.px)
  )

  val rightIcon = style(
    marginLeft(theme.spacing.unit.px)
  )

  val iconSmall = style(
    fontSize(20.px)
  )
}

object DefaultIconLabelButtonsStyle extends IconLabelButtonsStyle
