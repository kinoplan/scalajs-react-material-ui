package io.kinoplan.demo.styles.demos.Lists

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class InteractiveListStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    flexGrow(1),
    maxWidth(752.px)
  )

  val demo = style(
    backgroundColor :=! theme.palette.background.paper
  )

  val title = style(
    margin :=! s"${theme.spacing.unit * 4}px 0 ${theme.spacing.unit * 2}px"
  )
}

object DefaultInteractiveListStyle extends InteractiveListStyle
