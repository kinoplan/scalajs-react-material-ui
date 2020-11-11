package io.kinoplan.demo.components.demos.Tabs

import scala.scalajs.js

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout}
import io.kinoplan.demo.styles.demos.Tabs.{CustomizedTabsStyle, DefaultCustomizedTabsStyle}
import io.kinoplan.demo.utils.Helpers.{StringExtended, _}
import io.kinoplan.scalajs.react.material.ui.core.{MuiTab, MuiTabs, MuiTypography}

object CustomizedTabs extends ScalaCssReactImplicits {
  case class Props(style: CustomizedTabsStyle)

  case class State(value: js.Any = 0) {
    def handleChange(value: js.Any) = copy(value = value)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChange: (ReactEvent, js.Any) => Callback = (_, value) => {
      t.modState(_.handleChange(value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val tabsClasses = Map(
        MuiTabs.ClassKey.root -> styleAToClassName(css.tabsRoot),
        MuiTabs.ClassKey.indicator -> styleAToClassName(css.tabsIndicator)
      )

      val tabClasses = Map(
        MuiTab.ClassKey.root -> styleAToClassName(css.tabRoot),
        MuiTab.ClassKey.selected -> styleAToClassName(css.tabSelected)
      )

      div(
        ComponentContainer("Customized Tabs")(
          div(css.root, css.rootPaper(Layout.isPaletteLight),
            MuiTabs(onChange = handleChange, classes = tabsClasses)(
              value := state.value,
              MuiTab(disableRipple = true, classes = tabClasses, label = "Tab 1".toVdom),
              MuiTab(disableRipple = true, classes = tabClasses, label = "Tab 2".toVdom),
              MuiTab(disableRipple = true, classes = tabClasses, label = "Tab 3".toVdom)
            ),
            MuiTypography()(css.typography, "Ant Design UI powered by Material-UI")
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("CustomizedTabs")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: CustomizedTabsStyle = DefaultCustomizedTabsStyle) = component(Props(style))
}
