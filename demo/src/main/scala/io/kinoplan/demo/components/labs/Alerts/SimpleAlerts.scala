package io.kinoplan.demo.components.labs.Alerts

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.labs.Alerts.{AlertsStyle, DefaultAlertsStyle}
import io.kinoplan.scalajs.react.material.ui.lab.MuiAlert

object SimpleAlerts extends ScalaCssReactImplicits {
  case class Props(style: AlertsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Simple alerts")(
          div(css.root,
            MuiAlert(severity = MuiAlert.Severity.error)(css.margin, "This is an error alert — check it out!"),
            MuiAlert(severity = MuiAlert.Severity.warning)(css.margin, "This is an warning alert — check it out!"),
            MuiAlert(severity = MuiAlert.Severity.info)(css.margin, "This is an info alert — check it out!"),
            MuiAlert(severity = MuiAlert.Severity.success)(css.margin, "This is an success alert — check it out!")
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
