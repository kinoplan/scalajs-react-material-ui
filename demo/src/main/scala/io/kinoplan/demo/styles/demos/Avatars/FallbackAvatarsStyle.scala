package io.kinoplan.demo.styles.demos.Avatars

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.colors.deepOrange

case class FallbackAvatarsStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    display.flex
  )

  val avatar = style(
    margin :=! theme.spacing.unit.px
  )

  val orange = style(
    color :=! theme.palette.getContrastText(deepOrange.`500`),
    backgroundColor :=! deepOrange.`500`
  )
}

object DefaultFallbackAvatarsStyle extends FallbackAvatarsStyle
