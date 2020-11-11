package io.kinoplan.demo.components.demos.Tooltips

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Tooltips.{DefaultInteractiveTooltipsStyle, InteractiveTooltipsStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiTooltip}

object InteractiveTooltips extends ScalaCssReactImplicits {
  case class Props(style: InteractiveTooltipsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Interactive")(
          div(
            MuiTooltip(title = "Add", interactive = true)(
              MuiButton()(css.button, "Interactive")
            ),
            MuiTooltip(title = "Add")(
              MuiButton()(css.button, "Non Interactive")
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("InteractiveTooltips")
    .renderBackend[Backend]
    .build

  def apply(style: InteractiveTooltipsStyle = DefaultInteractiveTooltipsStyle) = component(Props(style))
}
