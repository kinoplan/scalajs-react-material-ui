package io.kinoplan.demo.components.demos.Badges

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Badges.{BadgeVisibilityStyle, DefaultBadgeVisibilityStyle}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object BadgeVisibility extends ScalaCssReactImplicits {
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
                badgeContent = VdomNode(4),
                invisible = state.invisible,
                color = MuiBadge.Color.secondary
              )(css.badgeMargin,
                MuiIcons(MuiIconsModule.Mail)()
              ),
              MuiBadge(
                variant = MuiBadge.Variant.dot,
                invisible = state.invisible,
                color = MuiBadge.Color.secondary
              )(css.badgeMargin,
                MuiIcons(MuiIconsModule.Mail)()
              )
            ),
            MuiFormGroup(row = true)(
              MuiFormControlLabel(
                control = MuiSwitch(checked = !state.invisible, color = MuiSwitch.Color.primary)(
                  onChange --> handleBadgeVisibility,
                ).rawElement,
                label = VdomNode("Show Badge")
              )
            ),
            MuiDivider()(css.divider),
            div(css.row,
              MuiBadge(badgeContent = VdomNode(0), color = MuiBadge.Color.secondary)(css.badgeMargin,
                MuiIcons(MuiIconsModule.Mail)()
              ),
              MuiBadge(badgeContent = VdomNode(0), showZero = true, color = MuiBadge.Color.secondary)(css.badgeMargin,
                MuiIcons(MuiIconsModule.Mail)()
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
