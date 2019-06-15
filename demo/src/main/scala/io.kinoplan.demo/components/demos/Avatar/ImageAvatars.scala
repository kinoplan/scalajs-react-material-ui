package io.kinoplan.demo.components.demos.Avatar

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Avatars.{AvatarsStyle, DefaultAvatarsStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiAvatar, MuiGrid}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReact._

object ImageAvatars {
  case class Props(style: AvatarsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Image avatars")(
          MuiGrid(justify = MuiGrid.Justify.center, alignItems = MuiGrid.AlignItems.center, container = true)(
            MuiAvatar(alt = Some("Remy Sharp"), src = Some("/static/images/avatar/1.jpg"))(css.avatar),
            MuiAvatar(alt = Some("Remy Sharp"), src = Some("/static/images/avatar/1.jpg"))(css.bigAvatar)
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