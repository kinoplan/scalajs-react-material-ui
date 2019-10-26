package io.kinoplan.demo.styles.demos.Tabs

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class IconTabsStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val root = style(
    flexGrow(1),
    width(500.px)
  )
}

object DefaultIconTabsStyle extends IconTabsStyle
