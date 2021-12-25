package io.kinoplan.demo.components.demos.Badges

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Badges.{CustomizedBadgeStyle, DefaultCustomizedBadgeStyle}
import io.kinoplan.demo.utils.Helpers.styleAToClassName
import io.kinoplan.scalajs.react.material.ui.core.{MuiBadge, MuiIconButton}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}
import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

object CustomizedBadge extends ScalaCssReactImplicits {
  case class Props(style: CustomizedBadgeStyle)

  private val component = ScalaComponent.builder[Props]
    .render_P { props =>
      val css = props.style

      val badgeClasses = Map(
        MuiBadge.ClassKey.badge -> styleAToClassName(css.badge)
      )

      div(
        ComponentContainer("Customized badges")(
          div(
            MuiIconButton()(
              aria.label := "cart",
              MuiBadge(badgeContent = VdomNode(4), color = MuiBadge.Color.secondary, classes = badgeClasses)(
                MuiIcons(MuiIconsModule.ShoppingCart)()
              )
            )
          )
        )
      )
    }
    .build

  def apply(style: CustomizedBadgeStyle = DefaultCustomizedBadgeStyle) = component(Props(style))
}
