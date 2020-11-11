package io.kinoplan.demo.components.demos.Badges

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Badges.{DefaultDotBadgeStyle, DotBadgeStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiBadge, MuiTypography}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object DotBadge extends ScalaCssReactImplicits {
  case class Props(style: DotBadgeStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Dot Badge")(
          div(
            div(
              MuiBadge(variant = MuiBadge.Variant.dot, color = MuiBadge.Color.primary)(css.badgeMargin,
                MuiIcons(MuiIconsModule.Mail)()
              ),
              MuiBadge(variant = MuiBadge.Variant.dot, color = MuiBadge.Color.secondary)(css.badgeMargin,
                MuiIcons(MuiIconsModule.Mail)()
              )
            ),
            MuiBadge(variant = MuiBadge.Variant.dot, color = MuiBadge.Color.primary)(css.badgeMargin,
              MuiTypography()("Typography")
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("DotBadge")
    .renderBackend[Backend]
    .build

  def apply(style: DotBadgeStyle = DefaultDotBadgeStyle) = component(Props(style))
}
