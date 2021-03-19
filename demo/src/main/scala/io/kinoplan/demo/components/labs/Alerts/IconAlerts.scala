package io.kinoplan.demo.components.labs.Alerts

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.labs.Alerts.{AlertsStyle, DefaultAlertsStyle}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}
import io.kinoplan.scalajs.react.material.ui.lab.MuiAlert
import io.kinoplan.scalajs.react.material.ui.lab.internal.IconMapping

object IconAlerts extends ScalaCssReactImplicits {
  case class Props(style: AlertsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      val successIconMapping = MuiIcons(MuiIconsModule.CheckCircleOutline)(fontSize = MuiIcons.FontSize.inherit).rawNode

      div(
        ComponentContainer("Icons")(
          div(css.root,
            MuiAlert(
              icon = VdomNode(MuiIcons(MuiIconsModule.Check)(fontSize = MuiIcons.FontSize.inherit).rawNode),
              severity = MuiAlert.Severity.success
            )(css.margin,
              "This is a success alert — check it out!"
            ),
            MuiAlert(iconMapping = IconMapping(success = successIconMapping))(css.margin,
              "This is a success alert — check it out!"
            ),
            MuiAlert(icon = VdomNode(false), severity = MuiAlert.Severity.success)(css.margin,
              "This is a success alert — check it out!"
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
