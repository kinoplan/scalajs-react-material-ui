package io.kinoplan.demo.components.demos.Avatar

import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Avatars.{DefaultIconAvatarsStyle, IconAvatarsStyle}
import io.kinoplan.scalajs.react.material.ui.core.MuiAvatar
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object IconAvatars extends ScalaCssReactImplicits {
  case class Props(style: IconAvatarsStyle)

  private val component = ScalaComponent.builder[Props]
    .render_P { props =>
      val css = props.style

      div(
        ComponentContainer("Icon avatars")(
          div(css.root,
            MuiAvatar()(css.avatar, MuiIcons(MuiIconsModule.Folder)()),
            MuiAvatar()(css.avatar, css.pink, MuiIcons(MuiIconsModule.Pageview)()),
            MuiAvatar()(css.avatar, css.green, MuiIcons(MuiIconsModule.Assignment)())
          )
        )
      )
    }
    .build

  def apply(style: IconAvatarsStyle = DefaultIconAvatarsStyle) = component(Props(style))
}
