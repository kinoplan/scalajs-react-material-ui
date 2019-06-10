package io.kinoplan.demo.components.demos.Buttons

import io.kinoplan.demo.components.{ComponentContainer, TabContainer}
import io.kinoplan.demo.models.Buttons.Fab
import io.kinoplan.demo.styles.demos.Buttons.{DefaultFloatingActionButtonsZoomStyle, FloatingActionButtonsZoomStyle}
import io.kinoplan.scalajs.react.material.ui.core.styles.Direction
import io.kinoplan.scalajs.react.material.ui.core.{MuiAppBar, MuiFab, MuiTab, MuiTabs, MuiZoom, SwipeableViews}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiAddIcon, MuiEditIcon, MuiKeyboardArrowUpIcon}
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import scalacss.ScalaCssReact._

import scala.scalajs.js

object FloatingActionButtonZoom {
  case class Props(style: FloatingActionButtonsZoomStyle)

  case class State(value: js.Any = 0) {
    def handleChange(value: js.Any) = copy(value = value)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChange: (ReactEvent, js.Any) => Callback = (_, value) => {
      t.modState(_.handleChange(value))
    }

    def handleChangeIndex: (Int, Int, js.Object) => Callback = (index, _, _) => {
      t.modState(_.handleChange(index))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val fabs = List(
        Fab(MuiFab.Color.inherit, css.fab, MuiAddIcon()),
        Fab(MuiFab.Color.secondary, css.fab, MuiEditIcon()),
        Fab(MuiFab.Color.inherit, css.fabAndFabGreen, MuiKeyboardArrowUpIcon())
      )

      val enter = css.theme.transitions.duration.enteringScreen
      val exit = css.theme.transitions.duration.leavingScreen

      val transitionDuration = Map("enter" -> enter, "exit" -> exit)

      val swipeableViewsAxis = if (css.theme.direction == Direction.rtl.toString) {
        SwipeableViews.Axis.xReverse
      } else {
        SwipeableViews.Axis.x
      }

      div(
        ComponentContainer("Floating Action Button Zoom")(
          div(css.root,
            MuiAppBar(position = MuiAppBar.Position.static, color = MuiAppBar.Color.default)(
              MuiTabs(
                value = Some(state.value),
                onChange = handleChange,
                indicatorColor = MuiTabs.IndicatorColor.primary,
                textColor = MuiTabs.TextColor.primary,
                variant = MuiTabs.Variant.fullWidth
              )(
                MuiTab(label = Some(VdomNode("Item One"))),
                MuiTab(label = Some(VdomNode("Item Two"))),
                MuiTab(label = Some(VdomNode("Item Three")))
              )
            ),
            SwipeableViews(
              axis = swipeableViewsAxis,
              index = state.value.asInstanceOf[Int],
              onChangeIndex = handleChangeIndex
            )(
              TabContainer(dir = css.theme.direction)("Item One"),
              TabContainer(dir = css.theme.direction)("Item Two"),
              TabContainer(dir = css.theme.direction)("Item Three")
            ),
            fabs.zipWithIndex.toVdomArray { case (fab, index) =>
              MuiZoom(in = Some(state.value == index.asInstanceOf[js.Any]), timeout = Some(transitionDuration))(
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
