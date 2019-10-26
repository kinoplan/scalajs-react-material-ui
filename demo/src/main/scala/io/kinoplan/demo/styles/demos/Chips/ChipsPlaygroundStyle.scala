package io.kinoplan.demo.styles.demos.Chips

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class ChipsPlaygroundStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._
  import common.theme

  val root = style(
    flexGrow(1)
  )

  val control = style(
    padding((theme.spacing.unit * 2).px)
  )

  val chipWrapper = style(
    marginBottom((theme.spacing.unit * 5).px)
  )
}

object DefaultChipsPlaygroundStyle extends ChipsPlaygroundStyle

