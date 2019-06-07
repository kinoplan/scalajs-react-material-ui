package io.kinoplan.demo.models

import com.payalabs.scalajs.react.bridge.WithProps
import io.kinoplan.demo.router.AppRouter.{DashboardRoute, Page}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiAssignmentIcon, MuiBarChartIcon, MuiDashboardIcon, MuiLayersIcon, MuiPeopleIcon, MuiShoppingCartIcon}

case class MenuItem(
  idx: Int,
  label: String,
  icon: WithProps,
  location: Page
)

object MenuItem {
  val menuItemsFirst = List(
    MenuItem(1, "Dashboard", MuiDashboardIcon(), DashboardRoute),
    MenuItem(2, "Orders", MuiShoppingCartIcon(), DashboardRoute),
    MenuItem(3, "Customers", MuiPeopleIcon(), DashboardRoute),
    MenuItem(4, "Reports", MuiBarChartIcon(), DashboardRoute),
    MenuItem(5, "Integrations", MuiLayersIcon(), DashboardRoute)
  )

  private val muiAssignment = MuiAssignmentIcon(
    color = MuiAssignmentIcon.Color.primary,
    fontSize = MuiAssignmentIcon.FontSize.default
  )

  val menuItemsSecond = List(
    MenuItem(1, "Current month", muiAssignment, DashboardRoute),
    MenuItem(2, "Last quarter", muiAssignment, DashboardRoute),
    MenuItem(3, "Year-end sale", muiAssignment, DashboardRoute)
  )
}
