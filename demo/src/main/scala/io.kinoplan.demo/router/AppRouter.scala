package io.kinoplan.demo.router

import io.kinoplan.demo.components.Layout
import io.kinoplan.demo.pages.TypographyPage
import japgolly.scalajs.react.extra.router._
import japgolly.scalajs.react.vdom.all._

object AppRouter {
  sealed trait Page
  case object TypographyRoute extends Page

  val routerConfig = RouterConfigDsl[Page].buildConfig { dsl =>
    import dsl._

    (
      staticRoute("/typography", TypographyRoute) ~> renderR(TypographyPage(_))
    ).notFound(redirectToPage(TypographyRoute)(Redirect.Replace))
  }.renderWith(layout)


  def layout(c: RouterCtl[Page], r: Resolution[Page]) = Layout(c, r)

  val baseUrl = BaseUrl.fromWindowOrigin

  val router = Router(baseUrl, routerConfig)
}

