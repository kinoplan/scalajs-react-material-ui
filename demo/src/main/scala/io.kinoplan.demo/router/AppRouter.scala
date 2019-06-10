package io.kinoplan.demo.router

import io.kinoplan.demo.components.Layout
import io.kinoplan.demo.pages.SimpleTablePage
import io.kinoplan.demo.pages.demos._
import japgolly.scalajs.react.extra.router._

object AppRouter {
  sealed trait Page
  case object DashboardRoute extends Page
  case object DemoAppBarRoute extends Page
  case object DemoAvatarsRoute extends Page
  case object DemoBadgesRoute extends Page
  case object DemoBottomNavigationRoute extends Page
  case object DemoButtonsRoute extends Page

  val routerConfig = RouterConfigDsl[Page].buildConfig { dsl =>
    import dsl._

    (
      staticRoute("/", DashboardRoute) ~> renderR(SimpleTablePage(_))
      | staticRoute("/#demos/app-bar/", DemoAppBarRoute) ~> renderR(AppBarPage(_))
      | staticRoute("/#demos/avatars/", DemoAvatarsRoute) ~> renderR(AvatarsPage(_))
      | staticRoute("/#demos/badges/", DemoBadgesRoute) ~> renderR(BadgesPage(_))
      | staticRoute("/#demos/bottom-navigation/", DemoBottomNavigationRoute) ~> renderR(BottomNavigationPage(_))
      | staticRoute("/#demos/buttons/", DemoButtonsRoute) ~> renderR(ButtonsPage(_))
    ).notFound(redirectToPage(DashboardRoute)(Redirect.Replace))
  }.renderWith(layout)


  def layout(c: RouterCtl[Page], r: Resolution[Page]) = Layout(c, r)

  val baseUrl = BaseUrl.fromWindowOrigin

  val router = Router(baseUrl, routerConfig)
}
