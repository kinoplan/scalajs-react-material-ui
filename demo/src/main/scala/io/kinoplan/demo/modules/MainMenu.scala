package io.kinoplan.demo.modules

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.extra.router.{Resolution, RouterCtl}
import japgolly.scalajs.react.vdom.{Attr, VdomArray, VdomNode}
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.demo.components.Layout
import io.kinoplan.demo.models.{ChildMenuItem, MenuItem}
import io.kinoplan.demo.router.AppRouter.Page
import io.kinoplan.scalajs.react.material.ui.core.{MuiCollapse, MuiDivider, MuiList, MuiListItem, MuiListItemIcon, MuiListItemText, MuiListSubheader, colors}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object MainMenu {
  case class Props(router: RouterCtl[Page], r: Resolution[Page])

  case class State(demoOpen: Boolean = false, labOpen: Boolean = false) {
    def handleDemoListClick = copy(demoOpen = !demoOpen)

    def handleLabListClick = copy(labOpen = !labOpen)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleDemoListClick = t.modState(_.handleDemoListClick)

    def handleLabListClick = t.modState(_.handleLabListClick)

    def render(props: Props, state: State): VdomArray = {
      val iconColor = if (Layout.isPaletteLight) "rgba(0, 0, 0, 0.54)" else colors.common.white

      val demoExpandIcon = if (state.demoOpen) {
        MuiIcons(MuiIconsModule.ExpandLess)()(color := iconColor)
      } else {
        MuiIcons(MuiIconsModule.ExpandMore)()(color := iconColor)
      }

      val labExpandIcon = if (state.labOpen) {
        MuiIcons(MuiIconsModule.ExpandLess)()(color := iconColor)
      } else {
        MuiIcons(MuiIconsModule.ExpandMore)()(color := iconColor)
      }

      VdomArray(
        MuiDivider()(Attr("key") := 1),
        MuiList()(Attr("key") := 2,
          div(
            MenuItem.menuItemsFirst.zipWithIndex.toVdomArray { case (item, index) =>
              MuiListItem(button = true)(
                Attr("key") := index,
                href := props.router.urlFor(item.location).value,
                props.router.setOnLinkClick(item.location)
              )(
                MuiListItemIcon()(
                  item.icon
                ),
                MuiListItemText(primary = VdomNode(item.label))()
              )
            },
            MuiListItem(button = true)(onClick --> handleDemoListClick, Attr("key") := 5,
              MuiListItemIcon()(
                MuiIcons(MuiIconsModule.Inbox)()
              ),
              MuiListItemText(inset = true, primary = VdomNode("Component Demos"))(),
              demoExpandIcon
            ),
            MuiCollapse(in = state.demoOpen, timeout = MuiCollapse.Timeout.auto)(Attr("key") := 6,
              ChildMenu(props.router, props.r, ChildMenuItem.demos)
            ),
            MuiListItem(button = true)(onClick --> handleLabListClick, Attr("key") := 7,
              MuiListItemIcon()(
                MuiIcons(MuiIconsModule.LocalBar)()
              ),
              MuiListItemText(inset = true, primary = VdomNode("Lab"))(),
              labExpandIcon
            ),
            MuiCollapse(in = state.labOpen, timeout = MuiCollapse.Timeout.auto)(Attr("key") := 8,
              ChildMenu(props.router, props.r, ChildMenuItem.labs)
            )
          )
        ),
        MuiDivider()(Attr("key") := 3),
        MuiList()(Attr("key") := 4,
          div(
            MuiListSubheader(inset = true)("Saved reports"),
            MenuItem.menuItemsSecond.zipWithIndex.toVdomArray { case (item, index) =>
              MuiListItem(button = true)(
                Attr("key") := index,
                href := props.router.urlFor(item.location).value,
                props.router.setOnLinkClick(item.location)
              )(
                MuiListItemIcon()(
                  item.icon()
                ),
                MuiListItemText(primary = VdomNode(item.label))()
              )
            }
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("MainMenu")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page], r: Resolution[Page]) = component(Props(router, r))
}
