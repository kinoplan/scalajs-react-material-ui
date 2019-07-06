package io.kinoplan.demo.components.demos.AppBar

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.AppBar.{DefaultPrimarySearchAppBarStyle, PrimarySearchAppBarStyle}
import io.kinoplan.demo.utils.Helpers._
import io.kinoplan.scalajs.react.material.ui.core.internal.Origin
import io.kinoplan.scalajs.react.material.ui.core.{MuiAppBar, MuiBadge, MuiIconButton, MuiInputBase, MuiMenu, MuiMenuItem, MuiToolbar, MuiTypography}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiAccountCircleIcon, MuiMailIcon, MuiMenuIcon, MuiMoreVertIcon, MuiNotificationsIcon, MuiSearchIcon}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ReactEventFromHtml, ScalaComponent}
import org.scalajs.dom.raw.HTMLElement
import scalacss.ScalaCssReact._

object PrimarySearchAppBar {
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

    def handleProfileMenuClose: ReactEvent => Callback = e => {
      t.modState(_.handleProfileMenuClose)
    }

    def handleMobileMenuOpen(e: ReactEventFromHtml): Callback = {
      val target = e.currentTarget

      t.modState(_.handleMobileMenuOpen(target))
    }

    def handleMobileMenuClose: ReactEvent => Callback = e => {
      t.modState(_.handleMobileMenuClose)
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val isMenuOpen = state.anchorEl.nonEmpty
      val isMobileMenuOpen = state.mobileMoreAnchorEl.nonEmpty

      val inputBaseClasses = Map(
        MuiInputBase.ClassKey.input -> styleAToClassName(css.inputInput),
        MuiInputBase.ClassKey.root -> styleAToClassName(css.inputRoot)
      )

      val ariaOwns = if (isMenuOpen) "material-appbar" else ""

      def renderMenu() = {
        MuiMenu(
          anchorEl = state.anchorEl,
          anchorOrigin = Origin(vertical = "top", horizontal = "right"),
          transformOrigin = Origin(vertical = "top", horizontal = "right"),
          open = isMenuOpen,
          onClose = Some(handleProfileMenuClose),
        )(
          MuiMenuItem()(onClick ==> handleProfileMenuClose,
            "Profile"
          ),
          MuiMenuItem()(onClick ==> handleProfileMenuClose,
            "My account"
          )
        )
      }

      def renderMobileMenu() = {
        MuiMenu(
          anchorEl = state.mobileMoreAnchorEl,
          anchorOrigin = Origin(vertical = "top", horizontal = "right"),
          transformOrigin = Origin(vertical = "top", horizontal = "right"),
          open = isMobileMenuOpen,
          onClose = Some(handleMobileMenuClose),
        )(
          MuiMenuItem()(
            MuiIconButton(color = MuiIconButton.Color.inherit)(
              MuiBadge(badgeContent = Some(VdomNode(4)), color = MuiBadge.Color.secondary)(
                MuiMailIcon()
              )
            ),
            p("Messages")
          ),
          MuiMenuItem()(
            MuiIconButton(color = MuiIconButton.Color.inherit)(
              MuiBadge(badgeContent = Some(VdomNode(11)), color = MuiBadge.Color.secondary)(
                MuiNotificationsIcon()
              )
            ),
            p("Notifications")
          ),
          MuiMenuItem()(onClick ==> handleProfileMenuOpen,
            MuiIconButton(color = MuiIconButton.Color.inherit)(
              MuiAccountCircleIcon()
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
                  MuiMenuIcon()
                ),
                MuiTypography(variant = MuiTypography.Variant.h6, color = MuiTypography.Color.inherit, noWrap = true)(css.title,
                  "Material-UI"
                ),
                div(css.search,
                  div(css.searchIcon, MuiSearchIcon()),
                  MuiInputBase(classes = inputBaseClasses)(placeholder := "Search…")
                ),
                div(css.common.flexGrowOne),
                div(css.sectionDesktop,
                  MuiIconButton(color = MuiIconButton.Color.inherit)(
                    MuiBadge(badgeContent = Some(VdomNode(4)), color = MuiBadge.Color.secondary)(
                      MuiMailIcon()
                    )
                  ),
                  MuiIconButton(color = MuiIconButton.Color.inherit)(
                    MuiBadge(badgeContent = Some(VdomNode(17)), color = MuiBadge.Color.secondary)(
                      MuiNotificationsIcon()
                    )
                  ),
                  MuiIconButton(color = MuiIconButton.Color.inherit)(
                    aria.owns := ariaOwns,
                    aria.hasPopup := "true",
                    Attr("edge") := "end",
                    onClick ==> handleProfileMenuOpen,
                    MuiAccountCircleIcon()
                  )
                ),
                div(css.sectionMobile,
                  MuiIconButton(color = MuiIconButton.Color.inherit)(
                    aria.hasPopup := "true",
                    onClick ==> handleMobileMenuOpen,
                    MuiMoreVertIcon()
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
