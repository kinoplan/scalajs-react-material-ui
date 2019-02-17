package io.kinoplan.demo.pages

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.router.AppRouter.Page
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.core.icons.SvgIcons
import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.all._

object TypographyPage extends StyleSheet.Inline {
  case class Props(router: RouterCtl[Page])

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props) = {
      div(
        div(
          AppBar()(
            div(
              Badge(badgeContent = Some("4"), color = Badge.Color.error)(
                Avatar(src = Some("http://www.luljettas.com/images/avatar/img-6.jpg"))
              )
            ),
            BottomNavigation(showLabels = true)(
              BottomNavigationAction()(label("Recents"), icon := SvgIcons.RestoreIcon()().rawElement),
              BottomNavigationAction()(label("Favorites"), icon := SvgIcons.FavoriteIcon()().rawElement),
              BottomNavigationAction()(label("Nearby"), icon := SvgIcons.LocationOnIcon()().rawElement)
            )
          )
        ),
        div(
          Backdrop(open = false)
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("TypographyPage")
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page]) = component(Props(router))
}