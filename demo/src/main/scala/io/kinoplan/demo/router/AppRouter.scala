package io.kinoplan.demo.router

import japgolly.scalajs.react.extra.router._

import io.kinoplan.demo.components.Layout
import io.kinoplan.demo.pages.SimpleTablePage
import io.kinoplan.demo.pages.demos._
import io.kinoplan.demo.pages.labs.{BreadcrumbsPage, SliderPage, SpeedDialPage, ToggleButtonPage}

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
  case object DemoMenusRoute extends Page
  case object DemoPaperRoute extends Page
  case object DemoPickersRoute extends Page
  case object DemoProgressRoute extends Page
  case object DemoSelectionControlsRoute extends Page
  case object DemoSelectsRoute extends Page
  case object DemoSnackbarsRoute extends Page
  case object DemoSteppersRoute extends Page
  case object DemoTablesRoute extends Page
  case object DemoTabsRoute extends Page
  case object DemoTextFieldsRoute extends Page
  case object DemoTooltipsRoute extends Page

  case object LabBreadcrumbsRoute extends Page
  case object LabSliderRoute extends Page
  case object LabSpeedDialRoute extends Page
  case object LabToggleButtonRoute extends Page

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
      | staticRoute("/#demos/menus/", DemoMenusRoute) ~> renderR(MenusPage(_))
      | staticRoute("/#demos/paper/", DemoPaperRoute) ~> renderR(PaperPage(_))
      | staticRoute("/#demos/pickers/", DemoPickersRoute) ~> renderR(PickersPage(_))
      | staticRoute("/#demos/progress/", DemoProgressRoute) ~> renderR(ProgressPage(_))
      | staticRoute("/#demos/selection-controls/", DemoSelectionControlsRoute) ~> renderR(SelectionControlsPage(_))
      | staticRoute("/#demos/selects/", DemoSelectsRoute) ~> renderR(SelectsPage(_))
      | staticRoute("/#demos/snackbars/", DemoSnackbarsRoute) ~> renderR(SnackbarsPage(_))
      | staticRoute("/#demos/steppers/", DemoSteppersRoute) ~> renderR(SteppersPage(_))
      | staticRoute("/#demos/tables/", DemoTablesRoute) ~> renderR(TablesPage(_))
      | staticRoute("/#demos/tabs/", DemoTabsRoute) ~> renderR(TabsPage(_))
      | staticRoute("/#demos/text-fields/", DemoTextFieldsRoute) ~> renderR(TextFieldsPage(_))
      | staticRoute("/#demos/tooltips/", DemoTooltipsRoute) ~> renderR(TooltipsPage(_))
      | staticRoute("/#lab/breadcrumbs/", LabBreadcrumbsRoute) ~> renderR(BreadcrumbsPage(_))
      | staticRoute("/#lab/slider/", LabSliderRoute) ~> renderR(SliderPage(_))
      | staticRoute("/#lab/speed-dial/", LabSpeedDialRoute) ~> renderR(SpeedDialPage(_))
      | staticRoute("/#lab/toggle-button/", LabToggleButtonRoute) ~> renderR(ToggleButtonPage(_))
    ).notFound(redirectToPage(DashboardRoute)(SetRouteVia.HistoryReplace))
  }.renderWith(layout)


  def layout(c: RouterCtl[Page], r: Resolution[Page]) = Layout(c, r)

  val baseUrl = BaseUrl.fromWindowOrigin

  val router = Router(baseUrl, routerConfig)
}
