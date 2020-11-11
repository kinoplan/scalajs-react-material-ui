package io.kinoplan.demo.components.demos.Lists

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout}
import io.kinoplan.demo.styles.demos.Lists.{DefaultListStyle, ListStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiCollapse, MuiList, MuiListItem, MuiListItemIcon, MuiListItemText, MuiListSubheader}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object NestedList extends ScalaCssReactImplicits {
  case class Props(style: ListStyle)

  case class State(open: Boolean = true) {
    def handleClick = copy(open = !open)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleClick = t.modState(_.handleClick)

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Nested List")(
          div(css.root, css.rootPaper(Layout.isPaletteLight),
            MuiList(
              component = "nav",
              subheader = MuiListSubheader(component = "div")("Nested List Items")
            )(
              MuiListItem(button = true)(
                MuiListItemIcon()(
                  MuiIcons(MuiIconsModule.Send)()
                ),
                MuiListItemText(inset = true, primary = VdomNode("Sent mail"))
              ),
              MuiListItem(button = true)(
                MuiListItemIcon()(
                  MuiIcons(MuiIconsModule.Drafts)()
                ),
                MuiListItemText(inset = true, primary = VdomNode("Drafts"))
              ),
              MuiListItem(button = true)(onClick --> handleClick,
                MuiListItemIcon()(
                  MuiIcons(MuiIconsModule.Inbox)()
                ),
                MuiListItemText(inset = true, primary = VdomNode("Inbox")),
                if (state.open) MuiIcons(MuiIconsModule.ExpandLess)() else MuiIcons(MuiIconsModule.ExpandMore)()
              ),
              MuiCollapse(in = state.open, timeout = MuiCollapse.Timeout.auto, unmountOnExit = true)(
                MuiList(component = "div", disablePadding = true)(onClick --> handleClick,
                  MuiListItem(button = true)(css.nested,
                    MuiListItemIcon()(
                      MuiIcons(MuiIconsModule.StarBorder)()
                    ),
                    MuiListItemText(inset = true, primary = VdomNode("Starred"))
                  )
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("NestedList")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: ListStyle = DefaultListStyle) = component(Props(style))
}
