package io.kinoplan.demo.pages.labs

import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.demo.components.labs.Breadcrumbs._
import io.kinoplan.demo.router.AppRouter.Page

object BreadcrumbsPage {
  case class Props(router: RouterCtl[Page])

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {

      div(
        SimpleBreadcrumbs(),
        CustomSeparator(),
        IconBreadcrumbs(),
        CollapsedBreadcrumbs(),
        CustomizedBreadcrumbs()
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("BreadcrumbsPage")
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page]) = component(Props(router))
}
