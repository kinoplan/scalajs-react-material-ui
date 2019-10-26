package io.kinoplan.demo.styles

import io.kinoplan.demo.CssSettings._

case class TabContainerStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._
  import common.theme

  val root = style(
    padding((theme.spacing.unit * 3).px)
  )
}

object DefaultTabContainerStyle extends TabContainerStyle
