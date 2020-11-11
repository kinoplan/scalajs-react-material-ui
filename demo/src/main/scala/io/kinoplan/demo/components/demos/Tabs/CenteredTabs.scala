package io.kinoplan.demo.components.demos.Tabs

import scala.scalajs.js

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.demo.utils.Helpers.StringExtended
import io.kinoplan.scalajs.react.material.ui.core.{MuiPaper, MuiTab, MuiTabs}

object CenteredTabs extends ScalaCssReactImplicits {
  case class Props(style: CommonStyle)

  case class State(value: js.Any = 0) {
    def handleChange(value: js.Any) = copy(value = value)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChange: (ReactEvent, js.Any) => Callback = (_, value) => {
      t.modState(_.handleChange(value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Fixed Tabs - Centered")(
          MuiPaper()(css.flexGrowOne,
            MuiTabs(
              onChange = handleChange,
              indicatorColor = MuiTabs.IndicatorColor.primary,
              textColor = MuiTabs.TextColor.primary,
              centered = true
            )(
              value := state.value,
              MuiTab(label = "Item One".toVdom),
              MuiTab(label = "Item Two".toVdom),
              MuiTab(label = "Item Three".toVdom)
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("CenteredTabs")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: CommonStyle = DefaultCommonStyle) = component(Props(style))
}
