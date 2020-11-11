package io.kinoplan.demo.components.demos.Progress

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.MuiLinearProgress

object LinearIndeterminate extends ScalaCssReactImplicits {
  case class Props(style: CommonStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Linear Indeterminate")(
          div(css.flexGrowOne,
            MuiLinearProgress(),
            br,
            MuiLinearProgress(color = MuiLinearProgress.Color.secondary)
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("LinearIndeterminate")
    .renderBackend[Backend]
    .build

  def apply(style: CommonStyle = DefaultCommonStyle) = component(Props(style))
}
