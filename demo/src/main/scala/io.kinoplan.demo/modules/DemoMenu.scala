package io.kinoplan.demo.modules

import io.kinoplan.demo.models.DemoMenuItem
import io.kinoplan.demo.router.AppRouter.Page
import io.kinoplan.demo.styles.{DefaultDemoMenuStyle, DemoMenuStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiList, MuiListItem, MuiListItemText}
import japgolly.scalajs.react.extra.router.{Resolution, RouterCtl}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.vdom.{Attr, VdomArray, VdomNode}
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReact._

object DemoMenu {
  case class Props(router: RouterCtl[Page], r: Resolution[Page], style: DemoMenuStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomArray = {
      val css = props.style

      VdomArray(
        MuiList(component = Some("div"), disablePadding = true)(Attr("key") := 2,
          DemoMenuItem.demos.toVdomArray { item =>
            MuiListItem(button = true)(css.nested,
              Attr("key") := item.idx,
              href := props.router.urlFor(item.location).value,
              props.router.setOnLinkClick(item.location)
            )(
              MuiListItemText(inset = true, primary = Some(VdomNode(item.label)))()
            )
          }
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("DemoMenu")
    .renderBackend[Backend]
    .build

  def apply(
    router: RouterCtl[Page],
    r: Resolution[Page],
    style: DemoMenuStyle = DefaultDemoMenuStyle
  ) = component(Props(router, r, style))
}
