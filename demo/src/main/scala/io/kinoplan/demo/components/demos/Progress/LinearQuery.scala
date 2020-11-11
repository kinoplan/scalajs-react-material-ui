package io.kinoplan.demo.components.demos.Progress

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.MuiLinearProgress

object LinearQuery extends ScalaCssReactImplicits {
  case class Props(style: CommonStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Linear Query")(
          div(css.flexGrowOne,
            MuiLinearProgress(variant = MuiLinearProgress.Variant.query),
            br,
            MuiLinearProgress(variant = MuiLinearProgress.Variant.query, color = MuiLinearProgress.Color.secondary)
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("LinearQuery")
    .renderBackend[Backend]
    .build

  def apply(style: CommonStyle = DefaultCommonStyle) = component(Props(style))
}
