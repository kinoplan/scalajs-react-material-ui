package io.kinoplan.demo.components.demos.Snackbars

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.utils.props.MuiContentProps
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiFade, MuiSnackbar}

object FadeSnackbar extends ScalaCssReactImplicits {
  case class State(open: Boolean = false) {
    def handleClick = copy(open = true)

    def handleClose = copy(open = false)
  }

  class Backend(t: BackendScope[Unit, State]) {
    def handleClick = t.modState(_.handleClick)

    def handleClose: (ReactEvent, String) => Callback = (_, _) => {
      t.modState(_.handleClose)
    }

    def render(state: State): VdomElement = {
      div(
        ComponentContainer("Change Transition")(
          div(
            MuiButton()(onClick --> handleClick, "Open with Fade Transition"),
            MuiSnackbar(
              open = state.open,
              onClose = handleClose,
              TransitionComponent = MuiFade.RawComponent,
              ContentProps = MuiContentProps(ariaDescribedby = "message-id"),
              message = span(id := "message-id", "I love snacks")
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Unit]("FadeSnackbar")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply() = component()
}
