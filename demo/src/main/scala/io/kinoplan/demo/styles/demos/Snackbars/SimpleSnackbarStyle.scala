package io.kinoplan.demo.styles.demos.Snackbars

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class SimpleSnackbarStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  val close = style(
    padding :=! theme.spacing(0.5)
  )

}

object DefaultSimpleSnackbarStyle extends SimpleSnackbarStyle
