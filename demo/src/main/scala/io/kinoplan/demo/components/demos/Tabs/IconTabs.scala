package io.kinoplan.demo.components.demos.Tabs

import scala.scalajs.js

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Tabs.{DefaultIconTabsStyle, IconTabsStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiPaper, MuiTab, MuiTabs}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object IconTabs extends ScalaCssReactImplicits {
  case class Props(style: IconTabsStyle)

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
        ComponentContainer("IconTabs")(
          MuiPaper(square = true)(css.root,
            MuiTabs(
              onChange = handleChange,
              variant = MuiTabs.Variant.fullWidth,
              indicatorColor = MuiTabs.IndicatorColor.primary,
              textColor = MuiTabs.TextColor.primary,
            )(
              value := state.value,
              MuiTab(icon = MuiIcons(MuiIconsModule.Phone)()()),
              MuiTab(icon = MuiIcons(MuiIconsModule.Favorite)()()),
              MuiTab(icon = MuiIcons(MuiIconsModule.PersonPin)()())
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("IconTabs")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: IconTabsStyle = DefaultIconTabsStyle) = component(Props(style))
}
