package io.kinoplan.demo.styles.labs.Alerts

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class AlertsStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import common.theme
  import dsl._

  val root = style(
    width(100.%%)
  )

  val margin = style(
    marginBottom((theme.spacing.unit * 2).px)
  )
}

object DefaultAlertsStyle extends AlertsStyle
