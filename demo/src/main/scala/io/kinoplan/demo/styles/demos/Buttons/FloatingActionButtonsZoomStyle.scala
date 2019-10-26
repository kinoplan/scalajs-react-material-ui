package io.kinoplan.demo.styles.demos.Buttons

import io.kinoplan.demo.CssSettings._
import io.kinoplan.scalajs.react.material.ui.core.colors

case class FloatingActionButtonsZoomStyle(common: CommonButtonStyle = DefaultCommonButtonStyle) extends StyleSheet.Inline {
  import dsl._

  val theme = common.theme

  val root = style(
    width(500.px),
    position.relative,
    minHeight(200.px)
  )

  val rootPaper = common.common.paper

  val fab = style(
    position.absolute,
    bottom((theme.spacing.unit * 2).px),
    right((theme.spacing.unit * 2).px)
  )

  val fabGreen = style(
    color :=! theme.palette.common.white,
    backgroundColor :=! colors.green.`500`
  )

  val fabAndFabGreen = fab + fabGreen
}

object DefaultFloatingActionButtonsZoomStyle extends FloatingActionButtonsZoomStyle
