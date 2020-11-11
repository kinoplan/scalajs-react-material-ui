package io.kinoplan.demo.components.demos.Buttons

import scala.scalajs.js

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.{ComponentContainer, Layout, TabContainer}
import io.kinoplan.demo.models.Buttons.Fab
import io.kinoplan.demo.styles.demos.Buttons.{DefaultFloatingActionButtonsZoomStyle, FloatingActionButtonsZoomStyle}
import io.kinoplan.demo.utils.Helpers.StringExtended
import io.kinoplan.scalajs.react.libs.external.reactSwipeableViews.components.ReactSwipeableViews
import io.kinoplan.scalajs.react.libs.external.reactSwipeableViews.mod.{AxisType, SwipeableViewsProps}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.core.styles.Direction
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object FloatingActionButtonZoom extends ScalaCssReactImplicits {
  case class Props(style: FloatingActionButtonsZoomStyle)

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

      val fabs = List(
        Fab(MuiFab.Color.inherit, css.fab, MuiIcons(MuiIconsModule.Add)()),
        Fab(MuiFab.Color.secondary, css.fab, MuiIcons(MuiIconsModule.Edit)()),
        Fab(MuiFab.Color.inherit, css.fabAndFabGreen, MuiIcons(MuiIconsModule.KeyboardArrowUp)())
      )

      val enter = css.theme.transitions.duration.enteringScreen
      val exit = css.theme.transitions.duration.leavingScreen

      val transitionDuration = js.Dynamic.literal(enter = enter, exit = exit)

      val swipeableViewsAxis = if (css.theme.direction == Direction.rtl) {
        AxisType.`x-reverse`
      } else {
        AxisType.x
      }

      div(
        ComponentContainer("Floating Action Button Zoom")(
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
            ),
            fabs.zipWithIndex.toVdomArray { case (fab, index) =>
              MuiZoom(in = state.value == index.asInstanceOf[js.Any], timeout = transitionDuration)(
                style := js.Dictionary(
                  "transitionDelay" -> s"${if (state.value == index.asInstanceOf[js.Any]) exit else 0}ms"
                ),
                Attr("key") := index,
                MuiFab(color = fab.color)(fab.className, fab.icon)
              )
            }
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("FloatingActionButtonZoom")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: FloatingActionButtonsZoomStyle = DefaultFloatingActionButtonsZoomStyle) = component(Props(style))
}
