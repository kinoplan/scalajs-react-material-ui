package io.kinoplan.demo.components.demos.Tooltips

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiFade, MuiTooltip, MuiZoom}
import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.all._

import scala.scalajs.js

object TransitionsTooltips {
  private val component = ScalaComponent.builder[Unit]("TransitionsTooltips")
    .renderStatic(
      div(
        ComponentContainer("Transitions")(
          div(
            MuiTooltip(title = "Add")(
              MuiButton()("Grow")
            ),
            MuiTooltip(
              TransitionComponent = MuiFade.RawComponent,
              TransitionProps = js.Dynamic.literal(timeout = 600),
              title = "Add"
            )(
              MuiButton()("Fade")
            ),
            MuiTooltip(TransitionComponent = MuiZoom.RawComponent, title = "Add")(
              MuiButton()("Zoom")
            )
          )
        )
      )
    ).build

  def apply() = component()
}
