package io.kinoplan.demo.components.demos.Tabs

import scala.scalajs.js

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout, TabContainer}
import io.kinoplan.demo.styles.demos.Tabs.{DefaultScrollableTabsStyle, ScrollableTabsStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiAppBar, MuiTab, MuiTabs}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object ScrollableTabsButtonPrevent extends ScalaCssReactImplicits {
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
        ComponentContainer("Scrollable Tabs - Prevent Scroll Buttons")(
          div(css.root, css.rootPaper(Layout.isPaletteLight),
            MuiAppBar(position = MuiAppBar.Position.static)(
              MuiTabs(
                onChange = handleChange,
                variant = MuiTabs.Variant.scrollable,
                scrollButtons = MuiTabs.ScrollButtons.off
              )(
                value := state.value,
                MuiTab(icon = MuiIcons(MuiIconsModule.Phone)()()),
                MuiTab(icon = MuiIcons(MuiIconsModule.Favorite)()()),
                MuiTab(icon = MuiIcons(MuiIconsModule.PersonPin)()()),
                MuiTab(icon = MuiIcons(MuiIconsModule.Help)()()),
                MuiTab(icon = MuiIcons(MuiIconsModule.ShoppingBasket)()()),
                MuiTab(icon = MuiIcons(MuiIconsModule.ThumbDown)()()),
                MuiTab(icon = MuiIcons(MuiIconsModule.ThumbUp)()())
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

  private val component = ScalaComponent.builder[Props]("ScrollableTabsButtonPrevent")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: ScrollableTabsStyle = DefaultScrollableTabsStyle) = component(Props(style))
}
