package io.kinoplan.demo.modules

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.extra.router.{Resolution, RouterCtl}
import japgolly.scalajs.react.vdom.{Attr, VdomArray, VdomNode}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.models.ChildMenuItem
import io.kinoplan.demo.router.AppRouter.Page
import io.kinoplan.demo.styles.{ChildMenuStyle, DefaultChildMenuStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiList, MuiListItem, MuiListItemText}

object ChildMenu extends ScalaCssReactImplicits {
  case class Props(
    router: RouterCtl[Page],
    r: Resolution[Page],
    items: List[ChildMenuItem],
    style: ChildMenuStyle
  )

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomArray = {
      val css = props.style

      VdomArray(
        MuiList(component = "div", disablePadding = true)(Attr("key") := 2,
          props.items.zipWithIndex.toVdomArray { case (item, index) =>
            MuiListItem(button = true)(css.nested,
              Attr("key") := index,
              href := props.router.urlFor(item.location).value,
              props.router.setOnLinkClick(item.location)
            )(
              MuiListItemText(inset = true, primary = VdomNode(item.label))()
            )
          }
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("ChildMenu")
    .renderBackend[Backend]
    .build

  def apply(
    router: RouterCtl[Page],
    r: Resolution[Page],
    items: List[ChildMenuItem],
    style: ChildMenuStyle = DefaultChildMenuStyle
  ) = component(Props(router, r, items, style))
}
