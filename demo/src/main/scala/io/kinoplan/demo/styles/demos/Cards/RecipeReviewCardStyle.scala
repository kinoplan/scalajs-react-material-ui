package io.kinoplan.demo.styles.demos.Cards

import scala.scalajs.js

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.colors
import io.kinoplan.scalajs.react.material.ui.core.styles.CreateTransitionsOptions

case class RecipeReviewCardStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._
  import common.theme

  private val expandTransition = theme.transitions.create(
    js.Array("transform"),
    CreateTransitionsOptions(
      duration = theme.transitions.duration.shortest
    )
  )

  val card = style(
    maxWidth(400.px)
  )

  val media = style(
    height(0.px),
    paddingTop(56.25.%%)
  )

  val actions = style(
    display.flex
  )

  val expand = style(
    transform := "rotate(0deg)",
    marginLeft.auto,
    transition := expandTransition
  )

  val expandOpen = style(
    transform := "rotate(180deg)"
  )

  val avatar = style(
    backgroundColor :=! colors.red.`500`
  )
}

object DefaultRecipeReviewCardStyle extends RecipeReviewCardStyle
