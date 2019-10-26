package io.kinoplan.demo.styles.demos.Paper

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class PaperStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    common.gutters,
    paddingTop((theme.spacing.unit * 2).px),
    paddingBottom((theme.spacing.unit * 2).px)
  )
}

object DefaultPaperStyle extends PaperStyle
