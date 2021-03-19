package io.kinoplan.demo.styles.demos.Accordion

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class ControlledAccordionStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    width(100.%%)
  )

  val heading = style(
    fontSize :=! theme.typography.pxToRem(15),
    flexBasis := 33.33.%%,
    flexShrink(0)
  )

  val secondaryHeading = style(
    fontSize :=! theme.typography.pxToRem(15),
    color :=! theme.palette.text.secondary
  )
}

object DefaultControlledAccordionStyle extends ControlledAccordionStyle
