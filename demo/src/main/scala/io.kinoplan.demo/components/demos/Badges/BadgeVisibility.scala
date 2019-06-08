package io.kinoplan.demo.components.demos.Badges

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Badges.{BadgeVisibilityStyle, DefaultBadgeVisibilityStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiBadge, MuiDivider, MuiFormControlLabel, MuiFormGroup, MuiSwitch}
import io.kinoplan.scalajs.react.material.ui.icons.MuiMailIcon
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReact._

object BadgeVisibility {
  case class Props(style: BadgeVisibilityStyle)

  case class State(invisible: Boolean = false) {
    def handleBadgeVisibility = copy(invisible = !invisible)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleBadgeVisibility = t.modState(_.handleBadgeVisibility)

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Badge visibility")(
          div(css.root,
            div(css.row,
              MuiBadge(
                badgeContent = Some(VdomNode(4)),
                invisible = Some(state.invisible),
                color = MuiBadge.Color.secondary
              )(css.badgeMargin,
                MuiMailIcon()
              ),
              MuiBadge(
                variant = MuiBadge.Variant.dot,
                invisible = Some(state.invisible),
                color = MuiBadge.Color.secondary
              )(css.badgeMargin,
                MuiMailIcon()
              )
            ),
            MuiFormGroup(row = true)(
              MuiFormControlLabel(
                control = Some(
                  MuiSwitch(checked = Some(!state.invisible), color = MuiSwitch.Color.primary)(
                    onChange --> handleBadgeVisibility,
                  ).rawElement
                ),
                label = Some(VdomNode("Show Badge"))
              )
            ),
            MuiDivider()(css.divider),
            div(css.row,
              MuiBadge(badgeContent = Some(VdomNode(0)), color = MuiBadge.Color.secondary)(css.badgeMargin,
                MuiMailIcon()
              ),
              MuiBadge(badgeContent = Some(VdomNode(0)), showZero = true, color = MuiBadge.Color.secondary)(css.badgeMargin,
                MuiMailIcon()
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("BadgeVisibility")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: BadgeVisibilityStyle = DefaultBadgeVisibilityStyle) = component(Props(style))
}
