package io.kinoplan.demo.components.demos.Menus

import scala.scalajs.js.JSConverters._

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ReactEventFromHtml, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import org.scalajs.dom.raw.HTMLElement
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiMenu, MuiMenuItem}

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

    def handleClickClose: Callback = t.modState(_.handleClose)

    def onClose: (ReactEvent, String) => Callback = (_, _) => {
      handleClickClose
    }

    def render(state: State): VdomElement = {
      val ariaOwns = if (state.isMenuOpen) "simple-menu" else ""

      div(
        ComponentContainer("Simple Menu")(
          div(
            MuiButton()(
              aria.owns := ariaOwns,
              aria.haspopup.`true`,
              onClick ==> handleClick,
              "Open Menu"
            ),
            MuiMenu(anchorEl = state.anchorEl.orUndefined, open = state.isMenuOpen, onClose = onClose)(
              id := "simple-menu",
              MuiMenuItem()(onClick --> handleClickClose, "Profile"),
               MuiMenuItem()(onClick --> handleClickClose, "My account"),
              MuiMenuItem()(onClick --> handleClickClose, "Logout")
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
