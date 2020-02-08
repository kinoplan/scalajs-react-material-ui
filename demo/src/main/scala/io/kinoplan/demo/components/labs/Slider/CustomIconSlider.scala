package io.kinoplan.demo.components.labs.Slider

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.labs.Slider.{DefaultSliderStyle, SliderStyle}
import io.kinoplan.demo.utils.Helpers.styleAToClassName
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.icons.MuiLensIcon
import io.kinoplan.scalajs.react.material.ui.lab.MuiSlider
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import scalacss.ScalaCssReactImplicits

import scala.scalajs.js

object CustomIconSlider extends ScalaCssReactImplicits {
  case class Props(style: SliderStyle)

  case class State(value: Double = 50) {
    def handleChange(value: Double) = copy(value = value)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChange: (ReactEvent, Double) => Callback = (_, value) => {
      t.modState(_.handleChange(value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val imageSliderClasses = Map(
        MuiSlider.ClassKey.container -> styleAToClassName(css.slider)
      )

      val iconSliderClasses = Map(
        MuiSlider.ClassKey.container -> styleAToClassName(css.slider),
        MuiSlider.ClassKey.thumbIconWrapper -> styleAToClassName(css.thumbIconWrapper)
      )

      div(
        ComponentContainer("Custom thumb")(
          div(css.root,
            MuiTypography()(id := "slider-image", "Image thumb"),
            MuiSlider(
              classes = imageSliderClasses,
              onChange = handleChange,
              thumb = img(css.thumbIcon,
                alt := "slider thumb icon",
                src := "/static/images/misc/circle.png"
              ).rawElement
            )(
              aria.labelledBy := "slider-image",
              value := state.value
            ),
            MuiTypography()(id := "slider-icon", "Icon thumb"),
            MuiSlider(
              classes = iconSliderClasses,
              onChange = handleChange,
              thumb = MuiLensIcon()(style := js.Dictionary("color" -> "#fff"))().rawElement
            )(
              aria.labelledBy := "slider-icon",
              value := state.value
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("CustomIconSlider")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: SliderStyle = DefaultSliderStyle) = component(Props(style))
}
