package io.kinoplan.demo.styles.demos.Drawers

import scala.scalajs.js

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.styles.CreateTransitionsOptions

case class PersistentDrawerStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val theme = common.theme

  private val drawerWidth = 240

  private val propAppBar = js.Array("margin", "width")

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
      easing = theme.transitions.easing.easeOut,
      duration = theme.transitions.duration.enteringScreen
    )
  )

  private val propContent = js.Array("margin")

  private val contentTransition = theme.transitions.create(
    propContent,
    CreateTransitionsOptions(
      easing = theme.transitions.easing.sharp,
      duration = theme.transitions.duration.leavingScreen
    )
  )

  private val contentShiftTransition = theme.transitions.create(
    propContent,
    CreateTransitionsOptions(
      easing = theme.transitions.easing.easeOut,
      duration = theme.transitions.duration.enteringScreen
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
    transition := appBarTransition
  )

  val appBarShift = style(
    width :=! s"calc(100% - ${drawerWidth}px)",
    transition := appBarShiftTransition
  )

  val appBarShiftLeft = style(
    marginLeft(drawerWidth.px)
  )

  val appBarShiftRight = style(
    marginRight(drawerWidth.px)
  )

  val menuButton = style(
    marginLeft(12.px),
    marginRight(20.px)
  )

  val hide = style(
    display.none
  )

  val drawer = style(
    overflow.auto,
    media.minWidth(theme.breakpoints.values.xs.px)(
      width(drawerWidth.px),
      flexShrink(0)
    )
  )

  val drawerPaper = style(
    width(drawerWidth.px),
    media.minWidth(theme.breakpoints.values.xs.px)(
      position.relative
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

  val drawerHeader = style(
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
    transition := contentTransition,
    padding((theme.spacing.unit * 3).px)
  )

  val contentLeft = style(
    marginLeft((-drawerWidth).px)
  )

  val contentRight = style(
    marginRight((-drawerWidth).px)
  )

  val contentShift = style(
    transition := contentShiftTransition
  )

  val contentShiftLeft = style(
    marginLeft(0.px)
  )

  val contentShiftRight = style(
    marginRight(0.px)
  )
}

object DefaultPersistentDrawerStyle extends PersistentDrawerStyle
