package io.kinoplan.demo.components.demos.AppBar

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.icons.MuiMenuIcon
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReactImplicits

object ButtonAppBar extends ScalaCssReactImplicits {
  case class Props(style: CommonStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("App Bar with buttons")(
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
