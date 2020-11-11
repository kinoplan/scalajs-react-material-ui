package io.kinoplan.demo.components.demos.Drawers

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Drawers.{DefaultMiniDrawerStyle, MiniDrawerStyle}
import io.kinoplan.demo.utils.Helpers.stylesToClassName
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.core.styles.Direction
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object MiniDrawer extends ScalaCssReactImplicits {
  case class Props(style: MiniDrawerStyle)

  case class State(open: Boolean = false) {
    def handleDrawerOpen = copy(open = true)

    def handleDrawerClose = copy(open = false)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleDrawerOpen = t.modState(_.handleDrawerOpen)

    def handleDrawerClose = t.modState(_.handleDrawerClose)

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val drawerClasses = Map(
        MuiDrawer.ClassKey.paper -> stylesToClassName(Seq(
          if (state.open) css.drawerOpen else css.common.emptyStyle,
          if (!state.open) css.drawerClose else css.common.emptyStyle
        ))
      )

      val drawer = {
        div(
          div(css.toolbar,
            MuiIconButton()(
              onClick --> handleDrawerClose,
              if (css.theme.direction == Direction.ltr) {
                MuiIcons(MuiIconsModule.ChevronLeft)()
              } else {
                MuiIcons(MuiIconsModule.ChevronRight)()
              }
            )
          ),
          MuiDivider(),
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
        ComponentContainer("Mini variant drawer")(
          div(css.root,
            MuiCssBaseline(),
            MuiAppBar(position = MuiAppBar.Position.absolute)(css.appBar, if (state.open) css.appBarShift else css.common.emptyStyle,
              MuiToolbar(disableGutters = !state.open)(
                MuiIconButton(color = MuiIconButton.Color.inherit)(css.menuButton, if (state.open) css.hide else css.common.emptyStyle,
                  aria.label := "Open drawer",
                  onClick --> handleDrawerOpen,
                  MuiIcons(MuiIconsModule.Menu)()
                ),
                MuiTypography(variant = MuiTypography.Variant.h6, color = MuiTypography.Color.inherit, noWrap = true)(
                  "Mini variant drawer"
                )
              )
            ),
            MuiDrawer(
              variant = MuiDrawer.Variant.permanent,
              open = state.open,
              classes = drawerClasses
            )(css.drawer,
              if (state.open) css.drawerOpen else css.common.emptyStyle,
              if (!state.open) css.drawerClose else css.common.emptyStyle,
              drawer
            ),
            main(css.content,
              div(css.toolbar),
              MuiTypography(paragraph = true)(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
                  "incididunt ut labore et dolore magna aliqua. Rhoncus dolor purus non enim praesent " +
                  "elementum facilisis leo vel. Risus at ultrices mi tempus imperdiet. Semper risus in " +
                  "hendrerit gravida rutrum quisque non tellus. Convallis convallis tellus id interdum " +
                  "velit laoreet id donec ultrices. Odio morbi quis commodo odio aenean sed adipiscing. " +
                  "Amet nisl suscipit adipiscing bibendum est ultricies integer quis. Cursus euismod quis " +
                  "viverra nibh cras. Metus vulputate eu scelerisque felis imperdiet proin fermentum leo. " +
                  "Mauris commodo quis imperdiet massa tincidunt. Cras tincidunt lobortis feugiat vivamus " +
                  "at augue. At augue eget arcu dictum varius duis at consectetur lorem. Velit sed " +
                  "ullamcorper morbi tincidunt. Lorem donec massa sapien faucibus et molestie ac."
              ),
              MuiTypography(paragraph = true)(
                "Consequat mauris nunc congue nisi vitae suscipit. Fringilla est ullamcorper eget nulla " +
                  "facilisi etiam dignissim diam. Pulvinar elementum integer enim neque volutpat ac " +
                  "tincidunt. Ornare suspendisse sed nisi lacus sed viverra tellus. Purus sit amet volutpat " +
                  "consequat mauris. Elementum eu facilisis sed odio morbi. Euismod lacinia at quis risus " +
                  "sed vulputate odio. Morbi tincidunt ornare massa eget egestas purus viverra accumsan in. " +
                  "In hendrerit gravida rutrum quisque non tellus orci ac. Pellentesque nec nam aliquam sem " +
                  "et tortor. Habitant morbi tristique senectus et. Adipiscing elit duis tristique " +
                  "sollicitudin nibh sit. Ornare aenean euismod elementum nisi quis eleifend. Commodo " +
                  "viverra maecenas accumsan lacus vel facilisis. Nulla posuere sollicitudin aliquam " +
                  "ultrices sagittis orci a."
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("MiniDrawer")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: MiniDrawerStyle = DefaultMiniDrawerStyle) = component(Props(style))
}
