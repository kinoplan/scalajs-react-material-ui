package io.kinoplan.demo.components.demos.Menus

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ReactEventFromHtml, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import org.scalajs.dom.raw.HTMLElement
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.utils.props.MuiPaperProps
import io.kinoplan.scalajs.react.material.ui.core.{MuiIconButton, MuiMenu, MuiMenuItem}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

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

    def handleClickClose: Callback = t.modState(_.handleClose)

    def onClose: (ReactEvent, String) => Callback = (_, _) => {
      handleClickClose
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
              aria.haspopup.`true`,
              onClick ==> handleClick,
              MuiIcons(MuiIconsModule.MoreVert)()
            ),
            MuiMenu(
              anchorEl = state.anchorEl.orUndefined,
              open = state.isOpen,
              onClose = onClose,
              PaperProps = MuiPaperProps(style = paperPropsStyle)
            )(
              id := "long-menu",
              options.toVdomArray { option =>
                MuiMenuItem()(
                  Attr("key") := option,
                  selected := option == "Pyxis",
                  onClick --> handleClickClose,
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
