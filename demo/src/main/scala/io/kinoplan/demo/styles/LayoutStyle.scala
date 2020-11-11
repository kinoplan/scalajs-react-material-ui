package io.kinoplan.demo.styles

import scala.scalajs.js

import io.kinoplan.demo.CssSettings._
import io.kinoplan.scalajs.react.material.ui.core.styles.CreateTransitionsOptions

case class LayoutStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  private val drawerWidth = 260

  val theme = common.theme

  private val propAppBar = js.Array("width", "margin")

  private val appBarTransition: String = theme.transitions.create(
    propAppBar,
    CreateTransitionsOptions(
      easing = theme.transitions.easing.sharp,
      duration = theme.transitions.duration.leavingScreen
    )
  )

   val appBarShiftTransition: String = theme.transitions.create(
    propAppBar,
    CreateTransitionsOptions(
      easing = theme.transitions.easing.sharp,
      duration = theme.transitions.duration.enteringScreen
    )
  )

  private val drawerPaperOpenTransition = theme.transitions.create(
    js.Array("width"),
    CreateTransitionsOptions(
      easing = theme.transitions.easing.sharp,
      duration = theme.transitions.duration.enteringScreen
    )
  )

  private val drawerPaperCloseTransition = theme.transitions.create(
    js.Array("width"),
    CreateTransitionsOptions(
      easing = theme.transitions.easing.sharp,
      duration = theme.transitions.duration.leavingScreen
    )
  )

  val root = style(
    display.flex
  )

  val toolbarCustom = style(
    minHeight(56.px),
    media.minWidth(theme.breakpoints.values.xs.px).landscape(
      minHeight(48.px)
    ),
    media.minWidth(600.px)(
      minHeight(64.px)
    )
  )

  val appBar = style(
    zIndex :=! (theme.zIndex.drawer + 1).toString,
    transition := appBarTransition
  )

  val appBarShift = style(
    marginLeft(drawerWidth.px),
    width :=! s"calc(100% - ${drawerWidth}px)",
    transition := appBarShiftTransition
  )

  val menuButton = style(
    marginLeft(12.px),
    marginRight(36.px)
  )

  val menuButtonHidden = style(
    display.none
  )

  val drawer = style(
    width(drawerWidth.px),
    flexShrink(0),
    whiteSpace.nowrap
  )

  val drawerPaperOpen = style(
    width(drawerWidth.px),
    transition := drawerPaperOpenTransition
  )

  val drawerPaperClose = style(
    overflowX.hidden,
    transition := drawerPaperCloseTransition,
    width((theme.spacing.unit * 7 + 1).px),
    media.minWidth(theme.breakpoints.values.sm.px)(
      width((theme.spacing.unit * 9 + 1).px)
    )
  )

  val toolbar = style(
    display.flex,
    alignItems.center,
    justifyContent.flexEnd,
    padding(0.px, 8.px),
    toolbarCustom
  )

  val content = style(
    flexGrow(1),
    padding((theme.spacing.unit * 3).px)
  )

  val button = style(
    (&.hover & &.focus)(
      backgroundColor :=! "#5b7d38"
    )
  )

  val selected = style(
    backgroundColor :=! "#5b7d38 !important",
    &.focus(
      backgroundColor :=! "#5b7d38"
    )
  )
}

object DefaultLayoutStyle extends LayoutStyle
