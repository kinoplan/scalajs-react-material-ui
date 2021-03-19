package io.kinoplan.demo.components.labs.Alerts

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.labs.Alerts.{AlertsStyle, DefaultAlertsStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiCollapse, MuiIconButton}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}
import io.kinoplan.scalajs.react.material.ui.lab.MuiAlert

object TransitionAlerts extends ScalaCssReactImplicits {
  case class Props(style: AlertsStyle)

  case class State(open: Boolean = true) {
    def setOpen(open: Boolean) = copy(open = open)
  }

  class Backend(t: BackendScope[Props, State]) {
    def onClose: ReactEvent => Callback = _ => Callback.empty

    def setOpen(value: Boolean): Callback = t.modState(_.setOpen(value))

    def render(props: Props, state: State): VdomElement = {
      val css = props.style
      val open = state.open

      val action = VdomNode(
        MuiIconButton(color = MuiIconButton.Color.inherit, size = MuiIconButton.Size.small)(
          aria.label := "close",
          onClick --> setOpen(false),
          MuiIcons(MuiIconsModule.Close)(fontSize = MuiIcons.FontSize.inherit)
        ).rawNode
      )

      div(
        ComponentContainer("Transition")(
          div(css.root,
            MuiCollapse(in = open)(
              MuiAlert(action = action)(css.margin,
                "Close me!"
              )
            ),
            MuiButton(variant = MuiButton.Variant.outlined)(css.margin,
              disabled := open,
              onClick --> setOpen(true),
              "Re-open"
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

  def apply(style: AlertsStyle = DefaultAlertsStyle) = component(Props(style))
}

