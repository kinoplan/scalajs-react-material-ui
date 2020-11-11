package io.kinoplan.demo.pages.demos

import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.demo.components.demos.BottomNavigation.{LabelBottomNavigation, SimpleBottomNavigation}
import io.kinoplan.demo.router.AppRouter.Page

object BottomNavigationPage {
  case class Props(router: RouterCtl[Page])

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      div(
        SimpleBottomNavigation(),
        LabelBottomNavigation()
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("BottomNavigationPage")
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page]) = component(Props(router))
}
