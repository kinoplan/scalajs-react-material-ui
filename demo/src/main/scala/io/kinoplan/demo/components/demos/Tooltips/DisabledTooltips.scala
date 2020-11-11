package io.kinoplan.demo.components.demos.Tooltips

import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiTooltip}

object DisabledTooltips {
  private val component = ScalaComponent.builder[Unit]("DisabledTooltips")
    .renderStatic(
      div(
        ComponentContainer("Disabled Elements")(
          MuiTooltip(title = "You don't have permission to do this")(
            span(
              MuiButton()(disabled := true, "A Disabled Button")
            )
          )
        )
      )
    ).build

  def apply() = component()
}
