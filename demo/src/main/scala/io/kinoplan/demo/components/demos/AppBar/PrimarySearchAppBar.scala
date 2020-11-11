package io.kinoplan.demo.components.demos.AppBar

import scala.scalajs.js.JSConverters._

import cats.syntax.option._
import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ReactEventFromHtml, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import org.scalajs.dom.raw.HTMLElement
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.AppBar.{DefaultPrimarySearchAppBarStyle, PrimarySearchAppBarStyle}
import io.kinoplan.demo.utils.Helpers._
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.core.internal.Origin
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object PrimarySearchAppBar extends ScalaCssReactImplicits {
  case class Props(style: PrimarySearchAppBarStyle)

  case class State(
    anchorEl: Option[HTMLElement] = None,
    mobileMoreAnchorEl: Option[HTMLElement] = None
  ) {
    def handleProfileMenuOpen(currentTarget: HTMLElement) = copy(anchorEl = Some(currentTarget))
    def handleProfileMenuClose = copy(anchorEl = None, mobileMoreAnchorEl = None)

    def handleMobileMenuOpen(currentTarget: HTMLElement) = copy(mobileMoreAnchorEl = Some(currentTarget))
    def handleMobileMenuClose = copy(mobileMoreAnchorEl = None)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleProfileMenuOpen(e: ReactEventFromHtml): Callback = {
      val target = e.currentTarget

      t.modState(_.handleProfileMenuOpen(target))
    }

    def handleProfileMenuClose: Callback = t.modState(_.handleProfileMenuClose)

    def onCloseProfile: (ReactEvent, String) => Callback = (_, _) => {
      handleProfileMenuClose
    }

    def handleMobileMenuOpen(e: ReactEventFromHtml): Callback = {
      val target = e.currentTarget

      t.modState(_.handleMobileMenuOpen(target))
    }

    def handleMobileMenuClose: (ReactEvent, String) => Callback = (_, _) => {
      t.modState(_.handleMobileMenuClose)
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val isMenuOpen = state.anchorEl.nonEmpty
      val isMobileMenuOpen = state.mobileMoreAnchorEl.nonEmpty

      val inputBaseClasses = Map(
        MuiInputBase.ClassKey.input -> styleAToClassName(css.inputInput),
        MuiInputBase.ClassKey.root -> styleAToClassName(css.inputRoot)
      ).some.orUndefined

      val ariaOwns = if (isMenuOpen) "material-appbar" else ""

      def renderMenu() = {
        MuiMenu(
          anchorEl = state.anchorEl.orUndefined,
          anchorOrigin = Origin(vertical = "top", horizontal = "right"),
          transformOrigin = Origin(vertical = "top", horizontal = "right"),
          open = isMenuOpen,
          onClose = onCloseProfile
        )(
          MuiMenuItem()(onClick --> handleProfileMenuClose,
            "Profile"
          ),
          MuiMenuItem()(onClick --> handleProfileMenuClose,
            "My account"
          )
        )
      }

      def renderMobileMenu() = {
        MuiMenu(
          anchorEl = state.mobileMoreAnchorEl.orUndefined,
          anchorOrigin = Origin(vertical = "top", horizontal = "right"),
          transformOrigin = Origin(vertical = "top", horizontal = "right"),
          open = isMobileMenuOpen,
          onClose = handleMobileMenuClose
        )(
          MuiMenuItem()(
            MuiIconButton(color = MuiIconButton.Color.inherit)(
              MuiBadge(badgeContent = VdomNode(4), color = MuiBadge.Color.secondary)(
                MuiIcons(MuiIconsModule.Mail)()
              )
            ),
            p("Messages")
          ),
          MuiMenuItem()(
            MuiIconButton(color = MuiIconButton.Color.inherit)(
              MuiBadge(badgeContent = VdomNode(11), color = MuiBadge.Color.secondary)(
                MuiIcons(MuiIconsModule.Notifications)()
              )
            ),
            p("Notifications")
          ),
          MuiMenuItem()(onClick ==> handleProfileMenuOpen,
            MuiIconButton(color = MuiIconButton.Color.inherit)(
              MuiIcons(MuiIconsModule.AccountCircle)()
            ),
            p("Profile")
          )
        )
      }

      div(
        ComponentContainer("App Bar with a primary search field")(
          div(css.root,
            MuiAppBar(position = MuiAppBar.Position.static)(
              MuiToolbar()(
                MuiIconButton(color = MuiIconButton.Color.inherit)(css.common.menuButton,
                  aria.label := "Open drawer",
                  Attr("edge") := "start",
                  MuiIcons(MuiIconsModule.Menu)()
                ),
                MuiTypography(variant = MuiTypography.Variant.h6, color = MuiTypography.Color.inherit, noWrap = true)(css.title,
                  "Material-UI"
                ),
                div(css.search,
                  div(css.searchIcon, MuiIcons(MuiIconsModule.Search)()),
                  MuiInputBase(classes = inputBaseClasses)(placeholder := "Search…")
                ),
                div(css.common.flexGrowOne),
                div(css.sectionDesktop,
                  MuiIconButton(color = MuiIconButton.Color.inherit)(
                    MuiBadge(badgeContent = VdomNode(4), color = MuiBadge.Color.secondary)(
                      MuiIcons(MuiIconsModule.Mail)()
                    )
                  ),
                  MuiIconButton(color = MuiIconButton.Color.inherit)(
                    MuiBadge(badgeContent = VdomNode(17), color = MuiBadge.Color.secondary)(
                      MuiIcons(MuiIconsModule.Notifications)()
                    )
                  ),
                  MuiIconButton(color = MuiIconButton.Color.inherit)(
                    aria.owns := ariaOwns,
                    aria.haspopup.`true`,
                    Attr("edge") := "end",
                    onClick ==> handleProfileMenuOpen,
                    MuiIcons(MuiIconsModule.AccountCircle)()
                  )
                ),
                div(css.sectionMobile,
                  MuiIconButton(color = MuiIconButton.Color.inherit)(
                    aria.haspopup.`true`,
                    onClick ==> handleMobileMenuOpen,
                    MuiIcons(MuiIconsModule.MoreVert)()
                  )
                )
              )
            ),
            renderMenu().when(isMenuOpen || isMobileMenuOpen),
            renderMobileMenu().when(isMenuOpen || isMobileMenuOpen)
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("PrimarySearchAppBar")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: PrimarySearchAppBarStyle = DefaultPrimarySearchAppBarStyle) = component(Props(style))
}
