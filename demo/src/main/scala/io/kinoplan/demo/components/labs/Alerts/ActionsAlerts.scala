package io.kinoplan.demo.components.labs.Alerts

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.labs.Alerts.{AlertsStyle, DefaultAlertsStyle}
import io.kinoplan.scalajs.react.material.ui.core.MuiButton
import io.kinoplan.scalajs.react.material.ui.lab.MuiAlert

object ActionsAlerts extends ScalaCssReactImplicits {
  case class Props(style: AlertsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def onClose: ReactEvent => Callback = _ => Callback.empty

    def render(props: Props): VdomElement = {
      val css = props.style

      val action = MuiButton(color = MuiButton.Color.inherit, size = MuiButton.Size.small)("UNDO")

      div(
        ComponentContainer("Actions")(
          div(css.root,
            MuiAlert(onClose = onClose)(css.margin, "This is a success alert — check it out!"),
            MuiAlert(action = action)(css.margin, "This is a success alert — check it out!")
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]
    .renderBackend[Backend]
    .build

  def apply(style: AlertsStyle = DefaultAlertsStyle) = component(Props(style))
}
