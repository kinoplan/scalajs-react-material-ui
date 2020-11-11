package io.kinoplan.demo.components.labs.Slider

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

import cats.syntax.option._
import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.labs.Slider.{DefaultSliderStyle, SliderStyle}
import io.kinoplan.demo.utils.Helpers.styleAToClassName
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}
import io.kinoplan.scalajs.react.material.ui.lab.MuiSlider

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
      ).some.orUndefined

      val iconSliderClasses = Map(
        MuiSlider.ClassKey.container -> styleAToClassName(css.slider),
        MuiSlider.ClassKey.thumbIconWrapper -> styleAToClassName(css.thumbIconWrapper)
      ).some.orUndefined

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
              thumb = MuiIcons(MuiIconsModule.Lens)()(style := js.Dictionary("color" -> "#fff"))().rawElement
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
