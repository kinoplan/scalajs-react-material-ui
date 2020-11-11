package io.kinoplan.demo.components.demos.Tabs

import scala.scalajs.js

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout, TabContainer}
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.demo.utils.Helpers.StringExtended
import io.kinoplan.scalajs.react.material.ui.core.{MuiAppBar, MuiTab, MuiTabs}

object SimpleTabs extends ScalaCssReactImplicits {
  case class Props(style: CommonStyle)

  case class State(value: js.Any = 0) {
    def handleChange(value: js.Any) = copy(value = value)
    val numberValue = value.asInstanceOf[Int]

    val isOne = numberValue == 0
    val isTwo = numberValue == 1
    val isThree = numberValue == 2
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChange: (ReactEvent, js.Any) => Callback = (_, value) => {
      t.modState(_.handleChange(value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Simple Tabs")(
          div(css.flexGrowOne, css.paper(Layout.isPaletteLight),
            MuiAppBar(position = MuiAppBar.Position.static)(
              MuiTabs(onChange = handleChange)(
                value := state.value,
                MuiTab(label = "Item One".toVdom),
                MuiTab(label = "Item Two".toVdom),
                MuiTab(label = "Item Three".toVdom)
              )
            ),
            TabContainer()("Item One").when(state.isOne),
            TabContainer()("Item Two").when(state.isTwo),
            TabContainer()("Item Three").when(state.isThree)
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SimpleTabs")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: CommonStyle = DefaultCommonStyle) = component(Props(style))
}
