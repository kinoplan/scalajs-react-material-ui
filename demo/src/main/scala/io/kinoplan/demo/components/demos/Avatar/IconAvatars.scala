package io.kinoplan.demo.components.demos.Avatar

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Avatars.{AvatarsStyle, DefaultAvatarsStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiAvatar, MuiGrid}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiAssignmentIcon, MuiFolderIcon, MuiPageviewIcon}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReactImplicits

object IconAvatars extends ScalaCssReactImplicits {
  case class Props(style: AvatarsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Icon avatars")(
          MuiGrid(justify = MuiGrid.Justify.center, alignItems = MuiGrid.AlignItems.center, container = true)(
            MuiAvatar()(css.avatar,
              MuiFolderIcon()
            ),
            MuiAvatar()(css.pinkAvatar,
              MuiPageviewIcon()
            ),
            MuiAvatar()(css.greenAvatar,
              MuiAssignmentIcon()
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
