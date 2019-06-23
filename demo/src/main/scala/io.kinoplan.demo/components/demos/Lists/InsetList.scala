package io.kinoplan.demo.components.demos.Lists

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Lists.{DefaultListStyle, ListStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiList, MuiListItem, MuiListItemIcon, MuiListItemText}
import io.kinoplan.scalajs.react.material.ui.icons.MuiStarIcon
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReactImplicits

object InsetList extends ScalaCssReactImplicits {
  case class Props(style: ListStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Inset List")(
          div(css.root,
            MuiList(component = "nav")(
              MuiListItem(button = true)(
                MuiListItemIcon()(
                  MuiStarIcon()
                ),
                MuiListItemText(inset = true, primary = Some("Chelsea Otakan"))
              ),
              MuiListItem(button = true)(
                MuiListItemText(inset = true, primary = Some("Eric Hoffman"))
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("InsetList")
    .renderBackend[Backend]
    .build

  def apply(style: ListStyle = DefaultListStyle) = component(Props(style))
}
