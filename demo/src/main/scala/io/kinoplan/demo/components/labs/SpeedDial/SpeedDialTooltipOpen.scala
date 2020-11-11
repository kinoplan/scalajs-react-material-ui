package io.kinoplan.demo.components.labs.SpeedDial

import scala.scalajs.js

import japgolly.scalajs.react.{BackendScope, Callback, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.models.SpeedDial.Action
import io.kinoplan.demo.styles.labs.SpeedDial.{DefaultSpeedDialStyle, SpeedDialStyle}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}
import io.kinoplan.scalajs.react.material.ui.lab.{MuiSpeedDial, MuiSpeedDialAction, MuiSpeedDialIcon}

object SpeedDialTooltipOpen extends ScalaCssReactImplicits {
  case class Props(style: SpeedDialStyle)

  case class State(open: Boolean = false, hidden: Boolean = false) {
    def handleVisibility = copy(open = false, hidden = !hidden)

    def handleClick = copy(open = !open)

    def handleOpen = if (!hidden) copy(open = true) else this

    def handleClose = copy(open = false)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleVisibility = t.modState(_.handleVisibility)

    def handleClick = t.modState(_.handleClick)

    def handleOpen = t.modState(_.handleOpen)

    def handleClose = t.modState(_.handleClose)

    def onClose: (js.Object, String) => Callback = (_, _) => handleClose

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Custom close icon")(
          div(css.root,
            MuiButton()(onClick --> handleVisibility, "Persistent action tooltips"),
            MuiSpeedDial(
              ariaLabel = "SpeedDial tooltip example",
              icon = MuiSpeedDialIcon(openIcon = MuiIcons(MuiIconsModule.Edit)()())().rawElement,
              open = state.open,
              onClose = onClose
            )(css.speedDial,
              hidden := state.hidden,
              onBlur --> handleClose,
              onClick --> handleClick,
              onFocus --> handleOpen,
              onMouseEnter --> handleOpen,
              onMouseLeave --> handleClose,
              Action.commons.toVdomArray { action =>
                MuiSpeedDialAction(
                  icon = action.icon,
                  tooltipTitle = action.name,
                  tooltipOpen = true
                )(Attr("key") := action.name,
                  onClick --> handleClick
                )
              }
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SpeedDialTooltipOpen")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: SpeedDialStyle = DefaultSpeedDialStyle) = component(Props(style))
}
