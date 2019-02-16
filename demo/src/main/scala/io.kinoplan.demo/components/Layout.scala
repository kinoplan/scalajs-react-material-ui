package io.kinoplan.demo.components

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.router.AppRouter.Page
import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.{Resolution, RouterCtl}
import japgolly.scalajs.react.vdom.all._

object Layout extends StyleSheet.Inline {
  case class Props(router: RouterCtl[Page], r: Resolution[Page])

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props) = {
      div(
        props.r.render()
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("Layout")
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page], r: Resolution[Page]) = component(Props(router, r))
}
