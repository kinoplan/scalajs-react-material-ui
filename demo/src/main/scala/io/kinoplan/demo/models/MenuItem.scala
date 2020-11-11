package io.kinoplan.demo.models

import io.kinoplan.demo.router.AppRouter.{DashboardRoute, Page}
import io.kinoplan.scalajs.react.bridge.WithProps
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

case class MenuItem(
  label: String,
  icon: WithProps,
  location: Page
)

object MenuItem {
  val menuItemsFirst = List(
    MenuItem("Dashboard", MuiIcons(MuiIconsModule.Dashboard)(), DashboardRoute),
    MenuItem("Orders", MuiIcons(MuiIconsModule.ShoppingCart)(), DashboardRoute),
    MenuItem("Customers", MuiIcons(MuiIconsModule.People)(), DashboardRoute),
    MenuItem("Reports", MuiIcons(MuiIconsModule.BarChart)(), DashboardRoute),
    MenuItem("Integrations", MuiIcons(MuiIconsModule.Layers)(), DashboardRoute)
  )

  private val muiAssignment = MuiIcons(MuiIconsModule.Assignment)(
    color = MuiIcons.Color.primary,
    fontSize = MuiIcons.FontSize.default
  )

  val menuItemsSecond = List(
    MenuItem("Current month", muiAssignment, DashboardRoute),
    MenuItem("Last quarter", muiAssignment, DashboardRoute),
    MenuItem("Year-end sale", muiAssignment, DashboardRoute)
  )
}
