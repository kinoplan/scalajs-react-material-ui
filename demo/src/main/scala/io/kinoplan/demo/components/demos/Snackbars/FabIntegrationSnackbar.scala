package io.kinoplan.demo.components.demos.Snackbars

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout}
import io.kinoplan.demo.styles.demos.Snackbars.{DefaultFabIntegrationSnackbarStyle, FabIntegrationSnackbarStyle}
import io.kinoplan.demo.utils.props.MuiContentProps
import io.kinoplan.scalajs.react.material.ui.core.{MuiAppBar, MuiButton, MuiFab, MuiIconButton, MuiSnackbar, MuiToolbar, MuiTypography}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object FabIntegrationSnackbar extends ScalaCssReactImplicits {
  case class Props(style: FabIntegrationSnackbarStyle)

  case class State(open: Boolean = false) {
    def handleClose = copy(open = false)

    def handleClick = copy(open = true)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleClick = t.modState(_.handleClick)

    def handleCloseClick: Callback = t.modState(_.handleClose)

    def handleClose: (ReactEvent, String) => Callback = (_, _) => {
      handleCloseClick
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Don't block the floating action button")(
          div(css.root,
            MuiButton()(css.button, onClick --> handleClick, "Open snackbar"),
            div(css.appFrame, css.appFramePaper(Layout.isPaletteLight),
              MuiAppBar(position = MuiAppBar.Position.static, color = MuiAppBar.Color.primary)(
                MuiToolbar()(
                  MuiIconButton(color = MuiIconButton.Color.inherit)(css.menuButton,
                    aria.label := "Menu",
                    MuiIcons(MuiIconsModule.Menu)()
                  ),
                  MuiTypography(variant = MuiTypography.Variant.h6, color = MuiTypography.Color.inherit)(
                    "Out of my way!"
                  )
                )
              ),
              MuiFab(color = MuiFab.Color.secondary)(css.fab, if (state.open) css.fabMoveUp else css.fabMoveDown,
                MuiIcons(MuiIconsModule.Add)()
              ),
              MuiSnackbar(
                open = state.open,
                autoHideDuration = 4000,
                onClose = handleClose,
                ContentProps = MuiContentProps(
                  ariaDescribedby = "snackbar-fab-message-id",
                  className = css.snackbarContent.htmlClass
                ),
                message = span(id := "snackbar-fab-message-id", "Archived"),
                action = VdomNode(MuiButton(color = MuiButton.Color.inherit, size = MuiButton.Size.small)(
                  onClick --> handleCloseClick,
                  "Undo"
                ).rawNode)
              )(css.snackbar)
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("FabIntegrationSnackbar")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: FabIntegrationSnackbarStyle = DefaultFabIntegrationSnackbarStyle) = component(Props(style))
}
