package io.kinoplan.demo.components.demos.Snackbars

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Snackbars.{DefaultSimpleSnackbarStyle, SimpleSnackbarStyle}
import io.kinoplan.demo.utils.props.MuiContentProps
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiIconButton, MuiSnackbar}
import io.kinoplan.scalajs.react.material.ui.core.internal.Origin
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object SimpleSnackbar extends ScalaCssReactImplicits {
  case class Props(style: SimpleSnackbarStyle)

  case class State(open: Boolean = false) {
    def handleClick = copy(open = true)

    def handleClose = copy(open = false)
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
        ComponentContainer("Simple")(
          div(
            MuiButton()(onClick --> handleClick, "Open simple snackbar"),
            MuiSnackbar(
              open = state.open,
              autoHideDuration = 6000,
              onClose = handleClose,
              anchorOrigin = Origin(vertical = "bottom", horizontal = "left"),
              ContentProps = MuiContentProps(ariaDescribedby = "message-id"),
              message = span(id := "message-id", "Note archived"),
              action = VdomArray(
                MuiButton(color = MuiButton.Color.secondary, size = MuiButton.Size.small)(
                  Attr("key") := "undo",
                  onClick --> handleCloseClick,
                  "UNDO"
                ),
                MuiIconButton(color = MuiIconButton.Color.inherit)(css.close,
                  Attr("key") := "close",
                  aria.label := "Close",
                  onClick --> handleCloseClick,
                  MuiIcons(MuiIconsModule.Close)()
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SimpleSnackbar")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: SimpleSnackbarStyle = DefaultSimpleSnackbarStyle) = component(Props(style))
}
