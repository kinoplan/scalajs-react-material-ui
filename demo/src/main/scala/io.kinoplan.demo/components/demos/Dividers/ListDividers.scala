package io.kinoplan.demo.components.demos.Dividers

import io.kinoplan.demo.components.{ComponentContainer, Layout}
import io.kinoplan.demo.styles.demos.Dividers.{DefaultDividersStyle, DividersStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiDivider, MuiList, MuiListItem, MuiListItemText}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReact._

object ListDividers {
  case class Props(style: DividersStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("List Dividers")(
          MuiList(component = "nav")(css.root, css.rootPaper(Layout.isPaletteLight),
            MuiListItem(button = true)(
              MuiListItemText(primary = Some("Inbox"))
            ),
            MuiDivider(),
            MuiListItem(button = true, divider = true)(
              MuiListItemText(primary = Some("Drafts"))
            ),
            MuiListItem(button = true)(
              MuiListItemText(primary = Some("Trash"))
            ),
            MuiDivider(light = true),
            MuiListItem(button = true)(
              MuiListItemText(primary = Some("Spam"))
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
