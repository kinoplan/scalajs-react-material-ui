package io.kinoplan.demo.modules

import io.kinoplan.demo.components.Layout
import io.kinoplan.demo.models.MenuItem
import io.kinoplan.demo.router.AppRouter.Page
import io.kinoplan.scalajs.react.material.ui.core.{MuiCollapse, MuiDivider, MuiList, MuiListItem, MuiListItemIcon, MuiListItemText, MuiListSubheader, colors}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiExpandLessIcon, MuiExpandMoreIcon, MuiInboxIcon}
import japgolly.scalajs.react.extra.router.{Resolution, RouterCtl}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.vdom.{Attr, VdomArray, VdomNode}
import japgolly.scalajs.react.{BackendScope, ScalaComponent}

object MainMenu {
  case class Props(router: RouterCtl[Page], r: Resolution[Page])

  case class State(open: Boolean = false) {
    def handleDemoListClick = copy(open = !open)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleDemoListClick = t.modState(_.handleDemoListClick)

    def render(props: Props, state: State): VdomArray = {
      val iconColor = if (Layout.isPaletteLight) "rgba(0, 0, 0, 0.54)" else colors.common.white

      val demoExpandIcon = if (state.open) MuiExpandLessIcon()(color := iconColor) else MuiExpandMoreIcon()(color := iconColor)

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
                MuiListItemText(primary = Some(VdomNode(item.label)))()
              )
            },
            MuiListItem(button = true)(onClick --> handleDemoListClick, Attr("key") := 5,
              MuiListItemIcon()(
                MuiInboxIcon()
              ),
              MuiListItemText(inset = true, primary = Some(VdomNode("Component Demos")))(),
              demoExpandIcon
            ),
            MuiCollapse(in = Some(state.open), timeout = Some(MuiCollapse.Timeout.auto))(Attr("key") := 6,
              DemoMenu(props.router, props.r)
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
                MuiListItemText(primary = Some(VdomNode(item.label)))()
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
