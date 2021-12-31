package io.kinoplan.demo.styles.demos.Buttons

import io.kinoplan.demo.CssSettings._
import io.kinoplan.scalajs.react.material.ui.core.colors

case class CustomizedButtonsStyle(common: CommonButtonStyle = DefaultCommonButtonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  private val fontFamilyTitle = List(
    "-apple-system",
    "BlinkMacSystemFont",
    "\"Segoe UI\"",
    "Roboto",
    "\"Helvetica Neue\"",
    "Arial",
    "sans-serif",
    "\"Apple Color Emoji\"",
    "\"Segoe UI Emoji\"",
    "\"Segoe UI Symbol\""
  ).mkString(",")

  val cssRoot = style(
    color :=! theme.palette.getContrastText(colors.purple.`500`),
    backgroundColor :=! colors.purple.`500`,
    &.hover(
      backgroundColor :=! colors.purple.`700`
    )
  )

  val bootstrapRoot = style(
    boxShadow := "none",
    textTransform.none,
    fontSize(16.px),
    padding(6.px, 12.px),
    border :=! "1px solid #007bff",
    lineHeight(1.5),
    backgroundColor :=! "#007bff",
    fontFamily :=! fontFamilyTitle,
    &.hover(
      backgroundColor :=! "#0069d9",
      borderColor :=! "#0062cc"
    ),
    &.active(
      boxShadow := "none",
      backgroundColor :=! "#0062cc",
      borderColor :=! "#005cbf"
    ),
    &.focus(
      boxShadow := "0 0 0 0.2rem rgba(0,123,255,.5)"
    )
  )

}

object DefaultCustomizedButtonsStyle extends CustomizedButtonsStyle
