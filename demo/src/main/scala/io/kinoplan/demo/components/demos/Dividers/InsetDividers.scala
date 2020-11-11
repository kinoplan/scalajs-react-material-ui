package io.kinoplan.demo.components.demos.Dividers

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout}
import io.kinoplan.demo.styles.demos.Dividers.{DefaultDividersStyle, DividersStyle}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object InsetDividers extends ScalaCssReactImplicits {
  case class Props(style: DividersStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Inset Dividers")(
          MuiList()(css.root, css.rootPaper(Layout.isPaletteLight),
            MuiListItem()(
              MuiAvatar()(MuiIcons(MuiIconsModule.Image)()),
              MuiListItemText(primary = VdomNode("Photos"), secondary = VdomNode("Jan 9, 2014"))
            ),
            li(
              MuiDivider(variant = MuiDivider.Variant.inset)
            ),
            MuiListItem()(
              MuiAvatar()(MuiIcons(MuiIconsModule.Work)()),
              MuiListItemText(primary = VdomNode("Work"), secondary = VdomNode("Jan 7, 2014"))
            ),
            MuiDivider(variant = MuiDivider.Variant.inset, component = "li"),
            MuiListItem()(
              MuiAvatar()(MuiIcons(MuiIconsModule.BeachAccess)()),
              MuiListItemText(primary = VdomNode("Vacation"), secondary = VdomNode("July 20, 2014"))
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
