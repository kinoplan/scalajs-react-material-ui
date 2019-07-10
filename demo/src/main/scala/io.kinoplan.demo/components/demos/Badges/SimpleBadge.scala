package io.kinoplan.demo.components.demos.Badges

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Badges.{DefaultSimpleBadgeStyle, SimpleBadgeStyle}
import io.kinoplan.demo.utils.Helpers.StringExtended
import io.kinoplan.scalajs.react.material.ui.core.{MuiAppBar, MuiBadge, MuiButton, MuiIconButton, MuiTab, MuiTabs, MuiTypography}
import io.kinoplan.scalajs.react.material.ui.icons.MuiMailIcon
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReactImplicits

object SimpleBadge extends ScalaCssReactImplicits {
  case class Props(style: SimpleBadgeStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      val tabLabel = VdomNode(
        MuiBadge(badgeContent = Some(VdomNode(4)), color = MuiBadge.Color.secondary)(css.badgePadding,
          "Item One"
        ).rawNode
      )

      div(
        ComponentContainer("Simple Badges")(
          div(
            div(
              MuiBadge(badgeContent = Some(VdomNode(4)), color = MuiBadge.Color.primary)(css.badgeMargin,
                MuiMailIcon()
              ),
              MuiBadge(badgeContent = Some(VdomNode(10)), color = MuiBadge.Color.secondary)(css.badgeMargin,
                MuiMailIcon()
              ),
              MuiIconButton()(css.badgeMargin,
                aria.label := "4 pending messages",
                MuiBadge(badgeContent = Some(VdomNode(4)), color = MuiBadge.Color.primary)(
                  MuiMailIcon()
                )
              )
            ),
            MuiAppBar(position = MuiAppBar.Position.static)(css.badgeMargin,
              MuiTabs()(
                value := 0,
                MuiTab(label = tabLabel),
                MuiTab(label = "Item Two".toVdom),
                MuiTab(label = "Item Three".toVdom)
              )
            ),
            MuiBadge(badgeContent = Some(VdomNode(4)), color = MuiBadge.Color.primary)(css.badgeMargin,
              MuiTypography()(css.badgePadding,
                "Typography"
              )
            ),
            MuiBadge(badgeContent = Some(VdomNode(4)), color = MuiBadge.Color.primary)(css.badgeMargin,
              MuiButton(variant = MuiButton.Variant.contained)("Button")
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SimpleBadge")
    .renderBackend[Backend]
    .build

  def apply(style: SimpleBadgeStyle = DefaultSimpleBadgeStyle) = component(Props(style))
}