package io.kinoplan.demo.styles.demos.Steppers

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.styles.CreateTransitionsOptions

case class CustomizedStepperStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    width(90.%%)
  )

  val button = style(
    marginRight(theme.spacing.unit.px)
  )

  val instructions = style(
    marginTop(theme.spacing.unit.px),
    marginBottom(theme.spacing.unit.px)
  )

  private val connectorLineTransition = theme.transitions.create(
    "border-color",
    CreateTransitionsOptions(
      duration = Some(theme.transitions.duration.standard),
      easing = Some(theme.transitions.easing.easeInOut)
    )
  )

  val connectorLine = style(
    transition := connectorLineTransition
  )

  val connectorActive = style()

  val connectorActiveRoot = style(
    unsafeRoot(s".${connectorActive.htmlClass} .${connectorLine.htmlClass}")(
      borderColor :=! theme.palette.secondary.main
    )
  )

  val connectorCompleted = style()

  val connectorCompletedRoot = style(
    unsafeRoot(s".${connectorCompleted.htmlClass} .${connectorLine.htmlClass}")(
      borderColor :=! theme.palette.primary.main
    )
  )

  val connectorDisabled = style()

  val connectorDisabledRoot = style(
    unsafeRoot(s".${connectorDisabled.htmlClass} .${connectorLine.htmlClass}")(
      borderColor :=! theme.palette.grey.`100`
    )
  )
}

object DefaultCustomizedStepperStyle extends CustomizedStepperStyle
