package io.kinoplan.demo.components.demos.Lists

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Lists.{DefaultListStyle, ListStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiDivider, MuiList, MuiListItem, MuiListItemIcon, MuiListItemText}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiDraftsIcon, MuiInboxIcon}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReactImplicits

object SimpleList extends ScalaCssReactImplicits {
  case class Props(style: ListStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Simple List")(
          div(css.root,
            MuiList(component = "nav")(
              MuiListItem(button = true)(
                MuiListItemIcon()(
                  MuiInboxIcon()
                ),
                MuiListItemText(primary = Some("Inbox"))
              ),
              MuiListItem(button = true)(
                MuiListItemIcon()(
                  MuiDraftsIcon()
                ),
                MuiListItemText(primary = Some("Drafts"))
              ),
              MuiDivider(),
              MuiList(component = "nav")(
                MuiListItem(button = true)(
                  MuiListItemText(primary = Some("Trash"))
                ),
                MuiListItem(component = "a", button = true)(href := "#simple-list",
                  MuiListItemText(primary = Some("Spam"))
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SimpleList")
    .renderBackend[Backend]
    .build

  def apply(style: ListStyle = DefaultListStyle) = component(Props(style))
}
