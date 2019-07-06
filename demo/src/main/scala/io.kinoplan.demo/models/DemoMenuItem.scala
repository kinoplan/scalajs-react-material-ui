package io.kinoplan.demo.models

import io.kinoplan.demo.router.AppRouter._

case class DemoMenuItem(
  label: String,
  location: Page
)

object DemoMenuItem {
  val demos = List(
    DemoMenuItem("App Bar", DemoAppBarRoute),
    DemoMenuItem("Avatars", DemoAvatarsRoute),
    DemoMenuItem("Badges", DemoBadgesRoute),
    DemoMenuItem("Bottom Navigation", DemoBottomNavigationRoute),
    DemoMenuItem("Buttons", DemoButtonsRoute),
    DemoMenuItem("Cards", DemoCardsRoute),
    DemoMenuItem("Chips", DemoChipsRoute),
    DemoMenuItem("Dialogs", DemoDialogsRoute),
    DemoMenuItem("Dividers", DemoDividersRoute),
    DemoMenuItem("Drawers", DemoDrawersRoute),
    DemoMenuItem("Expansion Panels", DemoExpansionPanelsRoute),
    DemoMenuItem("Grid List", DemoGridListRoute),
    DemoMenuItem("Lists", DemoListsRoute),
    DemoMenuItem("Menus", DemoMenusRoute),
    DemoMenuItem("Paper", DemoPaperRoute),
    DemoMenuItem("Pickers", DemoPickersRoute),
    DemoMenuItem("Progress", DemoProgressRoute),
    DemoMenuItem("Selection Controls", DemoSelectionControlsRoute),
    DemoMenuItem("Selects", DemoSelectsRoute),
    DemoMenuItem("Snackbars", DemoSnackbarsRoute),
    DemoMenuItem("Steppers", DemoSteppersRoute)
  )
}
