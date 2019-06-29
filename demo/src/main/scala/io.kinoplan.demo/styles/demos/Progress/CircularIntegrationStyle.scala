package io.kinoplan.demo.styles.demos.Progress

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.colors

case class CircularIntegrationStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    display.flex,
    alignItems.center
  )

  val wrapper = style(
    margin(theme.spacing.unit.px),
    position.relative
  )

  val buttonSuccess = style(
    backgroundColor :=! colors.green.`500`,
    &.hover(
      backgroundColor :=! colors.green.`700`
    )
  )

  val fabProgress = style(
    color :=! colors.green.`500`,
    position.absolute,
    top(-6.px),
    left(-6.px),
    zIndex(1)
  )

  val buttonProgress = style(
    color :=! colors.green.`500`,
    position.absolute,
    top(50.%%),
    left(50.%%),
    marginTop(-12.px),
    marginLeft(-12.px)
  )
}

object DefaultCircularIntegrationStyle extends CircularIntegrationStyle
