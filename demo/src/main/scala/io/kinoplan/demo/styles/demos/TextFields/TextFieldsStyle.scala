package io.kinoplan.demo.styles.demos.TextFields

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class TextFieldsStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  val container = style(
    display.flex,
    flexWrap.wrap
  )

  val textField = style(
    marginLeft :=! theme.spacing(1),
    marginRight :=! theme.spacing(1),
    width(200.px)
  )

  val dense = style(
    marginTop(19.px)
  )

  val menu = style(
    width(200.px)
  )

}

object DefaultTextFieldsStyle extends TextFieldsStyle
