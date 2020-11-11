package io.kinoplan.demo.components.demos.Menus

import scala.scalajs.js.JSConverters._

import cats.syntax.option._
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Menus.{DefaultListItemCompositionStyle, ListItemCompositionStyle}
import io.kinoplan.demo.utils.Helpers.styleAToClassName
import io.kinoplan.scalajs.react.material.ui.core.{MuiListItemIcon, MuiListItemText, MuiMenuItem, MuiMenuList, MuiPaper}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object ListItemComposition extends ScalaCssReactImplicits {
  case class Props(style: ListItemCompositionStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      val textClasses = Map(
        MuiListItemText.ClassKey.primary -> styleAToClassName(css.primary)
      ).some.orUndefined

      div(
        ComponentContainer("Customized MenuItem")(
          div(
            MuiPaper()(
              MuiMenuList()(
                MuiMenuItem()(css.menuItem,
                  MuiListItemIcon()(css.icon,
                    MuiIcons(MuiIconsModule.Send)()
                  ),
                  MuiListItemText(classes = textClasses, inset = true, primary = VdomNode("Sent mail"))
                ),
                MuiMenuItem()(css.menuItem,
                  MuiListItemIcon()(css.icon,
                    MuiIcons(MuiIconsModule.Drafts)()
                  ),
                  MuiListItemText(classes = textClasses, inset = true, primary = VdomNode("Drafts"))
                ),
                MuiMenuItem()(css.menuItem,
                  MuiListItemIcon()(css.icon,
                    MuiIcons(MuiIconsModule.Inbox)()
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
