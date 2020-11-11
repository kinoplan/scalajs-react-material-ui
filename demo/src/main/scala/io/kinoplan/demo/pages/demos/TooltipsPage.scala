package io.kinoplan.demo.pages.demos

import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.demo.components.demos.Tooltips._
import io.kinoplan.demo.router.AppRouter.Page

object TooltipsPage {
  case class Props(router: RouterCtl[Page])

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      div(
        SimpleTooltips(),
        PositionedTooltips(),
        TriggersTooltips(),
        ControlledTooltips(),
        VariableWidth(),
        InteractiveTooltips(),
        DisabledTooltips(),
        TransitionsTooltips(),
        DelayTooltips()
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("TooltipsPage")
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page]) = component(Props(router))
}
