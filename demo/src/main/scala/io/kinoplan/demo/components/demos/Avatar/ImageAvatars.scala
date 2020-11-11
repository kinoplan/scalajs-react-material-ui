package io.kinoplan.demo.components.demos.Avatar

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Avatars.{AvatarsStyle, DefaultAvatarsStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiAvatar, MuiGrid}

object ImageAvatars extends ScalaCssReactImplicits {
  case class Props(style: AvatarsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Image avatars")(
          MuiGrid(justify = MuiGrid.Justify.center, alignItems = MuiGrid.AlignItems.center, container = true)(
            MuiAvatar()(css.avatar, alt := "Remy Sharp", src := "/static/images/avatar/1.jpg"),
            MuiAvatar()(css.bigAvatar, alt := "Remy Sharp", src := "/static/images/avatar/1.jpg")
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("ImageAvatars")
    .renderBackend[Backend]
    .build

  def apply(style: AvatarsStyle = DefaultAvatarsStyle) = component(Props(style))
}
