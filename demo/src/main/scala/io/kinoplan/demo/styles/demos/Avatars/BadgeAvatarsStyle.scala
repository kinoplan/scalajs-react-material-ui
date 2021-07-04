package io.kinoplan.demo.styles.demos.Avatars

import scala.concurrent.duration.DurationDouble

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class BadgeAvatarsStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    display.flex
  )

  val avatar = style(
    margin :=! theme.spacing.unit.px
  )

  val avatarBadge = style(
    width(22.px),
    height(22.px),
    border :=! s"2px solid ${theme.palette.background.paper}"
  )

  private val badgeKeyframe = keyframes(
    0.%% -> style(
      transform := "scale(.8)",
      opacity(1)
    ),
    100.%% -> style(
      transform := "scale(2.4)",
      opacity(0)
    )
  )

  val badge = style(
    backgroundColor :=! "#44b700",
    color :=! "#44b700",
    boxShadow := s"0 0 0 2px ${theme.palette.background.paper}",
    &.after(
      position.absolute,
      top(0.px),
      left(0.px),
      width(100.%%),
      height(100.%%),
      borderRadius(50.%%),
      mixin(
        animationName(badgeKeyframe),
        animationTimingFunction.easeInOut,
        animationIterationCount.infinite,
        animationDuration(1.2.second)
      ),
      border :=! s"1px solid currentColor",
      content :=! "\"\""
    )
  )
}

object DefaultBadgeAvatarsStyle extends BadgeAvatarsStyle
