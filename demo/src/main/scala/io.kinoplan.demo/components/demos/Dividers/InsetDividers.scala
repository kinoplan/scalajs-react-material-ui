package io.kinoplan.demo.components.demos.Dividers

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Dividers.{DefaultDividersStyle, DividersStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiAvatar, MuiDivider, MuiList, MuiListItem, MuiListItemText}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiBeachAccessIcon, MuiImageIcon, MuiWorkIcon}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReact._

object InsetDividers {
  case class Props(style: DividersStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Inset Dividers")(
          MuiList()(css.root,
            MuiListItem()(
              MuiAvatar()(MuiImageIcon()),
              MuiListItemText(primary = Some("Photos"), secondary = Some("Jan 9, 2014"))
            ),
            li(
              MuiDivider(variant = MuiDivider.Variant.inset)
            ),
            MuiListItem()(
              MuiAvatar()(MuiWorkIcon()),
              MuiListItemText(primary = Some("Work"), secondary = Some("Jan 7, 2014"))
            ),
            MuiDivider(variant = MuiDivider.Variant.inset, component = "li"),
            MuiListItem()(
              MuiAvatar()(MuiBeachAccessIcon()),
              MuiListItemText(primary = Some("Vacation"), secondary = Some("July 20, 2014"))
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("InsetDividers")
    .renderBackend[Backend]
    .build

  def apply(style: DividersStyle = DefaultDividersStyle) = component(Props(style))
}
