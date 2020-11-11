package io.kinoplan.demo.components.demos.AppBar

import scala.scalajs.js.JSConverters._

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ReactEventFromHtml, ReactEventFromInput, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import org.scalajs.dom.raw.HTMLElement
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.core.internal.Origin
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object MenuAppBar extends ScalaCssReactImplicits {
  case class Props(style: CommonStyle)

  case class State(
    auth: Boolean = true,
    anchorEl: Option[HTMLElement] = None
  ) {
    def handleChange(checked: Boolean) = copy(auth = checked)

    def handleProfileMenuOpen(currentTarget: HTMLElement) = copy(anchorEl = Some(currentTarget))
    def handleProfileMenuClose = copy(anchorEl = None)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChange(e: ReactEventFromInput): Callback = {
      val target = e.target.checked

      t.modState(_.handleChange(target))
    }

    def handleProfileMenuOpen(e: ReactEventFromHtml): Callback = {
      val target = e.currentTarget

      t.modState(_.handleProfileMenuOpen(target))
    }

    def handleProfileMenuClose: Callback = t.modState(_.handleProfileMenuClose)

    def onClose: (ReactEvent, String) => Callback = (_, _) => {
      handleProfileMenuClose
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val open = state.anchorEl.nonEmpty

      val authLabel = if (state.auth) "Logout" else "Login"

      val ariaOwns = if (open) "menu-appbar" else ""

      def renderMenu() = {
        MuiMenu(
          anchorEl = state.anchorEl.orUndefined,
          anchorOrigin = Origin(vertical = "top", horizontal = "right"),
          transformOrigin = Origin(vertical = "top", horizontal = "right"),
          open = open,
          onClose = onClose,
        )(
          MuiMenuItem()(onClick --> handleProfileMenuClose,
            "Profile"
          ),
          MuiMenuItem()(onClick --> handleProfileMenuClose,
            "My account"
          )
        )
      }

      div(
        ComponentContainer("App Bar with menu")(
          div(css.flexGrowOne,
            MuiFormGroup()(
              MuiFormControlLabel(
                control = MuiSwitch(checked = state.auth)(
                  onChange ==> handleChange,
                  aria.label := "LoginSwitch"
                ).rawElement,
                label = VdomNode(authLabel)
              )
            ),
            MuiAppBar(position = MuiAppBar.Position.static)(
              MuiToolbar()(
                MuiIconButton(color = MuiIconButton.Color.inherit)(css.menuButton,
                  aria.label := "Menu",
                  MuiIcons(MuiIconsModule.Menu)()
                ),
                MuiTypography(variant = MuiTypography.Variant.h6, color = MuiTypography.Color.inherit)(css.flexGrowOne,
                  "Photos"
                ),
                div(
                  MuiIconButton(color = MuiIconButton.Color.inherit)(
                    aria.owns := ariaOwns,
                    aria.haspopup.`true`,
                    Attr("edge") := "end",
                    onClick ==> handleProfileMenuOpen,
                    MuiIcons(MuiIconsModule.AccountCircle)()
                  ),
                  renderMenu().when(open)
                ).when(state.auth)
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("MenuAppBar")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: CommonStyle = DefaultCommonStyle) = component(Props(style))
}
