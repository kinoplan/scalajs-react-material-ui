package io.kinoplan.demo.styles.demos.Tooltips

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class SimpleTooltipsStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  val fab = style(
    margin((theme.spacing.unit * 2).px)
  )

  val absolute = style(
    position.absolute,
    bottom((theme.spacing.unit * 2).px),
    right((theme.spacing.unit * 3).px)
  )

}

object DefaultSimpleTooltipsStyle extends SimpleTooltipsStyle
