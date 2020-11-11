package io.kinoplan.demo.pages.demos

import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.demo.components.demos.GridList.{AdvancedGridList, ImageGridList, SingleLineGridList, TitlebarGridList}
import io.kinoplan.demo.router.AppRouter.Page

object GridListPage {
  case class Props(router: RouterCtl[Page])

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      div(
        ImageGridList(),
        TitlebarGridList(),
        SingleLineGridList(),
        AdvancedGridList()
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("GridListPage")
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page]) = component(Props(router))
}
