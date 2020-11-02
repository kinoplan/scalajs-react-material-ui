package io.kinoplan.demo.models

import io.kinoplan.scalajs.react.bridge.WithProps
import io.kinoplan.demo.router.AppRouter.{DashboardRoute, Page}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiAssignmentIcon, MuiBarChartIcon, MuiDashboardIcon, MuiLayersIcon, MuiPeopleIcon, MuiShoppingCartIcon}

case class MenuItem(
  label: String,
  icon: WithProps,
  location: Page
)

object MenuItem {
  val menuItemsFirst = List(
    MenuItem("Dashboard", MuiDashboardIcon(), DashboardRoute),
    MenuItem("Orders", MuiShoppingCartIcon(), DashboardRoute),
    MenuItem("Customers", MuiPeopleIcon(), DashboardRoute),
    MenuItem("Reports", MuiBarChartIcon(), DashboardRoute),
    MenuItem("Integrations", MuiLayersIcon(), DashboardRoute)
  )

  private val muiAssignment = MuiAssignmentIcon(
    color = MuiAssignmentIcon.Color.primary,
    fontSize = MuiAssignmentIcon.FontSize.default
  )

  val menuItemsSecond = List(
    MenuItem("Current month", muiAssignment, DashboardRoute),
    MenuItem("Last quarter", muiAssignment, DashboardRoute),
    MenuItem("Year-end sale", muiAssignment, DashboardRoute)
  )
}
