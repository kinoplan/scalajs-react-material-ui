package io.kinoplan.demo.components.demos.Drawers

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Drawers.{DefaultPersistentDrawerStyle, PersistentDrawerStyle}
import io.kinoplan.demo.utils.Helpers.styleAToClassName
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.core.styles.Direction
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object PersistentDrawer extends ScalaCssReactImplicits {
  case class Props(style: PersistentDrawerStyle)

  case class State(open: Boolean = true) {
    def handleDrawerOpen = copy(open = true)

    def handleDrawerClose = copy(open = false)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleDrawerOpen = t.modState(_.handleDrawerOpen)

    def handleDrawerClose = t.modState(_.handleDrawerClose)

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val drawerClasses = Map(
        MuiDrawer.ClassKey.paper -> styleAToClassName(css.drawerPaper)
      )

      val drawer = {
        div(
          div(css.drawerHeader,
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
        ComponentContainer("Persistent drawer")(
          div(css.root,
            MuiCssBaseline(),
            MuiAppBar()(css.appBar,
              if (state.open) css.appBarShift else css.common.emptyStyle,
              if (state.open) css.appBarShiftLeft else css.common.emptyStyle,
              MuiToolbar(disableGutters = !state.open)(
                MuiIconButton(color = MuiIconButton.Color.inherit)(css.menuButton, if (state.open) css.hide else css.common.emptyStyle,
                  aria.label := "Open drawer",
                  onClick --> handleDrawerOpen,
                  MuiIcons(MuiIconsModule.Menu)()
                ),
                MuiTypography(variant = MuiTypography.Variant.h6, color = MuiTypography.Color.inherit, noWrap = true)(
                  "Persistent drawer"
                )
              )
            ),
            MuiDrawer(
              variant = MuiDrawer.Variant.persistent,
              anchor = MuiDrawer.Anchor.left,
              open = state.open,
              classes = drawerClasses
            )(drawer),
            main(css.content, css.contentLeft,
              if (state.open) css.contentShift else css.common.emptyStyle,
              if (state.open) css.contentShiftLeft else css.common.emptyStyle,
              div(css.drawerHeader),
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

  private val component = ScalaComponent.builder[Props]("PersistentDrawer")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: PersistentDrawerStyle = DefaultPersistentDrawerStyle) = component(Props(style))
}
