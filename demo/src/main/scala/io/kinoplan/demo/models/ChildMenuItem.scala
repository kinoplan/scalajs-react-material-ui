package io.kinoplan.demo.models

import io.kinoplan.demo.router.AppRouter._

case class ChildMenuItem(
  label: String,
  location: Page
)

object ChildMenuItem {
  val demos = List(
    ChildMenuItem("App Bar", DemoAppBarRoute),
    ChildMenuItem("Avatars", DemoAvatarsRoute),
    ChildMenuItem("Badges", DemoBadgesRoute),
    ChildMenuItem("Bottom Navigation", DemoBottomNavigationRoute),
    ChildMenuItem("Buttons", DemoButtonsRoute),
    ChildMenuItem("Cards", DemoCardsRoute),
    ChildMenuItem("Chips", DemoChipsRoute),
    ChildMenuItem("Dialogs", DemoDialogsRoute),
    ChildMenuItem("Dividers", DemoDividersRoute),
    ChildMenuItem("Drawers", DemoDrawersRoute),
    ChildMenuItem("Expansion Panels", DemoExpansionPanelsRoute),
    ChildMenuItem("Grid List", DemoGridListRoute),
    ChildMenuItem("Lists", DemoListsRoute),
    ChildMenuItem("Menus", DemoMenusRoute),
    ChildMenuItem("Paper", DemoPaperRoute),
    ChildMenuItem("Pickers", DemoPickersRoute),
    ChildMenuItem("Progress", DemoProgressRoute),
    ChildMenuItem("Selection Controls", DemoSelectionControlsRoute),
    ChildMenuItem("Selects", DemoSelectsRoute),
    ChildMenuItem("Snackbars", DemoSnackbarsRoute),
    ChildMenuItem("Steppers", DemoSteppersRoute),
    ChildMenuItem("Tables", DemoTablesRoute),
    ChildMenuItem("Tabs", DemoTabsRoute),
    ChildMenuItem("Text Fields", DemoTextFieldsRoute),
    ChildMenuItem("Tooltips", DemoTooltipsRoute)
  )

  val labs = List(
    ChildMenuItem("Breadcrumbs", LabBreadcrumbsRoute),
    ChildMenuItem("Slider", LabSliderRoute),
    ChildMenuItem("Speed Dial", LabSpeedDialRoute),
    ChildMenuItem("Toggle Button", LabToggleButtonRoute),
  )
}
