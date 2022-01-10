package io.kinoplan.demo.styles.demos.Cards

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class MediaControlCardStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val theme = common.theme

  val card = style(
    display.flex
  )

  val details = style(
    display.flex,
    flexDirection.column
  )

  val content = style(
    flex := "1 0 auto"
  )

  val cover = style(
    width(151.px)
  )

  val controls = style(
    display.flex,
    alignItems.center,
    paddingLeft :=! theme.spacing(1),
    paddingBottom :=! theme.spacing(1)
  )

  val playIcon = style(
    height(38.px),
    width(38.px)
  )

}

object DefaultMediaControlCardStyle extends MediaControlCardStyle
