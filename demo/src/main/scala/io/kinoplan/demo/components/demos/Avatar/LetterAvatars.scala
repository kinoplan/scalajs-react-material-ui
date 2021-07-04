package io.kinoplan.demo.components.demos.Avatar

import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Avatars.{DefaultLettersAvatarsStyle, LettersAvatarsStyle}
import io.kinoplan.scalajs.react.material.ui.core.MuiAvatar

object LetterAvatars extends ScalaCssReactImplicits {
  case class Props(style: LettersAvatarsStyle)

  private val component = ScalaComponent.builder[Props]
    .render_P { props =>
      val css = props.style

      div(
        ComponentContainer("Letter avatars")(
          div(css.root,
            MuiAvatar()(css.avatar, "H"),
            MuiAvatar()(css.avatar, css.orange, "N"),
            MuiAvatar()(css.avatar, css.purple, "OP")
          )
        )
      )
    }
    .build

  def apply(style: LettersAvatarsStyle = DefaultLettersAvatarsStyle) = component(Props(style))
}
