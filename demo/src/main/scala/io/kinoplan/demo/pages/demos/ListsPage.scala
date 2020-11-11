package io.kinoplan.demo.pages.demos

import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.demo.components.demos.Lists._
import io.kinoplan.demo.router.AppRouter.Page

object ListsPage {
  case class Props(router: RouterCtl[Page])

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      div(
        SimpleList(),
        NestedList(),
        FolderList(),
        InteractiveList(),
        SelectedListItem(),
        AlignItemsList(),
        CheckboxList(),
        CheckboxListSecondary(),
        SwitchListSecondary(),
        PinnedSubheaderList(),
        InsetList()
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("ListsPage")
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page]) = component(Props(router))
}
