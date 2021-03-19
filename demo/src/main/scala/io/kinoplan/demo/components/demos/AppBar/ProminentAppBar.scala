package io.kinoplan.demo.components.demos.AppBar

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.AppBar.{DefaultProminentAppBarStyle, ProminentAppBarStyle}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object ProminentAppBar extends ScalaCssReactImplicits {
  case class Props(style: ProminentAppBarStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Prominent")(
          div(css.root,
            MuiAppBar(position = MuiAppBar.Position.static)(
              MuiToolbar()(css.toolbar,
                MuiIconButton(edge = MuiIconButton.Edge.start, color = MuiIconButton.Color.inherit)(css.menuButton,
                  aria.label := "open drawer",
                  MuiIcons(MuiIconsModule.Menu)()
                ),
                MuiTypography(variant = MuiTypography.Variant.h5, noWrap = true)(css.title,
                  "Material-UI"
                ),
                MuiIconButton(color = MuiIconButton.Color.inherit)(
                  aria.label := "search",
                  MuiIcons(MuiIconsModule.Search)()
                ),
                MuiIconButton(edge = MuiIconButton.Edge.end, color = MuiIconButton.Color.inherit)(
                  aria.label := "display more actions",
                  MuiIcons(MuiIconsModule.More)()
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]
    .renderBackend[Backend]
    .build

  def apply(style: ProminentAppBarStyle = DefaultProminentAppBarStyle) = component(Props(style))
}
