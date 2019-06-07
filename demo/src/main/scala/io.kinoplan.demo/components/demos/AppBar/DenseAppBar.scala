package io.kinoplan.demo.components.demos.AppBar

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiAppBar, MuiIconButton, MuiToolbar, MuiTypography}
import io.kinoplan.scalajs.react.material.ui.icons.MuiMenuIcon
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReact._

object DenseAppBar {
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
                  MuiMenuIcon()
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
