package io.kinoplan.demo.components.demos.Tabs

import scala.scalajs.js

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout, TabContainer}
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.demo.utils.Helpers.StringExtended
import io.kinoplan.scalajs.react.material.ui.core.{MuiAppBar, MuiNoSsr, MuiTab, MuiTabs}

object NavTabs extends ScalaCssReactImplicits {
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

    def LinkTab(labelValue: String, hrefValue: String) = {
      MuiTab(component = "a", label = labelValue.toVdom)(
        onClick ==> (event => Callback {event.preventDefault()}),
        href := hrefValue
      )
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Nav Tabs")(
          MuiNoSsr()(
            div(css.flexGrowOne, css.paper(Layout.isPaletteLight),
              MuiAppBar(position = MuiAppBar.Position.static)(
                MuiTabs(variant = MuiTabs.Variant.fullWidth, onChange = handleChange)(
                  value := state.value,
                  LinkTab("Page One", "page1"),
                  LinkTab("Page Two", "page2"),
                  LinkTab("Page Three", "page3")
                )
              ),
              TabContainer()("Page One").when(state.isOne),
              TabContainer()("Page Two").when(state.isTwo),
              TabContainer()("Page Three").when(state.isThree)
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("NavTabs")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: CommonStyle = DefaultCommonStyle) = component(Props(style))
}
