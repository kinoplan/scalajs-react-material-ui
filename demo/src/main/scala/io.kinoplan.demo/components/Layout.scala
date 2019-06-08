package io.kinoplan.demo.components

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.modules.MainMenu
import io.kinoplan.demo.router.AppRouter.Page
import io.kinoplan.demo.styles.{DefaultLayoutStyle, LayoutStyle}
import io.kinoplan.demo.utils.Helpers._
import io.kinoplan.demo.utils.icons.{MuiLightBulbFullIcon, MuiLightBulbOutlineIcon}
import io.kinoplan.scalajs.react.material.ui.core.styles._
import io.kinoplan.scalajs.react.material.ui.core.{MuiAppBar, MuiBadge, MuiCssBaseline, MuiDrawer, MuiIconButton, MuiToolbar, MuiTooltip, MuiTypography, colors}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiChevronLeftIcon, MuiMenuIcon, MuiNotificationsIcon}
import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.{Resolution, RouterCtl}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReact._

object Layout {
  case class Props(router: RouterCtl[Page], r: Resolution[Page], style: LayoutStyle)

  case class State(
    open: Boolean = true,
    paletteType: PaletteType.Value = PaletteType.light
  ) {
    val isLightPaletteType = paletteType == PaletteType.light

    def handleDrawerOpen = copy(open = true)
    def handleDrawerClose = copy(open = false)

    def handlePaletteTypeChange = copy(
      paletteType = if (paletteType == PaletteType.light) PaletteType.dark else PaletteType.light
    )
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleDrawerOpen = t.modState(_.handleDrawerOpen)

    def handleDrawerClose = t.modState(_.handleDrawerClose)

    def handlePaletteTypeChange = t.modState(_.handlePaletteTypeChange)

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val theme = createMuiTheme(options = ThemeOptions(
        typography = Some(TypographyOptions(
          useNextVariants = Some(true),
          suppressDeprecationWarnings = Some(true)
        )),
        palette = Some(PaletteOptions(
          `type` = Some(state.paletteType),
          primary = Some(colors.blue)
        ))
      ))

      val drawerClasses = Map(
        MuiDrawer.ClassKey.paper -> stylesToClassName(
          Seq(css.drawerPaper, if (!state.open) css.drawerPaperClose else css.common.emptyStyle)
        )
      )

      val appBarShift = if (state.open) css.appBarShift else css.common.emptyStyle

      val menuButtonHidden = if (state.open) css.menuButtonHidden else css.common.emptyStyle

      div(css.root,
        MuiThemeProvider(theme = theme)(
          MuiCssBaseline(),
          MuiAppBar(position = MuiAppBar.Position.absolute, color = MuiAppBar.Color.primary)(css.appBar + appBarShift,
            MuiToolbar(disableGutters = !state.open)(css.toolbar,
              MuiIconButton(color = MuiIconButton.Color.inherit)(css.menuButton + menuButtonHidden,
                aria.label := "Open drawer",
                onClick --> handleDrawerOpen,
                MuiMenuIcon()
              ),
              MuiTypography(
                component = Some("h1"),
                variant = MuiTypography.Variant.h6,
                color = MuiTypography.Color.inherit,
                noWrap = true
              )(css.common.flexGrowOne,
                "Dashboard"
              ),
              MuiTooltip(title = VdomNode("Toggle light/dark theme"), enterDelay = 300)(
                MuiIconButton(color = MuiIconButton.Color.inherit)(
                  aria.label := "Toggle light/dark theme",
                  Attr("data-ga-event-category") := "AppBar",
                  Attr("data-ga-event-action") := "dark",
                  onClick --> handlePaletteTypeChange,
                  if (state.isLightPaletteType) MuiLightBulbOutlineIcon() else MuiLightBulbFullIcon()
                )
              ),
              MuiIconButton(color = MuiIconButton.Color.inherit)(
                MuiBadge(badgeContent = Some(VdomNode(4)), color = MuiBadge.Color.secondary)(
                  MuiNotificationsIcon()
                )
              )
            )
          ),
          MuiDrawer(variant = MuiDrawer.Variant.permanent, open = state.open, classes = drawerClasses)(
            div(css.toolbarIcon,
              MuiIconButton()(onClick --> handleDrawerClose,
                MuiChevronLeftIcon()
              )
            ),
            MainMenu(props.router, props.r)
          ),
          main(css.content,
            div(css.appBarSpacer),
            props.r.render()
          )
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
