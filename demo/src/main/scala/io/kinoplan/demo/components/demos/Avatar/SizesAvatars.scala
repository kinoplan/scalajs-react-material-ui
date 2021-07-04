package io.kinoplan.demo.components.demos.Avatar

import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Avatars.{DefaultSizesAvatarsStyle, SizesAvatarsStyle}
import io.kinoplan.scalajs.react.material.ui.core.MuiAvatar

object SizesAvatars extends ScalaCssReactImplicits {
  case class Props(style: SizesAvatarsStyle)

  private val component = ScalaComponent.builder[Props]
    .render_P { props =>
      val css = props.style

      div(
        ComponentContainer("Sizes")(
          div(css.root,
            MuiAvatar()(css.avatar, css.small, alt := "Remy Sharp", src := "/static/images/avatar/1.jpg"),
            MuiAvatar()(css.avatar, alt := "Remy Sharp", src := "/static/images/avatar/1.jpg"),
            MuiAvatar()(css.avatar, css.large, alt := "Remy Sharp", src := "/static/images/avatar/1.jpg")
          )
        )
      )
    }
    .build

  def apply(style: SizesAvatarsStyle = DefaultSizesAvatarsStyle) = component(Props(style))
}
