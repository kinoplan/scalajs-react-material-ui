package io.kinoplan.demo.models

import com.payalabs.scalajs.react.bridge.WithProps
import io.kinoplan.demo.router.AppRouter.{DashboardRoute, Page}
import io.kinoplan.scalajs.react.material.ui.icons._

case class MenuItem(
  idx: Int,
  label: String,
  icon: WithProps,
  location: Page
)

object MenuItem {
  val menuItemsFirst = List(
    MenuItem(1, "Dashboard", MuiDashboard(), DashboardRoute),
    MenuItem(2, "Orders", MuiShoppingCart(), DashboardRoute),
    MenuItem(3, "Customers", MuiPeople(), DashboardRoute),
    MenuItem(4, "Reports", MuiBarChart(), DashboardRoute),
    MenuItem(5, "Integrations", MuiLayers(), DashboardRoute)
  )

  private val muiAssignment = MuiAssignment(color = MuiAssignment.Color.primary, fontSize = MuiAssignment.FontSize.default)

  val menuItemsSecond = List(
    MenuItem(1, "Current month", muiAssignment, DashboardRoute),
    MenuItem(2, "Last quarter", muiAssignment, DashboardRoute),
    MenuItem(3, "Year-end sale", muiAssignment, DashboardRoute)
  )
}
