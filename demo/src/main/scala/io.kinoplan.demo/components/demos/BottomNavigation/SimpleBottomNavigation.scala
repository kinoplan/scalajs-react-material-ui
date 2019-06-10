package io.kinoplan.demo.components.demos.BottomNavigation

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.BottomNavigation.{BottomNavigationStyle, DefaultBottomNavigationStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiBottomNavigation, MuiBottomNavigationAction}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiFavoriteIcon, MuiLocationOnIcon, MuiRestoreIcon}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import scalacss.ScalaCssReact._

import scala.scalajs.js

object SimpleBottomNavigation {
  case class Props(style: BottomNavigationStyle)

  case class State(value: js.Any = 0) {
    def handleChange(value: js.Any) = copy(value = value)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChange: (ReactEvent, js.Any) => Callback = (_, value) => {
      t.modState(_.handleChange(value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Bottom Navigation")(
          div(
            MuiBottomNavigation(
              value = Some(state.value),
              showLabels = true,
              onChange = handleChange
            )(css.root,
              MuiBottomNavigationAction(label = Some(VdomNode("Recents")), icon = Some(MuiRestoreIcon())),
              MuiBottomNavigationAction(label = Some(VdomNode("Favorites")), icon = Some(MuiFavoriteIcon())),
              MuiBottomNavigationAction(label = Some(VdomNode("Nearby")), icon = Some(MuiLocationOnIcon()))
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SimpleBottomNavigation")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: BottomNavigationStyle = DefaultBottomNavigationStyle) = component(Props(style))
}
