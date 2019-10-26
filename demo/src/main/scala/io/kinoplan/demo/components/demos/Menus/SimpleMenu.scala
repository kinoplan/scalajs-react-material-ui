package io.kinoplan.demo.components.demos.Menus

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiMenu, MuiMenuItem}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ReactEventFromHtml, ScalaComponent}
import org.scalajs.dom.raw.HTMLElement
import scalacss.ScalaCssReactImplicits

import scala.scalajs.js.JSConverters._

object SimpleMenu extends ScalaCssReactImplicits {
  case class State(anchorEl: Option[HTMLElement] = None) {
    val isMenuOpen = anchorEl.nonEmpty

    def handleClick(value: HTMLElement) = copy(anchorEl = Some(value))
    def handleClose = copy(anchorEl = None)
  }

  class Backend(t: BackendScope[Unit, State]) {
    def handleClick(e: ReactEventFromHtml): Callback = {
      val target = e.currentTarget

      t.modState(_.handleClick(target))
    }

    def handleClose: ReactEvent => Callback = _ => {
      t.modState(_.handleClose)
    }

    def render(state: State): VdomElement = {
      val ariaOwns = if (state.isMenuOpen) "simple-menu" else ""

      div(
        ComponentContainer("Simple Menu")(
          div(
            MuiButton()(
              aria.owns := ariaOwns,
              aria.hasPopup := "true",
              onClick ==> handleClick,
              "Open Menu"
            ),
            MuiMenu(anchorEl = state.anchorEl.orUndefined, open = state.isMenuOpen, onClose = handleClose)(
              id := "simple-menu",
              MuiMenuItem()(onClick ==> handleClose, "Profile"),
               MuiMenuItem()(onClick ==> handleClose, "My account"),
              MuiMenuItem()(onClick ==> handleClose, "Logout")
            ).when(state.isMenuOpen)
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Unit]("SimpleMenu")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply() = component()
}
