package io.kinoplan.demo.components.demos.Drawers

import japgolly.scalajs.react.{BackendScope, Callback, ReactEventFromHtml, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Drawers.{DefaultResponsiveDrawerStyle, ResponsiveDrawerStyle}
import io.kinoplan.demo.utils.Helpers.styleAToClassName
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.core.styles.Direction
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object ResponsiveDrawer extends ScalaCssReactImplicits {
  case class Props(style: ResponsiveDrawerStyle)

  case class State(mobileOpen: Boolean = false) {
    def handleDrawerToggle = copy(mobileOpen = !mobileOpen)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleDrawerToggle: ReactEventFromHtml => Callback = _ => {
      t.modState(_.handleDrawerToggle)
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val drawerClasses = Map(
        MuiDrawer.ClassKey.paper -> styleAToClassName(css.drawerPaper)
      )

      val drawer = {
        div(
          div(css.toolbarCustom),
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
        ComponentContainer("Responsive drawer")(
          div(css.root,
            MuiCssBaseline(),
            MuiAppBar()(css.appBar,
              MuiToolbar()(
                MuiIconButton(color = MuiIconButton.Color.inherit)(css.menuButton,
                  aria.label := "Open drawer",
                  onClick ==> handleDrawerToggle,
                  MuiIcons(MuiIconsModule.Menu)()
                ),
                MuiTypography(variant = MuiTypography.Variant.h6, color = MuiTypography.Color.inherit, noWrap = true)(
                  "Responsive drawer"
                )
              )
            ),
            nav(css.drawer)(
              MuiHidden(smUp = true, implementation = MuiHidden.Implementation.css)(
                MuiDrawer(
                  variant = MuiDrawer.Variant.temporary,
                  anchor = if (css.theme.direction == Direction.rtl) MuiDrawer.Anchor.right else MuiDrawer.Anchor.left,
                  open = state.mobileOpen,
                  onClose = handleDrawerToggle,
                  classes = drawerClasses
                )(drawer)
              ),
              MuiHidden(xsDown = true, implementation = MuiHidden.Implementation.css)(
                MuiDrawer(
                  variant = MuiDrawer.Variant.permanent,
                  open = true,
                  classes = drawerClasses
                )(drawer)
              )
            ),
            main(css.content,
              div(css.toolbarCustom),
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

  private val component = ScalaComponent.builder[Props]("ResponsiveDrawer")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: ResponsiveDrawerStyle = DefaultResponsiveDrawerStyle) = component(Props(style))
}
