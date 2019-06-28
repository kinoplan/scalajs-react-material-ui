package io.kinoplan.demo.components.demos.Menus

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.utils.props.MuiPaperProps
import io.kinoplan.scalajs.react.material.ui.core.{MuiIconButton, MuiMenu, MuiMenuItem}
import io.kinoplan.scalajs.react.material.ui.icons.MuiMoreVertIcon
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ReactEventFromHtml, ScalaComponent}
import org.scalajs.dom.raw.HTMLElement
import scalacss.ScalaCssReactImplicits

import scala.scalajs.js

object LongMenu extends ScalaCssReactImplicits {
  case class State(anchorEl: Option[HTMLElement] = None) {
    val isOpen = anchorEl.nonEmpty

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

    val ITEM_HEIGHT = 48

    val options = List(
      "None",
      "Atria",
      "Callisto",
      "Dione",
      "Ganymede",
      "Hangouts Call",
      "Luna",
      "Oberon",
      "Phobos",
      "Pyxis",
      "Sedna",
      "Titania",
      "Triton",
      "Umbriel"
    )

    def render(state: State): VdomElement = {
      val ariaOwns = if (state.isOpen) "long-menu" else ""

      val paperPropsStyle = js.Dictionary("maxHeight" -> s"${ITEM_HEIGHT * 4.5}px", "width" -> "200px")

      div(
        ComponentContainer("Max height menus")(
          div(
            MuiIconButton()(
              aria.label := "More",
              aria.owns := ariaOwns,
              aria.hasPopup := "true",
              onClick ==> handleClick,
              MuiMoreVertIcon()
            ),
            MuiMenu(
              anchorEl = state.anchorEl,
              open = state.isOpen,
              onClose = Some(handleClose),
              PaperProps = MuiPaperProps(style = paperPropsStyle)
            )(
              id := "long-menu",
              options.toVdomArray { option =>
                MuiMenuItem()(
                  Attr("key") := option,
                  selected := option == "Pyxis",
                  onClick ==> handleClose,
                  option
                )
              }
            ).when(state.isOpen)
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Unit]("LongMenu")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply() = component()
}
