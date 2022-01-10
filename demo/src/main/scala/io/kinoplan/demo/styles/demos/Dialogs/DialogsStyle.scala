package io.kinoplan.demo.styles.demos.Dialogs

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.colors

case class DialogsStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import dsl._
  import common.theme

  val avatar = style(
    backgroundColor :=! colors.blue.`100`,
    color :=! colors.blue.`600`
  )

  val root = style(
    borderBottom :=! s"1px solid ${theme.palette.divider}",
    margin(0.px),
    padding :=! theme.spacing(2)
  )

  val closeButton = style(
    position.absolute,
    right :=! theme.spacing(1),
    top :=! theme.spacing(1),
    color :=! theme.palette.grey.`500`
  )

  val appBar = style(
    position.relative
  )

  val flexStyle = style(
    flex := "1"
  )

  val form = style(
    display.flex,
    flexDirection.column,
    margin.auto,
    width.fitContent
  )

  val formControl = style(
    marginTop :=! theme.spacing(2),
    minWidth(120.px)
  )

  val formControlLabel = style(
    marginTop :=! theme.spacing(1)
  )

  val customizedDialogContent = style(
    margin(0.px),
    padding :=! theme.spacing(2)
  )

  val customizedDialogActions = style(
    borderBottom :=! s"1px solid ${theme.palette.divider}",
    margin(0.px),
    padding :=! theme.spacing(1)
  )

}

object DefaultDialogsStyle extends DialogsStyle
