package io.kinoplan.demo.components.demos.Snackbars

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.components.demos.Snackbars.wrappers.MySnackbarContentWrapper
import io.kinoplan.demo.styles.demos.Snackbars.{CustomizedSnackbarsStyle, DefaultCustomizedSnackbarsStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiSnackbar}
import io.kinoplan.scalajs.react.material.ui.core.internal.Origin

object CustomizedSnackbars extends ScalaCssReactImplicits {
  case class Props(style: CustomizedSnackbarsStyle)

  case class State(open: Boolean = false) {
    def handleClose = copy(open = false)

    def handleClick = copy(open = true)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleClick = t.modState(_.handleClick)

    def handleCloseClick: Callback = t.modState(_.handleClose)

    def handleClose: (ReactEvent, String) => Callback = (_, reason) => {
      handleCloseClick.when_(reason != "clickaway")
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Customized Snackbars")(
          div(
            MuiButton()(css.snackbar, onClick --> handleClick, "Open success snackbar"),
            MuiSnackbar(
              open = state.open,
              autoHideDuration = 6000,
              onClose = handleClose,
              anchorOrigin = Origin(vertical = "bottom", horizontal = "left")
            )(
              MySnackbarContentWrapper(
                onCloseClick = handleCloseClick,
                variant = "success",
                message = "This is a success message!"
              )
            ),
            wrappers.MySnackbarContentWrapper(
              variant = "error",
              className = css.snackbar,
              message = "This is an error message!"
            ),
            wrappers.MySnackbarContentWrapper(
              variant = "warning",
              className = css.snackbar,
              message = "This is a warning message!"
            ),
            wrappers.MySnackbarContentWrapper(
              variant = "info",
              className = css.snackbar,
              message = "This is an information message!"
            ),
            wrappers.MySnackbarContentWrapper(
              variant = "success",
              className = css.snackbar,
              message = "This is a success message!"
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("CustomizedSnackbars")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: CustomizedSnackbarsStyle = DefaultCustomizedSnackbarsStyle) = component(Props(style))
}
