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
  case object DemoCardsRoute extends Page
  case object DemoChipsRoute extends Page
  case object DemoDialogsRoute extends Page
  case object DemoDividersRoute extends Page
  case object DemoDrawersRoute extends Page
  case object DemoExpansionPanelsRoute extends Page
  case object DemoGridListRoute extends Page
  case object DemoListsRoute extends Page

  val routerConfig = RouterConfigDsl[Page].buildConfig { dsl =>
    import dsl._

    (
      staticRoute("/", DashboardRoute) ~> renderR(SimpleTablePage(_))
      | staticRoute("/#demos/app-bar/", DemoAppBarRoute) ~> renderR(AppBarPage(_))
      | staticRoute("/#demos/avatars/", DemoAvatarsRoute) ~> renderR(AvatarsPage(_))
      | staticRoute("/#demos/badges/", DemoBadgesRoute) ~> renderR(BadgesPage(_))
      | staticRoute("/#demos/bottom-navigation/", DemoBottomNavigationRoute) ~> renderR(BottomNavigationPage(_))
      | staticRoute("/#demos/buttons/", DemoButtonsRoute) ~> renderR(ButtonsPage(_))
      | staticRoute("/#demos/cards/", DemoCardsRoute) ~> renderR(CardsPage(_))
      | staticRoute("/#demos/chips/", DemoChipsRoute) ~> renderR(ChipsPage(_))
      | staticRoute("/#demos/dialogs/", DemoDialogsRoute) ~> renderR(DialogsPage(_))
      | staticRoute("/#demos/dividers/", DemoDividersRoute) ~> renderR(DividersPage(_))
      | staticRoute("/#demos/drawers/", DemoDrawersRoute) ~> renderR(DrawersPage(_))
      | staticRoute("/#demos/expansion-panels/", DemoExpansionPanelsRoute) ~> renderR(ExpansionPanelsPage(_))
      | staticRoute("/#demos/grid-list/", DemoGridListRoute) ~> renderR(GridListPage(_))
      | staticRoute("/#demos/lists/", DemoListsRoute) ~> renderR(ListsPage(_))
    ).notFound(redirectToPage(DashboardRoute)(Redirect.Replace))
  }.renderWith(layout)


  def layout(c: RouterCtl[Page], r: Resolution[Page]) = Layout(c, r)

  val baseUrl = BaseUrl.fromWindowOrigin

  val router = Router(baseUrl, routerConfig)
}
