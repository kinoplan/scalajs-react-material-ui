package io.kinoplan.demo.components.demos.Progress

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Progress.{CircularProgressStyle, DefaultCircularProgressStyle}
import io.kinoplan.scalajs.react.material.ui.core.MuiCircularProgress

object CircularIndeterminate extends ScalaCssReactImplicits {
  case class Props(style: CircularProgressStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Circular Indeterminate")(
          div(
            MuiCircularProgress()(css.progress),
            MuiCircularProgress(color = MuiCircularProgress.Color.secondary)(css.progress)
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("CircularIndeterminate")
    .renderBackend[Backend]
    .build

  def apply(style: CircularProgressStyle = DefaultCircularProgressStyle) = component(Props(style))
}
