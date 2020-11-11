package io.kinoplan.demo.components

import japgolly.scalajs.react.{BackendScope, PropsChildren, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, div, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.MuiTypography

object ComponentContainer extends ScalaCssReactImplicits {
  case class Props(title: String, style: CommonStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props, children: PropsChildren): VdomElement = {
      val css = props.style

      div(
        div(css.componentTitleFont, css.componentTitlePadding,
          MuiTypography(variant = MuiTypography.Variant.h4, gutterBottom = true, component = "h2")(
            props.title
          )
        ),
        div(css.demo, css.demoPaper(Layout.isPaletteLight),
          children
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("ComponentContainer")
    .renderBackendWithChildren[Backend]
    .build

  def apply(
    title: String,
    style: CommonStyle = DefaultCommonStyle
  )(children: VdomNode*): VdomElement = component(Props(title, style))(children:_*)
}
