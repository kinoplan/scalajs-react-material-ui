package io.kinoplan.demo.components

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.router.AppRouter.Page
import io.kinoplan.demo.utils.Helpers._
import io.kinoplan.scalajs.react.material.ui.core.styles.{Breakpoints, Theme, Transition}
import io.kinoplan.scalajs.react.material.ui.core.{AppBar, Badge, CssBaseline, Divider, Drawer, IconButton, ListItem, ListItemIcon, ListItemText, ListSubheader, MaterialList, Toolbar, Typography}
import io.kinoplan.scalajs.react.material.ui.icons._
import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.{Resolution, RouterCtl}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReact._

object Layout extends StyleSheet.Inline {
  class LayoutStyle(theme: Theme = Theme.defaultTheme) extends StyleSheet.Inline {
    import dsl._

    private val drawerWidth = 240

    private val appBarTransition = theme.transitions.create(
      animatedProps = List("width", "margin"),
      easingValue = Transition.easing.sharp,
      durationValue = Transition.duration.leavingScreen
    )

    private val appBarShiftTransition = theme.transitions.create(
      animatedProps = List("width", "margin"),
      easingValue = Transition.easing.sharp,
      durationValue = Transition.duration.enteringScreen
    )

    private val drawerPaperTransition = theme.transitions.create(
      animatedProps = List("width"),
      easingValue = Transition.easing.sharp,
      durationValue = Transition.duration.enteringScreen
    )

    private val drawerPaperCloseTransition = theme.transitions.create(
      animatedProps = List("width"),
      easingValue = Transition.easing.sharp,
      durationValue = Transition.duration.leavingScreen
    )

    val emptyStyle = style()

    val root = style(
      display.flex
    )

    val toolbarCustom = style(
      minHeight(56.px),
      media.minWidth(Breakpoints.xs.id.px).landscape(
        minHeight(48.px)
      ),
      media.minWidth(Breakpoints.sm.id.px)(
        minHeight(64.px)
      )
    )

    val toolbar = style(
      paddingRight(24.px)
    )

    val toolbarIcon = style(
      display.flex,
      alignItems.center,
      justifyContent.flexEnd,
      padding(0.px, 8.px),
      toolbarCustom
    )

    val appBar = style(
      zIndex :=! (theme.zIndex.drawer + 1).toString,
      transition := appBarTransition
    )

    val appBarShift = style(
      marginLeft(drawerWidth.px),
      width :=! s"calc(100% - ${drawerWidth}px)",
      transition := appBarShiftTransition
    )

    val menuButton = style(
      marginLeft(12.px),
      marginRight(36.px)
    )

    val menuButtonHidden = style(
      display.none
    )

    val title = style(
      flexGrow(1)
    )

    val drawerPaper = style(
      position.relative,
      whiteSpace.nowrap,
      width(drawerWidth.px),
      transition := drawerPaperTransition
    )

    val drawerPaperClose = style(
      overflowX.hidden,
      transition := drawerPaperCloseTransition,
      width(theme.spacing(7).px),
      theme.breakpoints.up(Breakpoints.sm)(
        width(theme.spacing(9).px)
      )
    )

    val appBarSpacer = toolbarCustom

    val content = style(
      flexGrow(1),
      padding(theme.spacing(3).px),
      height(100.vh),
      overflow.auto
    )
  }

  object DefaultLayoutStyle extends LayoutStyle

  case class Props(router: RouterCtl[Page], r: Resolution[Page], style: LayoutStyle)

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
        "paper" -> stylesToClassName(Seq(css.drawerPaper, if (!state.open) css.drawerPaperClose else css.emptyStyle))
      )

      div(css.root,
        CssBaseline(),
        AppBar(position = AppBar.Position.absolute, color = AppBar.Color.primary)(css.appBar + (if (state.open) css.appBarShift else css.emptyStyle),
          Toolbar(disableGutters = !state.open)(css.toolbar,
            IconButton(color = IconButton.Color.inherit)(css.menuButton + (if (state.open) css.menuButtonHidden else css.emptyStyle),
              aria.label := "Open drawer",
              onClick --> handleDrawerOpen,
              Menu()
            ),
            Typography(
              component = Some("h1"),
              variant = Typography.Variant.h6,
              color = Typography.Color.inherit,
              noWrap = true
            )(css.title,
              "Dashboard"
            ),
            IconButton(color = IconButton.Color.inherit)(
              Badge(badgeContent = Some(VdomNode(4)), color = Badge.Color.secondary)(
                Notifications()
              )
            )
          )
        ),
        Drawer(variant = Drawer.Variant.permanent, open = state.open, classes = drawerClasses)(
          div(css.toolbarIcon,
            IconButton()(onClick --> handleDrawerClose,
              ChevronLeft()
            )
          ),
          Divider(),
          MaterialList()(
            div(
              ListItem(button = true)(
                ListItemIcon()(
                  Dashboard()
                ),
                ListItemText(primary = Some(VdomNode("Dashboard")))()
              ),
              ListItem(button = true)(
                ListItemIcon()(
                  ShoppingCart()
                ),
                ListItemText(primary = Some(VdomNode("Orders")))()
              ),
              ListItem(button = true)(
                ListItemIcon()(
                  People()
                ),
                ListItemText(primary = Some(VdomNode("Customers")))()
              ),
              ListItem(button = true)(
                ListItemIcon()(
                  BarChart()
                ),
                ListItemText(primary = Some(VdomNode("Reports")))()
              ),
              ListItem(button = true)(
                ListItemIcon()(
                  Layers()
                ),
                ListItemText(primary = Some(VdomNode("Integrations")))()
              )
            )
          ),
          Divider(),
          MaterialList()(
            div(
              ListSubheader(inset = true)("Saved reports"),
              ListItem(button = true)(
                ListItemIcon()(
                  Assignment()
                ),
                ListItemText(primary = Some(VdomNode("Current month")))()
              ),
              ListItem(button = true)(
                ListItemIcon()(
                  Assignment()
                ),
                ListItemText(primary = Some(VdomNode("Last quarter")))()
              ),
              ListItem(button = true)(
                ListItemIcon()(
                  Assignment()
                ),
                ListItemText(primary = Some(VdomNode("Year-end sale")))()
              )
            )
          )
        ),
        main(css.content,
          div(css.appBarSpacer),
          props.r.render()
        )
      )
    }
  }

  val component = ScalaComponent.builder[Props]("Layout")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(
    router: RouterCtl[Page],
    r: Resolution[Page],
    style: LayoutStyle = DefaultLayoutStyle
  ) = component(Props(router, r, style))
}
