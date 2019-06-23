package io.kinoplan.demo.components.demos.Lists

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Lists.{DefaultListStyle, ListStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiCollapse, MuiList, MuiListItem, MuiListItemIcon, MuiListItemText, MuiListSubheader}
import io.kinoplan.scalajs.react.material.ui.icons._
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReactImplicits

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
          div(css.root,
            MuiList(
              component = "nav",
              subheader = Some(
                MuiListSubheader(component = "div")("Nested List Items")
              )
            )(
              MuiListItem(button = true)(
                MuiListItemIcon()(
                  MuiSendIcon()
                ),
                MuiListItemText(inset = true, primary = Some("Sent mail"))
              ),
              MuiListItem(button = true)(
                MuiListItemIcon()(
                  MuiDraftsIcon()
                ),
                MuiListItemText(inset = true, primary = Some("Drafts"))
              ),
              MuiListItem(button = true)(onClick --> handleClick,
                MuiListItemIcon()(
                  MuiInboxIcon()
                ),
                MuiListItemText(inset = true, primary = Some("Inbox")),
                if (state.open) MuiExpandLessIcon() else MuiExpandMoreIcon()
              ),
              MuiCollapse(in = Some(state.open), timeout = Some(MuiCollapse.Timeout.auto), unmountOnExit = Some(true))(
                MuiList(component = "div", disablePadding = true)(onClick --> handleClick,
                  MuiListItem(button = true)(css.nested,
                    MuiListItemIcon()(
                      MuiStarBorderIcon()
                    ),
                    MuiListItemText(inset = true, primary = Some("Starred"))
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
