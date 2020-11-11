package io.kinoplan.demo.pages.labs

import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.demo.components.labs.SpeedDial.{OpenIconSpeedDial, SpeedDialTooltipOpen}
import io.kinoplan.demo.router.AppRouter.Page

object SpeedDialPage {
  case class Props(router: RouterCtl[Page])

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {

      div(
        OpenIconSpeedDial(),
        SpeedDialTooltipOpen()
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SpeedDialPage")
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page]) = component(Props(router))
}
