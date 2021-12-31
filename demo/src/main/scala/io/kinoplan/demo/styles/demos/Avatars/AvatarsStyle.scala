package io.kinoplan.demo.styles.demos.Avatars

import io.kinoplan.demo.CssSettings._
import io.kinoplan.scalajs.react.material.ui.core.colors
import io.kinoplan.scalajs.react.material.ui.core.colors.{deepOrange, deepPurple}

class AvatarsStyle extends StyleSheet.Inline {
  import dsl._

  private val commonAvatar = style(
    margin(10.px),
    color :=! "#fff"
  )

  val avatar = style(
    margin(10.px)
  )

  val bigAvatar = style(
    margin(10.px),
    width(60.px),
    height(60.px)
  )

  val orangeAvatar = style(
    commonAvatar,
    backgroundColor :=! deepOrange.`500`
  )

  val purpleAvatar = style(
    commonAvatar,
    backgroundColor :=! deepPurple.`500`
  )

  val pinkAvatar = style(
    commonAvatar,
    backgroundColor :=! colors.pink.`500`
  )

  val greenAvatar = style(
    commonAvatar,
    backgroundColor :=! colors.green.`500`
  )

}

object DefaultAvatarsStyle extends AvatarsStyle
