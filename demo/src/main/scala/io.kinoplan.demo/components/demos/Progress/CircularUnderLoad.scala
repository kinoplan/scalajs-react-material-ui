package io.kinoplan.demo.components.demos.Progress

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.scalajs.react.material.ui.core.MuiCircularProgress
import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.all.div

object CircularUnderLoad {
  private val component = ScalaComponent.builder[Unit]("CircularUnderLoad")
    .renderStatic(
      div(
        ComponentContainer("Circular Under Load")(
          MuiCircularProgress(disableShrink = true)
        )
      )
    )
    .build

  def apply() = component()
}
