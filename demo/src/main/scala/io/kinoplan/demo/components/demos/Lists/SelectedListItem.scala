package io.kinoplan.demo.components.demos.Lists

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout}
import io.kinoplan.demo.styles.demos.Lists.{DefaultListStyle, ListStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiDivider, MuiList, MuiListItem, MuiListItemIcon, MuiListItemText}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object SelectedListItem extends ScalaCssReactImplicits {
  case class Props(style: ListStyle)

  case class State(selectedIndex: Int = 1) {
    def isSelectedIndex(value: Int) = selectedIndex == value

    def handleListItemClick(value: Int) = copy(selectedIndex = value)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleListItemClick(value: Int) = t.modState(_.handleListItemClick(value))

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Selected ListItem")(
          div(css.root, css.rootPaper(Layout.isPaletteLight),
            MuiList(component = "nav")(
              MuiListItem(button = true)(
                selected := state.isSelectedIndex(0),
                onClick --> handleListItemClick(0),
                MuiListItemIcon()(
                  MuiIcons(MuiIconsModule.Inbox)()
                ),
                MuiListItemText(primary = VdomNode("Inbox"))
              ),
              MuiListItem(button = true)(
                selected := state.isSelectedIndex(1),
                onClick --> handleListItemClick(1),
                MuiListItemIcon()(
                  MuiIcons(MuiIconsModule.Drafts)()
                ),
                MuiListItemText(primary = VdomNode("Drafts"))
              ),
              MuiDivider(),
              MuiList(component = "nav")(
                MuiListItem(button = true)(
                  selected := state.isSelectedIndex(2),
                  onClick --> handleListItemClick(2),
                  MuiListItemText(primary = VdomNode("Trash"))
                ),
                MuiListItem(button = true)(
                  selected := state.isSelectedIndex(3),
                  onClick --> handleListItemClick(3),
                  MuiListItemText(primary = VdomNode("Spam"))
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SelectedListItem")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: ListStyle = DefaultListStyle) = component(Props(style))
}

