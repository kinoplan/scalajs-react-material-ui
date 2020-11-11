package io.kinoplan.demo.components.demos.Drawers

import japgolly.scalajs.react.{BackendScope, Callback, ReactEventFromHtml, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Drawers.{DefaultDrawersStyle, DrawersStyle}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object TemporaryDrawer extends ScalaCssReactImplicits {
  case class Props(style: DrawersStyle)

  case class State(
    top: Boolean = false,
    left: Boolean = false,
    bottom: Boolean = false,
    right: Boolean = false
  ) {
    def toggleDrawerTop(value: Boolean) = copy(top = value)

    def toggleDrawerLeft(value: Boolean) = copy(left = value)

    def toggleDrawerBottom(value: Boolean) = copy(bottom = value)

    def toggleDrawerRight(value: Boolean) = copy(right = value)
  }

  class Backend(t: BackendScope[Props, State]) {
    def toggleDrawerTop(value: Boolean): ReactEventFromHtml => Callback = _ => {
      t.modState(_.toggleDrawerTop(value))
    }

    def toggleDrawerLeft(value: Boolean): ReactEventFromHtml => Callback = _ => {
      t.modState(_.toggleDrawerLeft(value))
    }

    def toggleDrawerBottom(value: Boolean): ReactEventFromHtml => Callback = _ => {
      t.modState(_.toggleDrawerBottom(value))
    }

    def toggleDrawerRight(value: Boolean): ReactEventFromHtml => Callback = _ => {
      t.modState(_.toggleDrawerRight(value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val sideList = {
        div()(css.list,
          MuiList()(
            List("Inbox", "Starred", "Send email", "Drafts").zipWithIndex.toVdomArray { case (text, index) =>
              MuiListItem(button = true)(Attr("key") := text,
                MuiListItemIcon()(if (index % 2 == 0) MuiIcons(MuiIconsModule.Inbox)() else MuiIcons(MuiIconsModule.Mail)()),
                MuiListItemText(primary = VdomNode(text))
              )
            }
          ),
          MuiDivider(),
          MuiList()(
            List("All mail", "Trash", "Spam").zipWithIndex.toVdomArray { case (text, index) =>
              MuiListItem(button = true)(Attr("key") := text,
                MuiListItemIcon()(if (index % 2 == 0) MuiIcons(MuiIconsModule.Inbox)() else MuiIcons(MuiIconsModule.Mail)()),
                MuiListItemText(primary = VdomNode(text))
              )
            }
          )
        )
      }

      val fullList = {
        div()(css.fullList,
          MuiList()(
            List("Inbox", "Starred", "Send email", "Drafts").zipWithIndex.toVdomArray { case (text, index) =>
              MuiListItem(button = true)(Attr("key") := text,
                MuiListItemIcon()(if (index % 2 == 0) MuiIcons(MuiIconsModule.Inbox)() else MuiIcons(MuiIconsModule.Mail)()),
                MuiListItemText(primary = VdomNode(text))
              )
            }
          ),
          MuiDivider(),
          MuiList()(
            List("All mail", "Trash", "Spam").zipWithIndex.toVdomArray { case (text, index) =>
              MuiListItem(button = true)(Attr("key") := text,
                MuiListItemIcon()(if (index % 2 == 0) MuiIcons(MuiIconsModule.Inbox)() else MuiIcons(MuiIconsModule.Mail)()),
                MuiListItemText(primary = VdomNode(text))
              )
            }
          )
        )
      }

      div(
        ComponentContainer("Temporary drawer")(
          div(
            MuiButton()(onClick ==> toggleDrawerLeft(true), "Open Left"),
            MuiButton()(onClick ==> toggleDrawerRight(true), "Open Right"),
            MuiButton()(onClick ==> toggleDrawerTop(true), "Open Top"),
            MuiButton()(onClick ==> toggleDrawerBottom(true), "Open Bottom"),
            MuiDrawer(open = state.left, onClose = toggleDrawerLeft(false))(
              div(
                tabIndex := 0,
                role := "button",
                onClick ==> toggleDrawerLeft(false),
                onKeyDown ==> toggleDrawerLeft(false),
                sideList
              )
            ),
            MuiDrawer(anchor = MuiDrawer.Anchor.top, open = state.top, onClose = toggleDrawerTop(false))(
              div(
                tabIndex := 0,
                role := "button",
                onClick ==> toggleDrawerTop(false),
                onKeyDown ==> toggleDrawerTop(false),
                fullList
              )
            ),
            MuiDrawer(anchor = MuiDrawer.Anchor.bottom, open = state.bottom, onClose = toggleDrawerBottom(false))(
              div(
                tabIndex := 0,
                role := "button",
                onClick ==> toggleDrawerBottom(false),
                onKeyDown ==> toggleDrawerBottom(false),
                fullList
              )
            ),
            MuiDrawer(anchor = MuiDrawer.Anchor.right, open = state.right, onClose = toggleDrawerRight(false))(
              div(
                tabIndex := 0,
                role := "button",
                onClick ==> toggleDrawerRight(false),
                onKeyDown ==> toggleDrawerRight(false),
                sideList
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("TemporaryDrawer")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: DrawersStyle = DefaultDrawersStyle) = component(Props(style))
}
