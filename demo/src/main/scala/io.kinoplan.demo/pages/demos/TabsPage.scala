package io.kinoplan.demo.pages.demos

import io.kinoplan.demo.components.demos.Tabs._
import io.kinoplan.demo.router.AppRouter.Page
import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.all._

object TabsPage {
  case class Props(router: RouterCtl[Page])

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      div(
        SimpleTabs(),
        TabsWrappedLabel(),
        DisabledTabs(),
        FullWidthTabs(),
        CenteredTabs(),
        ScrollableTabsButtonAuto(),
        ScrollableTabsButtonForce(),
        ScrollableTabsButtonPrevent(),
        CustomizedTabs(),
        NavTabs(),
        IconTabs(),
        IconLabelTabs()
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("TabsPage")
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page]) = component(Props(router))
}
