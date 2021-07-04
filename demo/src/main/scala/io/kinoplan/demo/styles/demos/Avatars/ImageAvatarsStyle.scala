package io.kinoplan.demo.styles.demos.Avatars

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class ImageAvatarsStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    display.flex
  )

  val avatar = style(
    margin :=! theme.spacing.unit.px
  )
}

object DefaultImageAvatarsStyle extends ImageAvatarsStyle
