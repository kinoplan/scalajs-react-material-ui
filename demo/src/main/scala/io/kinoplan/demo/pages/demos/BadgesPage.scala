package io.kinoplan.demo.pages.demos

import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.demo.components.demos.Badges._
import io.kinoplan.demo.router.AppRouter.Page

object BadgesPage {
  case class Props(router: RouterCtl[Page])

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      div(
        SimpleBadge(),
        script(src :="https://scastie.scala-lang.org/JJpaNm3vRdCisZfO4QQ6YA.js" ),
        CustomizedBadge(),
        BadgeMax(),
        DotBadge(),
        BadgeVisibility()
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("BadgesPage")
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page]) = component(Props(router))
}
