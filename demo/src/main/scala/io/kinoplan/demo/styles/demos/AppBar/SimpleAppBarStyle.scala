package io.kinoplan.demo.styles.demos.AppBar

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class SimpleAppBarStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    flexGrow(1)
  )

  val menuButton = style(
    marginRight((theme.spacing.unit * 2).px)
  )

  val title = style(
    flexGrow(1)
  )
}

object DefaultSimpleAppBarStyle extends SimpleAppBarStyle
