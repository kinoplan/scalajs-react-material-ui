package io.kinoplan.demo.pages.demos

import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.demo.components.demos.Dividers.{InsetDividers, ListDividers, MiddleDividers, SubheaderDividers}
import io.kinoplan.demo.router.AppRouter.Page

object DividersPage {
  case class Props(router: RouterCtl[Page])

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      div(
        ListDividers(),
        InsetDividers(),
        SubheaderDividers(),
        MiddleDividers()
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("DividersPage")
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page]) = component(Props(router))
}
