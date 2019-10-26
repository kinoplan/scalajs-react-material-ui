package io.kinoplan.demo.components.demos.BottomNavigation

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.BottomNavigation.{BottomNavigationStyle, DefaultBottomNavigationStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiBottomNavigation, MuiBottomNavigationAction, MuiIcon}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiFavoriteIcon, MuiLocationOnIcon, MuiRestoreIcon}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import scalacss.ScalaCssReactImplicits

import scala.scalajs.js

object LabelBottomNavigation extends ScalaCssReactImplicits {
  case class Props(style: BottomNavigationStyle)

  case class State(value: js.Any = "recents") {
    def handleChange(value: js.Any) = copy(value = value)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChange: (ReactEvent, js.Any) => Callback = (_, value) => {
      t.modState(_.handleChange(value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Bottom Navigation with no label")(
          div(
            MuiBottomNavigation(onChange = handleChange)(css.root,
              value := state.value,
              MuiBottomNavigationAction(label = VdomNode("Recents"), icon = MuiRestoreIcon()())(
                value := "recents"
              ),
              MuiBottomNavigationAction(label = VdomNode("Favorites"), icon = MuiFavoriteIcon()())(
                value := "favorites"
              ),
              MuiBottomNavigationAction(label = VdomNode("Nearby"), icon = MuiLocationOnIcon()())(
                value := "nearby"
              ),
              MuiBottomNavigationAction(label = VdomNode("Folder"), icon = MuiIcon()("folder"))(
                value := "folder"
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("LabelBottomNavigation")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: BottomNavigationStyle = DefaultBottomNavigationStyle) = component(Props(style))
}
