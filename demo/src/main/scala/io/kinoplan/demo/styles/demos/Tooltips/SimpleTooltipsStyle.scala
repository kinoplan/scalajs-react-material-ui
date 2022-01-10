package io.kinoplan.demo.styles.demos.Tooltips

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class SimpleTooltipsStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  val fab = style(
    margin :=! theme.spacing(2)
  )

  val absolute = style(
    position.absolute,
    bottom :=! theme.spacing(2),
    right :=! theme.spacing(3)
  )

}

object DefaultSimpleTooltipsStyle extends SimpleTooltipsStyle
