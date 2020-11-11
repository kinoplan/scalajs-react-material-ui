package io.kinoplan.demo.components.demos.Tooltips

import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.all._

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiTooltip}

object DelayTooltips {
  private val component = ScalaComponent.builder[Unit]("DelayTooltips")
    .renderStatic(
      div(
        ComponentContainer("Showing and hiding")(
          MuiTooltip(title = "Add", enterDelay = 500, leaveDelay = 200)(
            MuiButton()("[500ms, 200ms]")
          )
        )
      )
    ).build

  def apply() = component()
}
