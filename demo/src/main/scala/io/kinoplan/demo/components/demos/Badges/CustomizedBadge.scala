package io.kinoplan.demo.components.demos.Badges

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Badges.{CustomizedBadgeStyle, DefaultCustomizedBadgeStyle}
import io.kinoplan.demo.utils.Helpers.styleAToClassName
import io.kinoplan.scalajs.react.material.ui.core.{MuiBadge, MuiIconButton}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object CustomizedBadge extends ScalaCssReactImplicits {
  case class Props(style: CustomizedBadgeStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      val badgeClasses = Map(
        MuiBadge.ClassKey.badge -> styleAToClassName(css.badge)
      )

      div(
        ComponentContainer("Customized Badge")(
          div(
            MuiIconButton()(
              aria.label := "Cart",
              MuiBadge(badgeContent = VdomNode(4), color = MuiBadge.Color.primary, classes = badgeClasses)(
                MuiIcons(MuiIconsModule.Mail)()
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("CustomizedBadge")
    .renderBackend[Backend]
    .build

  def apply(style: CustomizedBadgeStyle = DefaultCustomizedBadgeStyle) = component(Props(style))
}
