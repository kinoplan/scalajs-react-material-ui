package io.kinoplan.demo.components.demos.Tabs

import scala.scalajs.js

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout, TabContainer}
import io.kinoplan.demo.styles.demos.Tabs.{DefaultScrollableTabsStyle, ScrollableTabsStyle}
import io.kinoplan.demo.utils.Helpers.StringExtended
import io.kinoplan.scalajs.react.material.ui.core.{MuiAppBar, MuiTab, MuiTabs}

object ScrollableTabsButtonAuto extends ScalaCssReactImplicits {
  case class Props(style: ScrollableTabsStyle)

  case class State(value: js.Any = 0) {
    def handleChange(value: js.Any) = copy(value = value)
    val numberValue = value.asInstanceOf[Int]

    val isOne = numberValue == 0
    val isTwo = numberValue == 1
    val isThree = numberValue == 2
    val isFour = numberValue == 3
    val isFive = numberValue == 4
    val isSix = numberValue == 5
    val isSeven = numberValue == 6
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChange: (ReactEvent, js.Any) => Callback = (_, value) => {
      t.modState(_.handleChange(value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Scrollable Tabs - Automatic Scroll Buttons")(
          div(css.root, css.rootPaper(Layout.isPaletteLight),
            MuiAppBar(position = MuiAppBar.Position.static, color = MuiAppBar.Color.default)(
              MuiTabs(
                onChange = handleChange,
                indicatorColor = MuiTabs.IndicatorColor.primary,
                textColor = MuiTabs.TextColor.primary,
                variant = MuiTabs.Variant.scrollable,
                scrollButtons = MuiTabs.ScrollButtons.auto
              )(
                value := state.value,
                MuiTab(label = "Item One".toVdom),
                MuiTab(label = "Item Two".toVdom),
                MuiTab(label = "Item Three".toVdom),
                MuiTab(label = "Item Four".toVdom),
                MuiTab(label = "Item Five".toVdom),
                MuiTab(label = "Item Six".toVdom),
                MuiTab(label = "Item Seven".toVdom)
              )
            ),
            TabContainer()("Item One").when(state.isOne),
            TabContainer()("Item Two").when(state.isTwo),
            TabContainer()("Item Three").when(state.isThree),
            TabContainer()("Item Four").when(state.isFour),
            TabContainer()("Item Five").when(state.isFive),
            TabContainer()("Item Six").when(state.isSix),
            TabContainer()("Item Seven").when(state.isSeven)
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("ScrollableTabsButtonAuto")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: ScrollableTabsStyle = DefaultScrollableTabsStyle) = component(Props(style))
}
