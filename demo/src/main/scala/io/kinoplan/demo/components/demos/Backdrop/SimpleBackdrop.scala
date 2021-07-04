package io.kinoplan.demo.components.demos.Backdrop

import japgolly.scalajs.react.{BackendScope, Callback, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Backdrop.{DefaultSimpleBackdropStyle, SimpleBackdropStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiBackdrop, MuiButton, MuiCircularProgress}

object SimpleBackdrop extends ScalaCssReactImplicits {
  case class Props(style: SimpleBackdropStyle)

  case class State(open: Boolean = false) {
    def setOpen(open: Boolean) = copy(open = open)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleClose: Callback = t.modState(_.setOpen(false))

    def handleToggle: Callback = t.modState(state => state.setOpen(!state.open))

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Simple Backdrop")(
          div(
            MuiButton(variant = MuiButton.Variant.outlined, color = MuiButton.Color.primary)(
              onClick --> handleToggle,
              "Show backdrop"
            ),
            MuiBackdrop(open = state.open)(css.backdrop,
              onClick --> handleClose,
              MuiCircularProgress(color = MuiCircularProgress.Color.inherit)()
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: SimpleBackdropStyle = DefaultSimpleBackdropStyle) = component(Props(style))
}
