package io.kinoplan.demo.models

import io.kinoplan.demo.router.AppRouter._

case class DemoMenuItem(
  idx: Int,
  label: String,
  location: Page
)

object DemoMenuItem {
  val demos = List(
    DemoMenuItem(1, "App Bar", DemoAppBarRoute),
    DemoMenuItem(2, "Avatars", DemoAvatarsRoute),
    DemoMenuItem(3, "Badges", DemoBadgesRoute),
    DemoMenuItem(4, "Bottom Navigation", DemoBottomNavigationRoute),
    DemoMenuItem(5, "Buttons", DemoButtonsRoute),
    DemoMenuItem(6, "Cards", DemoCardsRoute),
    DemoMenuItem(7, "Chips", DemoChipsRoute),
    DemoMenuItem(8, "Dialogs", DemoDialogsRoute),
    DemoMenuItem(9, "Dividers", DemoDividersRoute),
    DemoMenuItem(10, "Drawers", DemoDrawersRoute)
  )
}
