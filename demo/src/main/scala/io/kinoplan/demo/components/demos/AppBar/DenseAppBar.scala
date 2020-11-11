package io.kinoplan.demo.components.demos.AppBar

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiAppBar, MuiIconButton, MuiToolbar, MuiTypography}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object DenseAppBar extends ScalaCssReactImplicits {
  case class Props(style: CommonStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Dense (desktop only)")(
          div(css.flexGrowOne,
            MuiAppBar(position = MuiAppBar.Position.static)(
              MuiToolbar(variant = MuiToolbar.Variant.dense)(
                MuiIconButton(color = MuiIconButton.Color.inherit)(css.menuButtonDesktop,
                  aria.label := "Menu",
                  MuiIcons(MuiIconsModule.Menu)()
                ),
                MuiTypography(variant = MuiTypography.Variant.h6, color = MuiTypography.Color.inherit)(
                  "Photos"
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("DenseAppBar")
    .renderBackend[Backend]
    .build

  def apply(style: CommonStyle = DefaultCommonStyle) = component(Props(style))
}
