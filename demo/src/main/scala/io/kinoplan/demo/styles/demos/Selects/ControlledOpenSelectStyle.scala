package io.kinoplan.demo.styles.demos.Selects

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class ControlledOpenSelectStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  val button = style(
    display.block,
    marginTop :=! theme.spacing(2)
  )

  val formControl = style(
    margin :=! theme.spacing(1),
    minWidth(120.px)
  )

}

object DefaultControlledOpenSelectStyle extends ControlledOpenSelectStyle
