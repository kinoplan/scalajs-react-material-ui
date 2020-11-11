package io.kinoplan.demo.styles.demos.Snackbars

import scala.scalajs.js

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.styles.CreateTransitionsOptions

case class FabIntegrationSnackbarStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  private val propFabMove = js.Array("transform")

  private val fabMoveUpTransition = theme.transitions.create(
    propFabMove,
    CreateTransitionsOptions(
      duration = theme.transitions.duration.enteringScreen,
      easing = theme.transitions.easing.easeOut
    )
  )

  private val fabMoveDownTransition = theme.transitions.create(
    propFabMove,
    CreateTransitionsOptions(
      duration = theme.transitions.duration.leavingScreen,
      easing = theme.transitions.easing.sharp
    )
  )

  val root = style(
    position.relative,
    overflow.hidden
  )

  val appFrame = style(
    width(360.px),
    height(360.px),
    overflow.hidden
  )

  val appFramePaper = common.paper

  val menuButton = style(
    marginLeft(-12.px),
    marginRight(20.px)
  )

  val button = style(
    marginBottom(theme.spacing.unit.px)
  )

  val fab = style(
    position.absolute,
    bottom((theme.spacing.unit * 2).px),
    right((theme.spacing.unit * 2).px)
  )

  val fabMoveUp = style(
    transform := "translate3d(0, -46px, 0)",
    transition := fabMoveUpTransition
  )

  val fabMoveDown = style(
    transform := "translate3d(0, 0, 0)",
    transition := fabMoveDownTransition
  )

  val snackbar = style(
    position.absolute
  )

  val snackbarContent = style(
    width(360.px)
  )
}

object DefaultFabIntegrationSnackbarStyle extends FabIntegrationSnackbarStyle
