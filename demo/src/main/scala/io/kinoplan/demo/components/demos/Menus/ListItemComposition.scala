package io.kinoplan.demo.components.demos.Menus

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Menus.{DefaultListItemCompositionStyle, ListItemCompositionStyle}
import io.kinoplan.demo.utils.Helpers.styleAToClassName
import io.kinoplan.scalajs.react.material.ui.core.{MuiListItemIcon, MuiListItemText, MuiMenuItem, MuiMenuList, MuiPaper}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiDraftsIcon, MuiInboxIcon, MuiSendIcon}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReactImplicits

object ListItemComposition extends ScalaCssReactImplicits {
  case class Props(style: ListItemCompositionStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      val textClasses = Map(
        MuiListItemText.ClassKey.primary -> styleAToClassName(css.primary)
      )

      div(
        ComponentContainer("Customized MenuItem")(
          div(
            MuiPaper()(
              MuiMenuList()(
                MuiMenuItem()(css.menuItem,
                  MuiListItemIcon()(css.icon,
                    MuiSendIcon()
                  ),
                  MuiListItemText(classes = textClasses, inset = true, primary = VdomNode("Sent mail"))
                ),
                MuiMenuItem()(css.menuItem,
                  MuiListItemIcon()(css.icon,
                    MuiDraftsIcon()
                  ),
                  MuiListItemText(classes = textClasses, inset = true, primary = VdomNode("Drafts"))
                ),
                MuiMenuItem()(css.menuItem,
                  MuiListItemIcon()(css.icon,
                    MuiInboxIcon()
                  ),
                  MuiListItemText(classes = textClasses, inset = true, primary = VdomNode("Inbox"))
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("ListItemComposition")
    .renderBackend[Backend]
    .build

  def apply(style: ListItemCompositionStyle = DefaultListItemCompositionStyle) = component(Props(style))
}
