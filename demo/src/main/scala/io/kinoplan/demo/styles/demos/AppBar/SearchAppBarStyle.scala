package io.kinoplan.demo.styles.demos.AppBar

import scala.scalajs.js

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.styles.colorManipulator.alpha

case class SearchAppBarStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {

  import common.theme
  import dsl._

  private val fadeFirst = alpha(theme.palette.common.white, 0.15)
  private val fadeSecond = alpha(theme.palette.common.white, 0.25)

  private val inputInputTransition = theme.transitions.create(js.Array("width"), js.undefined)

  val root = style(
    width(100.%%)
  )

  val title = style(
    display.none,
    media.minWidth(theme.breakpoints.values.sm.px)(
      display.block
    )
  )

  val search = style(
    position.relative,
    borderRadius :=! theme.shape.borderRadius.px,
    backgroundColor :=! fadeFirst,
    &.hover(
      backgroundColor :=! fadeSecond
    ),
    marginLeft(0.px),
    width(100.%%),
    media.minWidth(theme.breakpoints.values.sm.px)(
      marginLeft :=! theme.spacing(1),
      width.auto
    )
  )

  val searchIcon = style(
    width :=! theme.spacing(9),
    height(100.%%),
    position.absolute,
    pointerEvents.none,
    display.flex,
    alignItems.center,
    justifyContent.center
  )

  val inputRoot = style(
    color.inherit,
    width(100.%%)
  )

  val inputInput = style(
    paddingTop :=! theme.spacing(1),
    paddingRight :=! theme.spacing(1),
    paddingBottom :=! theme.spacing(1),
    paddingLeft :=! theme.spacing(10),
    transition := inputInputTransition,
    width(100.%%),
    media.minWidth(theme.breakpoints.values.sm.px)(
      width(120.px),
      &.focus(
        width(200.px)
      )
    )
  )

}

object DefaultSearchAppBarStyle extends SearchAppBarStyle
