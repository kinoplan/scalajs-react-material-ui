package io.kinoplan.demo.styles.demos.Snackbars

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class CustomizedSnackbarsStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  val snackbar = style(
    margin :=! theme.spacing(1)
  )

}

object DefaultCustomizedSnackbarsStyle extends CustomizedSnackbarsStyle
