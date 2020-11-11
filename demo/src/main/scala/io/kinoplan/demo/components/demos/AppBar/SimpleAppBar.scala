package io.kinoplan.demo.components.demos.AppBar

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiAppBar, MuiToolbar, MuiTypography}

object SimpleAppBar extends ScalaCssReactImplicits {
  case class Props(style: CommonStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Simple App Bar")(
          div(css.flexGrowOne,
            MuiAppBar(position = MuiAppBar.Position.static, color = MuiAppBar.Color.default)(
              MuiToolbar()(
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

  private val component = ScalaComponent.builder[Props]("SimpleAppBar")
    .renderBackend[Backend]
    .build

  def apply(style: CommonStyle = DefaultCommonStyle) = component(Props(style))
}
