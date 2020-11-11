package io.kinoplan.demo.components.demos.Badges

import japgolly.scalajs.react.{BackendScope, React, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Badges.{BadgeMaxStyle, DefaultBadgeMaxStyle}
import io.kinoplan.scalajs.react.material.ui.core.MuiBadge
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object BadgeMax extends ScalaCssReactImplicits {
  case class Props(style: BadgeMaxStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Maximum Value")(
          React.Fragment(
            MuiBadge(badgeContent = VdomNode(99), color = MuiBadge.Color.primary)(css.badgeMargin,
              MuiIcons(MuiIconsModule.Mail)()
            ),
            MuiBadge(badgeContent = VdomNode(100), color = MuiBadge.Color.primary)(css.badgeMargin,
              MuiIcons(MuiIconsModule.Mail)()
            ),
            MuiBadge(badgeContent = VdomNode(1000), max = 999, color = MuiBadge.Color.primary)(css.badgeMargin,
              MuiIcons(MuiIconsModule.Mail)()
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("BadgeMax")
    .renderBackend[Backend]
    .build

  def apply(style: BadgeMaxStyle = DefaultBadgeMaxStyle) = component(Props(style))
}
