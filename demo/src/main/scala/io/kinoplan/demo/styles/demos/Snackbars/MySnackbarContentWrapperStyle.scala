package io.kinoplan.demo.styles.demos.Snackbars

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.colors

case class MySnackbarContentWrapperStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  private val success = style(
    backgroundColor :=! colors.green.`600`
  )

  private val error = style(
    backgroundColor :=! theme.palette.error.dark
  )

  private val info = style(
    backgroundColor :=! theme.palette.primary.dark
  )

  private val warning = style(
    backgroundColor :=! colors.amber.`700`
  )

  def get(variant: String) = variant match {
    case "success" => success
    case "error"   => error
    case "info"    => info
    case "warning" => warning
    case _         => style()
  }

  val icon = style(
    fontSize(20.px)
  )

  val iconVariant = style(
    opacity(0.9),
    marginRight(theme.spacing.unit.px)
  )

  val message = style(
    display.flex,
    alignItems.center
  )

}

object DefaultMySnackbarContentWrapperStyle extends MySnackbarContentWrapperStyle
