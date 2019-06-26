package io.kinoplan.demo.components.demos.Menus

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Menus.{DefaultTypographyMenuStyle, TypographyMenuStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiListItemIcon, MuiMenuItem, MuiMenuList, MuiPaper, MuiTypography}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiDraftsIcon, MuiPriorityHighIcon, MuiSendIcon}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReactImplicits

object TypographyMenu extends ScalaCssReactImplicits {
  case class Props(style: TypographyMenuStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Limitations")(
          div(
            MuiPaper()(css.root,
              MuiMenuList()(
                MuiMenuItem()(
                  MuiListItemIcon()(
                    MuiSendIcon()
                  ),
                  MuiTypography(variant = MuiTypography.Variant.inherit)("A short message")
                ),
                MuiMenuItem()(
                  MuiListItemIcon()(
                    MuiPriorityHighIcon()
                  ),
                  MuiTypography(variant = MuiTypography.Variant.inherit)("A very long text that overflows")
                ),
                MuiMenuItem()(
                  MuiListItemIcon()(
                    MuiDraftsIcon()
                  ),
                  MuiTypography(variant = MuiTypography.Variant.inherit, noWrap = true)(
                    "A very long text that overflows"
                  )
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("TypographyMenu")
    .renderBackend[Backend]
    .build

  def apply(style: TypographyMenuStyle = DefaultTypographyMenuStyle) = component(Props(style))
}
