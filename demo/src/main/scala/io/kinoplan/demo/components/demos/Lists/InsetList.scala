package io.kinoplan.demo.components.demos.Lists

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout}
import io.kinoplan.demo.styles.demos.Lists.{DefaultListStyle, ListStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiList, MuiListItem, MuiListItemIcon, MuiListItemText}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object InsetList extends ScalaCssReactImplicits {
  case class Props(style: ListStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Inset List")(
          div(css.root, css.rootPaper(Layout.isPaletteLight),
            MuiList(component = "nav")(
              MuiListItem(button = true)(
                MuiListItemIcon()(
                  MuiIcons(MuiIconsModule.Star)()
                ),
                MuiListItemText(inset = true, primary = VdomNode("Chelsea Otakan"))
              ),
              MuiListItem(button = true)(
                MuiListItemText(inset = true, primary = VdomNode("Eric Hoffman"))
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
