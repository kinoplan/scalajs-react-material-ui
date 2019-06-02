package io.kinoplan.demo.components.demos.AppBar

import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiAppBar, MuiButton, MuiIconButton, MuiToolbar, MuiTypography}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiMenu => MuiMenuIcon}
import japgolly.scalajs.react.vdom.all.{VdomElement, div, _}
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReact._

object ButtonAppBar {
  case class Props(style: CommonStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        div(css.componentTitleFont, css.componentTitlePadding,
          MuiTypography(variant = MuiTypography.Variant.h4, gutterBottom = true, component = Some("h2"))(
            "App Bar with buttons"
          )
        ),
        div(css.componentContainer,
          div(css.flexGrowOne,
            MuiAppBar(position = MuiAppBar.Position.static)(
              MuiToolbar()(
                MuiIconButton(color = MuiIconButton.Color.inherit)(css.menuButton, aria.label := "Menu",
                  MuiMenuIcon()
                ),
                MuiTypography(variant = MuiTypography.Variant.h6, color = MuiTypography.Color.inherit)(css.title,
                  "News"
                ),
                MuiButton(color = MuiButton.Color.inherit)("Login")
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("ButtonAppBar")
    .renderBackend[Backend]
    .build

  def apply(style: CommonStyle = DefaultCommonStyle) = component(Props(style))
}
