package io.kinoplan.demo.components.demos.Dividers

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout}
import io.kinoplan.demo.styles.demos.Dividers.{DefaultDividersStyle, DividersStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiDivider, MuiList, MuiListItem, MuiListItemText}

object ListDividers extends ScalaCssReactImplicits {
  case class Props(style: DividersStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("List Dividers")(
          MuiList(component = "nav")(css.root, css.rootPaper(Layout.isPaletteLight),
            MuiListItem(button = true)(
              MuiListItemText(primary = VdomNode("Inbox"))
            ),
            MuiDivider(),
            MuiListItem(button = true, divider = true)(
              MuiListItemText(primary = VdomNode("Drafts"))
            ),
            MuiListItem(button = true)(
              MuiListItemText(primary = VdomNode("Trash"))
            ),
            MuiDivider(light = true),
            MuiListItem(button = true)(
              MuiListItemText(primary = VdomNode("Spam"))
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("ListDividers")
    .renderBackend[Backend]
    .build

  def apply(style: DividersStyle = DefaultDividersStyle) = component(Props(style))
}
