package io.kinoplan.demo.components.demos.Tabs

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.utils.Helpers.StringExtended
import io.kinoplan.scalajs.react.material.ui.core.{MuiPaper, MuiTab, MuiTabs}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}

import scala.scalajs.js

object DisabledTabs {
  case class State(value: js.Any = 2) {
    def handleChange(value: js.Any) = copy(value = value)
  }

  class Backend(t: BackendScope[Unit, State]) {
    def handleChange: (ReactEvent, js.Any) => Callback = (_, value) => {
      t.modState(_.handleChange(value))
    }

    def render(state: State): VdomElement = {
      div(
        ComponentContainer("Disabled Tab")(
          MuiPaper(square = true)(
            MuiTabs(
              indicatorColor = MuiTabs.IndicatorColor.primary,
              textColor = MuiTabs.TextColor.primary,
              onChange = handleChange
            )(
              value := state.value,
              MuiTab(label = "Active".toVdom),
              MuiTab(label = "Disabled".toVdom)(disabled := true),
              MuiTab(label = "Active".toVdom)
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Unit]("DisabledTabs")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply() = component()
}
