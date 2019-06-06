package io.kinoplan.demo.pages.demos

import io.kinoplan.demo.components.demos.AppBar.{BottomAppBar, ButtonAppBar, DenseAppBar, MenuAppBar, PrimarySearchAppBar, SearchAppBar, SimpleAppBar}
import io.kinoplan.demo.router.AppRouter.Page
import io.kinoplan.scalajs.react.material.ui.core.styles.{MuiThemeProvider, ThemeOptions, TypographyOptions, createMuiTheme}
import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.all._

object AppBarPage {
  case class Props(router: RouterCtl[Page])

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val theme = createMuiTheme(options = ThemeOptions(typography = Some(TypographyOptions(useNextVariants = Some(true)))))
      div(
        MuiThemeProvider(theme = theme)(
          ButtonAppBar(),
          SimpleAppBar(),
          PrimarySearchAppBar(),
          MenuAppBar(),
          SearchAppBar(),
          DenseAppBar(),
          BottomAppBar()
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("AppBarPage")
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page]) = component(Props(router))
}
