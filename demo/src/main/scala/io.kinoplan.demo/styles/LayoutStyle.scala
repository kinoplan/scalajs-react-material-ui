package io.kinoplan.demo.styles

import io.kinoplan.demo.CssSettings._
import io.kinoplan.scalajs.react.material.ui.core.styles.CreateTransitionsOptions

import scala.scalajs.js.JSConverters._

case class LayoutStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  private val drawerWidth = 260

  val theme = common.theme

  private val propAppBar = Array("width", "margin").toJSArray

  private val appBarTransition: String = theme.transitions.create(
    propAppBar,
    CreateTransitionsOptions(
      easing = Some(theme.transitions.easing.sharp),
      duration = Some(theme.transitions.duration.leavingScreen)
    )
  )

   val appBarShiftTransition: String = theme.transitions.create(
    propAppBar,
    CreateTransitionsOptions(
      easing = Some(theme.transitions.easing.sharp),
      duration = Some(theme.transitions.duration.enteringScreen)
    )
  )

  private val drawerPaperTransition = theme.transitions.create(
    "width",
    CreateTransitionsOptions(
      easing = Some(theme.transitions.easing.sharp),
      duration = Some(theme.transitions.duration.enteringScreen)
    )
  )

  private val drawerPaperCloseTransition = theme.transitions.create(
    "width",
    CreateTransitionsOptions(
      easing = Some(theme.transitions.easing.sharp),
      duration = Some(theme.transitions.duration.leavingScreen)
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

  val toolbar = style(
    paddingRight(24.px)
  )

  val toolbarIcon = style(
    display.flex,
    alignItems.center,
    justifyContent.flexEnd,
    padding(0.px, 8.px),
    toolbarCustom
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

  val drawerPaper = style(
    position.relative,
    whiteSpace.nowrap,
    width(drawerWidth.px),
    transition := drawerPaperTransition
  )

  val drawerPaperClose = style(
    overflowX.hidden,
    transition := drawerPaperCloseTransition,
    width((theme.spacing.unit * 7).px),
    media.minWidth(theme.breakpoints.values.sm.px)(
      width((theme.spacing.unit * 9).px)
    )
  )

  val appBarSpacer = toolbarCustom

  val content = style(
    flexGrow(1),
    padding((theme.spacing.unit * 3).px),
    height(100.vh),
    overflow.auto
  )
}

object DefaultLayoutStyle extends LayoutStyle
