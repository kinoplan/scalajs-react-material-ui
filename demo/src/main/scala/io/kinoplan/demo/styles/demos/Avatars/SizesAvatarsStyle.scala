package io.kinoplan.demo.styles.demos.Avatars

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class SizesAvatarsStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    display.flex
  )

  val avatar = style(
    margin :=! theme.spacing.unit.px
  )

  val small = style(
    width((theme.spacing.unit * 3).px),
    height((theme.spacing.unit * 3).px)
  )

  val large = style(
    width((theme.spacing.unit * 7).px),
    height((theme.spacing.unit * 7).px)
  )
}

object DefaultSizesAvatarsStyle extends SizesAvatarsStyle
