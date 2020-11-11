package io.kinoplan.demo.components.labs.Slider

import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.labs.Slider.{DefaultVerticalSliderStyle, VerticalSliderStyle}
import io.kinoplan.demo.utils.Helpers.styleAToClassName
import io.kinoplan.scalajs.react.material.ui.lab.MuiSlider

object VerticalSlider extends ScalaCssReactImplicits {
  case class Props(style: VerticalSliderStyle)

  case class State(value: Double = 50) {
    def handleChange(value: Double) = copy(value = value)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChange: (ReactEvent, Double) => Callback = (_, value) => {
      t.modState(_.handleChange(value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val sliderClasses = Map(
        MuiSlider.ClassKey.container -> styleAToClassName(css.slider)
      )

      div(
        ComponentContainer("Vertical slider")(
          div(css.root,
            MuiSlider(classes = sliderClasses, onChange = handleChange, vertical = true)(
              value := state.value
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("VerticalSlider")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: VerticalSliderStyle = DefaultVerticalSliderStyle) = component(Props(style))
}
