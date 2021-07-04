package io.kinoplan.demo.components.demos.Avatar

import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Avatars.{DefaultFallbackAvatarsStyle, FallbackAvatarsStyle}
import io.kinoplan.scalajs.react.material.ui.core.MuiAvatar

object FallbackAvatars extends ScalaCssReactImplicits {
  case class Props(style: FallbackAvatarsStyle)

  private val component = ScalaComponent.builder[Props]
    .render_P { props =>
      val css = props.style

      div(
        ComponentContainer("Fallbacks")(
          div(css.root,
            MuiAvatar()(css.avatar, css.orange, alt := "Remy Sharp", src := "/broken-image.jpg", "B"),
            MuiAvatar()(css.avatar, css.orange, alt := "Remy Sharp", src := "/broken-image.jpg"),
            MuiAvatar()(css.avatar, src := "/broken-image.jpg")
          )
        )
      )
    }
    .build

  def apply(style: FallbackAvatarsStyle = DefaultFallbackAvatarsStyle) = component(Props(style))
}
