package io.kinoplan.demo.components.demos.Tabs

import scala.scalajs.js

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout, TabContainer}
import io.kinoplan.demo.styles.demos.Tabs.{DefaultFullWidthTabsStyle, FullWidthTabsStyle}
import io.kinoplan.demo.utils.Helpers.StringExtended
import io.kinoplan.scalajs.react.libs.external.reactSwipeableViews.components.ReactSwipeableViews
import io.kinoplan.scalajs.react.libs.external.reactSwipeableViews.mod.{AxisType, SwipeableViewsProps}
import io.kinoplan.scalajs.react.material.ui.core.{MuiAppBar, MuiTab, MuiTabs}
import io.kinoplan.scalajs.react.material.ui.core.styles.Direction

object FullWidthTabs extends ScalaCssReactImplicits {
  case class Props(style: FullWidthTabsStyle)

  case class State(value: js.Any = 0) {
    def handleChange(value: js.Any) = copy(value = value)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChange: (ReactEvent, js.Any) => Callback = (_, value) => {
      t.modState(_.handleChange(value))
    }

    def handleChangeIndex: (Double, Double) => Callback = (index, _) => {
      t.modState(_.handleChange(index))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val swipeableViewsAxis = if (css.theme.direction == Direction.rtl) {
        AxisType.`x-reverse`
      } else {
        AxisType.x
      }

      div(
        ComponentContainer("Fixed Tabs - Full width")(
          div(css.root, css.rootPaper(Layout.isPaletteLight),
            MuiAppBar(position = MuiAppBar.Position.static, color = MuiAppBar.Color.default)(
              MuiTabs(
                onChange = handleChange,
                indicatorColor = MuiTabs.IndicatorColor.primary,
                textColor = MuiTabs.TextColor.primary,
                variant = MuiTabs.Variant.fullWidth
              )(
                value := state.value,
                MuiTab(label = "Item One".toVdom),
                MuiTab(label = "Item Two".toVdom),
                MuiTab(label = "Item Three".toVdom)
              )
            ),
            ReactSwipeableViews.withProps(
              SwipeableViewsProps()
                .setAxis(swipeableViewsAxis)
                .setIndex(state.value.asInstanceOf[Double])
                .setOnChangeIndex(handleChangeIndex)
            )(
              TabContainer()("Item One"),
              TabContainer()("Item Two"),
              TabContainer()("Item Three")
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("FullWidthTabs")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: FullWidthTabsStyle = DefaultFullWidthTabsStyle) = component(Props(style))
}
