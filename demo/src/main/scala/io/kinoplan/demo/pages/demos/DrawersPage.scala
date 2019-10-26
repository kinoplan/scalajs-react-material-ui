package io.kinoplan.demo.pages.demos

import io.kinoplan.demo.components.demos.Drawers._
import io.kinoplan.demo.router.AppRouter.Page
import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.all._

object DrawersPage {
  case class Props(router: RouterCtl[Page])

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      div(
        TemporaryDrawer(),
        SwipeableTemporaryDrawer(),
        ResponsiveDrawer(),
        PersistentDrawer(),
        MiniDrawer()
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("DrawersPage")
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page]) = component(Props(router))
}
