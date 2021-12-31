package io.kinoplan.demo.styles.demos.Tables

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class CustomizedTableStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  val tableContainer = style(
    height(320.px)
  )

  val root = style(
    width(100.%%),
    marginTop((theme.spacing.unit * 3).px),
    overflowX.auto
  )

  val table = style(
    minWidth(700.px)
  )

  val row = style(
    &.nthOfType("odd")(
      backgroundColor :=! theme.palette.background.default
    )
  )

  val head = style(
    backgroundColor :=! theme.palette.common.black,
    color :=! theme.palette.common.white
  )

  val body = style(
    fontSize(14.px)
  )

}

object DefaultCustomizedTableStyle extends CustomizedTableStyle
