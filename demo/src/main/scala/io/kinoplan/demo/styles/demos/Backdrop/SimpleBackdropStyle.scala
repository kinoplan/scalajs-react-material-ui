package io.kinoplan.demo.styles.demos.Backdrop

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class SimpleBackdropStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val backdrop = style(
    zIndex :=! (theme.zIndex.drawer + 1).toString,
    color :=! "#fff"
  )
}

object DefaultSimpleBackdropStyle extends SimpleBackdropStyle
