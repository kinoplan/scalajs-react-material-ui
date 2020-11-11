package io.kinoplan.demo.styles.demos.Selects

import scala.scalajs.js

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class CustomizedSelectsStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    display.flex,
    flexWrap.wrap
  )

  val marginStyle = style(
    margin(theme.spacing.unit.px)
  )

  val bootstrapFormLabel = style(
    fontSize(18.px)
  )

  val bootstrapRoot = style()

  private val bootstrapRootPlus = style(
    unsafeRoot(s"label + .${bootstrapRoot.htmlClass}")(
      marginTop((theme.spacing.unit * 3).px)
    )
  )

  val bootstrapRootLabel = style(addClassName(
    bootstrapRootPlus.htmlClass
  ))

  private val propBootstrapInput = js.Array("border-color", "box-shadow")

  private val bootstrapInputTransition: String = theme.transitions.create(propBootstrapInput, js.undefined)

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

  val bootstrapInput = style(
    borderRadius(4.px),
    position.relative,
    border :=! "1px solid #ced4da",
    fontSize(16.px),
    width.auto,
    padding(10.px, 26.px, 10.px, 12.px),
    transition := bootstrapInputTransition,
    fontFamily :=! fontFamilyTitle,
    &.focus(
      borderRadius(4.px),
      borderColor :=! "#80bdff",
      boxShadow := "0 0 0 0.2rem rgba(0,123,255,.25)"
    )
  )

  val bootstrapInputPaper = common.paper
}

object DefaultCustomizedSelectsStyle extends CustomizedSelectsStyle
