package io.kinoplan.demo.styles.demos.Drawers

import scala.scalajs.js

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.styles.CreateTransitionsOptions

case class MiniDrawerStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val theme = common.theme

  private val drawerWidth = 240

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

  private val propDrawer = js.Array("width")

  private val drawerOpenTransition = theme.transitions.create(
    propDrawer,
    CreateTransitionsOptions(
      easing = theme.transitions.easing.sharp,
      duration = theme.transitions.duration.enteringScreen
    )
  )

  private val drawerCloseTransition = theme.transitions.create(
    propDrawer,
    CreateTransitionsOptions(
      easing = theme.transitions.easing.sharp,
      duration = theme.transitions.duration.leavingScreen
    )
  )

  val root = style(
    flexGrow(1),
    height(400.px),
    zIndex(1),
    overflow.hidden,
    position.relative,
    display.flex,
    width(100.%%)
  )

  val appBar = style(
    position.absolute,
    zIndex :=! (theme.zIndex.drawer + 1).px,
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

  val hide = style(
    display.none
  )

  val drawer = style(
    overflow.auto,
    width(drawerWidth.px),
    flexShrink(0),
    whiteSpace.nowrap
  )

  val drawerOpen = style(
    width(drawerWidth.px),
    transition := drawerOpenTransition,
    media.minWidth(theme.breakpoints.values.xs.px)(
      position.relative,
      whiteSpace.nowrap
    )
  )

  val drawerClose = style(
    transition := drawerCloseTransition,
    overflowX.hidden,
    width((theme.spacing.unit * 7 + 1).px),
    media.minWidth(theme.breakpoints.values.sm.px)(
      width((theme.spacing.unit * 9 + 1).px),
      position.relative,
      whiteSpace.nowrap
    )
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

  val toolbar = style(
    display.flex,
    alignItems.center,
    justifyContent.flexEnd,
    padding(0.px, 8.px),
    toolbarCustom
  )

  val content = style(
    overflow.auto,
    flexGrow(1),
    backgroundColor :=! theme.palette.background.default,
    padding((theme.spacing.unit * 3).px)
  )
}

object DefaultMiniDrawerStyle extends MiniDrawerStyle
