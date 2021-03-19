package io.kinoplan.demo.components.labs.Alerts

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.labs.Alerts.{AlertsStyle, DefaultAlertsStyle}
import io.kinoplan.scalajs.react.material.ui.lab.{MuiAlert, MuiAlertTitle}

object DescriptionAlerts extends ScalaCssReactImplicits {
  case class Props(style: AlertsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Description")(
          div(css.root,
            MuiAlert(severity = MuiAlert.Severity.error)(css.margin,
              MuiAlertTitle()("Error"),
              "This is an error alert — ", strong("check it out!")
            ),
            MuiAlert(severity = MuiAlert.Severity.warning)(css.margin,
              MuiAlertTitle()("Warning"),
              "This is an warning alert — ", strong("check it out!")
            ),
            MuiAlert(severity = MuiAlert.Severity.info)(css.margin,
              MuiAlertTitle()("Info"),
              "This is an info alert — ", strong("check it out!")
            ),
            MuiAlert(severity = MuiAlert.Severity.success)(css.margin,
              MuiAlertTitle()("Success"),
              "This is an success alert — ", strong("check it out!")
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
