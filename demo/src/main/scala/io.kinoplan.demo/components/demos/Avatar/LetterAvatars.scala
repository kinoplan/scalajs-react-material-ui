package io.kinoplan.demo.components.demos.Avatar

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.{AvatarsStyle, DefaultAvatarsStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiAvatar, MuiGrid}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReact._

object LetterAvatars {
  case class Props(style: AvatarsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Letter avatars")(
          MuiGrid(justify = MuiGrid.Justify.center, alignItems = MuiGrid.AlignItems.center, container = true)(
            MuiAvatar()(css.avatar, "H"),
            MuiAvatar()(css.orangeAvatar, "N"),
            MuiAvatar()(css.purpleAvatar, "OP")
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("LetterAvatars")
    .renderBackend[Backend]
    .build

  def apply(style: AvatarsStyle = DefaultAvatarsStyle) = component(Props(style))
}
