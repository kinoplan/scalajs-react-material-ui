package io.kinoplan.demo.pages.demos

import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.demo.components.demos.Cards.{MediaCard, MediaCardFit, MediaControlCard, RecipeReviewCard, SimpleCard}
import io.kinoplan.demo.router.AppRouter.Page

object CardsPage {
  case class Props(router: RouterCtl[Page])

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      div(
        SimpleCard(),
        RecipeReviewCard(),
        MediaCard(),
        MediaCardFit(),
        MediaControlCard()
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("CardsPage")
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page]) = component(Props(router))
}
