package io.kinoplan.demo.styles.labs.Breadcrumbs

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.styles.colorManipulator.emphasize

case class CustomizedBreadcrumbsStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    padding(theme.spacing.unit.px)
  )

  val chip = style(
    backgroundColor :=! theme.palette.grey.`100`,
    height(24.px),
    color :=! theme.palette.grey.`800`,
    fontWeight :=! theme.typography.fontWeightRegular.px,
    (&.hover & &.focus)(
      backgroundColor :=! theme.palette.grey.`300`
    ),
    &.active(
      boxShadow := theme.shadows(1),
      backgroundColor :=! emphasize(theme.palette.grey.`300`, 0.12)
    )
  )

  val avatar = style(
    background := "none",
    marginRight((-theme.spacing.unit * 1.5).px)
  )
}

object DefaultCustomizedBreadcrumbsStyle extends CustomizedBreadcrumbsStyle
