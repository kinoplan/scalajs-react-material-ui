package io.kinoplan.demo.components.wrappers

import japgolly.scalajs.react.vdom.Implicits.vdomNodeFromRawReactNode
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, Children, JsComponent, ScalaComponent}
import typings.reactDashSwipeableDashViews.reactDashSwipeableDashViewsMod.{AxisType, SwipeableViewsProps, default}

import scala.scalajs.js
import scala.scalajs.js.|

object SwipeableViews {
  val constructor = js.constructorOf[default]
  val SwipeableViewsFacade = JsComponent[SwipeableViewsProps, Children.Varargs, js.Object](constructor)

  case class Props(
    axis: AxisType,
    index: Int | Double,
    onChangeIndex: (Double, Double) => Unit,
    children: VdomNode*
  )

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomNode = {
      val swipeableViewsProps = SwipeableViewsProps(
        axis = props.axis,
        index = props.index,
        onChangeIndex = props.onChangeIndex
      )

      SwipeableViewsFacade(swipeableViewsProps)(props.children:_*).rawNode
    }
  }

  private val Component = ScalaComponent.builder[Props]("SwipeableViews")
    .renderBackend[Backend]
    .build

  def apply(
    axis: AxisType,
    index: Int | Double,
    onChangeIndex: (Double, Double) => Unit
  )(children: VdomNode*): VdomNode = Component(Props(axis, index, onChangeIndex, children:_*))
}
