package io.kinoplan.demo.styles.demos.Avatars

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.colors

case class IconAvatarsStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    display.flex
  )

  val avatar = style(
    margin :=! theme.spacing.unit.px
  )

  val pink = style(
    color :=! theme.palette.getContrastText(colors.pink.`500`),
    backgroundColor :=! colors.pink.`500`
  )

  val green = style(
    color :=! "#fff",
    backgroundColor :=! colors.green.`500`
  )
}

object DefaultIconAvatarsStyle extends IconAvatarsStyle
