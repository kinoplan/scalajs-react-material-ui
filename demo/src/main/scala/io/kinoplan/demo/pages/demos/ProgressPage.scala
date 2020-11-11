package io.kinoplan.demo.pages.demos

import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.demo.components.demos.Progress._
import io.kinoplan.demo.router.AppRouter.Page

object ProgressPage {
  case class Props(router: RouterCtl[Page])

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      div(
        CircularIndeterminate(),
        CircularIntegration(),
        CircularDeterminate(),
        CircularStatic(),
        LinearIndeterminate(),
        LinearDeterminate(),
        LinearBuffer(),
        LinearQuery(),
        CustomizedProgress(),
        DelayingAppearance(),
        CircularUnderLoad()
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("ProgressPage")
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page]) = component(Props(router))
}
