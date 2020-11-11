package io.kinoplan.demo.pages.demos

import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.demo.components.demos.Chips.{Chips, ChipsArray, ChipsPlayground, OutlinedChips}
import io.kinoplan.demo.router.AppRouter.Page

object ChipsPage {
  case class Props(router: RouterCtl[Page])

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      div(
        Chips(),
        OutlinedChips(),
        ChipsArray(),
        ChipsPlayground()
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("ChipsPage")
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page]) = component(Props(router))
}
