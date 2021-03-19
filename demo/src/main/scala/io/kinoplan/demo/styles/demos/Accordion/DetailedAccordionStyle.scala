package io.kinoplan.demo.styles.demos.Accordion

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class DetailedAccordionStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    width(100.%%)
  )

  val heading = style(
    fontSize :=! theme.typography.pxToRem(15)
  )

  val secondaryHeading = style(
    fontSize :=! theme.typography.pxToRem(15),
    color :=! theme.palette.text.secondary
  )

  val iconStyle = style(
    verticalAlign.bottom,
    height(20.px),
    width(20.px)
  )

  val details = style(
    alignItems.center
  )

  val column = style(
    flexBasis := 33.33.%%
  )

  val helper = style(
    borderLeft :=! s"2px solid ${theme.palette.divider}",
    padding :=! s"${theme.spacing.unit}px ${theme.spacing.unit * 2}px"
  )

  val linkStyle = style(
    color :=! theme.palette.primary.main,
    textDecoration := "none",
    &.hover(
      textDecoration := "underline"
    )
  )
}

object DefaultDetailedAccordionStyle extends DetailedAccordionStyle
