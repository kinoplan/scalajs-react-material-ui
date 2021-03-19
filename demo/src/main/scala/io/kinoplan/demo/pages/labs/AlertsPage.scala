package io.kinoplan.demo.pages.labs

import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.demo.components.labs.Alerts._
import io.kinoplan.demo.router.AppRouter.Page

object AlertsPage {
  case class Props(router: RouterCtl[Page])

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {

      div(
        SimpleAlerts(),
        DescriptionAlerts(),
        ActionsAlerts(),
        TransitionAlerts(),
        IconAlerts(),
        OutlinedAlerts(),
        FilledAlerts(),
        ColorAlerts()
      )
    }
  }

  private val component = ScalaComponent.builder[Props]
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page]) = component(Props(router))
}
