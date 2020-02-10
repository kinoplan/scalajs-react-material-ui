package io.kinoplan.demo.styles

import io.kinoplan.demo.CssSettings._

case class ChildMenuStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._
  import common.theme

  val nested = style(
    paddingLeft((theme.spacing.unit * 4).px)
  )
}

object DefaultChildMenuStyle extends ChildMenuStyle
