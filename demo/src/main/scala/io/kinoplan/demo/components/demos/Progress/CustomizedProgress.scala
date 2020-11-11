package io.kinoplan.demo.components.demos.Progress

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Progress.{CustomizedProgressStyle, DefaultCustomizedProgressStyle}
import io.kinoplan.demo.utils.Helpers.styleAToClassName
import io.kinoplan.scalajs.react.material.ui.core.{MuiCircularProgress, MuiLinearProgress, MuiPaper}

object CustomizedProgress extends ScalaCssReactImplicits {
  case class Props(style: CustomizedProgressStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      val linearClasses = Map(
        MuiLinearProgress.ClassKey.colorPrimary -> styleAToClassName(css.linearColorPrimary),
        MuiLinearProgress.ClassKey.barColorPrimary -> styleAToClassName(css.linearBarColorPrimary)
      )

      div(
        ComponentContainer("Customized Progress")(
          MuiPaper()(css.common.flexGrowOne,
            MuiCircularProgress(size = 30, thickness = 5.0)(css.progress),
            MuiLinearProgress(classes = linearClasses),
            div(css.facebook,
              MuiCircularProgress(
                variant = MuiCircularProgress.Variant.determinate,
                value = 100,
                size = 24,
                thickness = 4.0
              )(css.facebook1),
              MuiCircularProgress(
                variant = MuiCircularProgress.Variant.indeterminate,
                disableShrink = true,
                size = 24,
                thickness = 4.0
              )(css.facebook2),
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("CustomizedProgress")
    .renderBackend[Backend]
    .build

  def apply(style: CustomizedProgressStyle = DefaultCustomizedProgressStyle) = component(Props(style))
}
