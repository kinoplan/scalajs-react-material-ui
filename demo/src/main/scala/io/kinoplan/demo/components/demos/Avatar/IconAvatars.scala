package io.kinoplan.demo.components.demos.Avatar

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Avatars.{AvatarsStyle, DefaultAvatarsStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiAvatar, MuiGrid}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object IconAvatars extends ScalaCssReactImplicits {
  case class Props(style: AvatarsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Icon avatars")(
          MuiGrid(justify = MuiGrid.Justify.center, alignItems = MuiGrid.AlignItems.center, container = true)(
            MuiAvatar()(css.avatar,
              MuiIcons(MuiIconsModule.Folder)()
            ),
            MuiAvatar()(css.pinkAvatar,
              MuiIcons(MuiIconsModule.Pageview)()
            ),
            MuiAvatar()(css.greenAvatar,
              MuiIcons(MuiIconsModule.Assignment)()
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("IconAvatars")
    .renderBackend[Backend]
    .build

  def apply(style: AvatarsStyle = DefaultAvatarsStyle) = component(Props(style))
}
