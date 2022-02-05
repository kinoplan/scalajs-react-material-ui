package io.kinoplan.demo.styles.demos.Badges

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.styles.PaletteType

case class CustomizedBadgeStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  val badge = style(
    top(50.%%),
    right :=! -3.toString,
    border :=! s"2px solid ${if (theme.palette.`type` == PaletteType.light.toString) theme.palette.grey.`200`
      else theme.palette.grey.`900`}"
  )

}

object DefaultCustomizedBadgeStyle extends CustomizedBadgeStyle
