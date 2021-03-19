package io.kinoplan.demo.components.labs.Alerts

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.labs.Alerts.{AlertsStyle, DefaultAlertsStyle}
import io.kinoplan.scalajs.react.material.ui.lab.MuiAlert

object FilledAlerts extends ScalaCssReactImplicits {
  case class Props(style: AlertsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Outlined alerts")(
          div(css.root,
            MuiAlert(severity = MuiAlert.Severity.error, variant = MuiAlert.Variant.filled)(css.margin,
              "This is an error alert — check it out!"
            ),
            MuiAlert(severity = MuiAlert.Severity.warning, variant = MuiAlert.Variant.filled)(css.margin,
              "This is an warning alert — check it out!"
            ),
            MuiAlert(severity = MuiAlert.Severity.info, variant = MuiAlert.Variant.filled)(css.margin,
              "This is an info alert — check it out!"
            ),
            MuiAlert(severity = MuiAlert.Severity.success, variant = MuiAlert.Variant.filled)(css.margin,
              "This is an success alert — check it out!"
            )
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
