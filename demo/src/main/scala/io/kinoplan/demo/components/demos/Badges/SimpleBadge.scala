package io.kinoplan.demo.components.demos.Badges

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Badges.{DefaultSimpleBadgeStyle, SimpleBadgeStyle}
import io.kinoplan.scalajs.react.material.ui.core.MuiBadge
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}
import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

object SimpleBadge extends ScalaCssReactImplicits {
  case class Props(style: SimpleBadgeStyle)

  private val component = ScalaComponent.builder[Props]
    .render_P { props =>
      val css = props.style

      div(
        ComponentContainer("Basic badges")(
          div(
            MuiBadge(badgeContent = VdomNode(4), color = MuiBadge.Color.primary)(css.badgeMargin,
              MuiIcons(MuiIconsModule.Mail)()
            ),
            MuiBadge(badgeContent = VdomNode(4), color = MuiBadge.Color.secondary)(css.badgeMargin,
              MuiIcons(MuiIconsModule.Mail)()
            ),
            MuiBadge(badgeContent = VdomNode(4), color = MuiBadge.Color.error)(css.badgeMargin,
              MuiIcons(MuiIconsModule.Mail)()
            )
          )
        )
      )
    }
    .build

  def apply(style: SimpleBadgeStyle = DefaultSimpleBadgeStyle) = component(Props(style))
}
