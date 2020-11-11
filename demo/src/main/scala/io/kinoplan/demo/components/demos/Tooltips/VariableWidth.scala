package io.kinoplan.demo.components.demos.Tooltips

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Tooltips.{DefaultVariableWidthStyle, VariableWidthStyle}
import io.kinoplan.demo.utils.Helpers.styleAToClassName
import io.kinoplan.scalajs.react.material.ui.core.{MuiButton, MuiTooltip}

object VariableWidth extends ScalaCssReactImplicits {
  case class Props(style: VariableWidthStyle)

  val longText = "Aliquam eget finibus ante, non facilisis lectus. Sed vitae dignissim est, vel aliquam tellus. " +
    "Praesent non nunc mollis, fermentum neque at, semper arcu. " +
    "Nullam eget est sed sem iaculis gravida eget vitae justo."

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      val widthClasses = Map(
        MuiTooltip.ClassKey.tooltip -> styleAToClassName(css.customWidth)
      )
      val noWrappingClasses = Map(
        MuiTooltip.ClassKey.tooltip -> styleAToClassName(css.noMaxWidth)
      )

      div(
        ComponentContainer("Variable Width")(
          div(
            MuiTooltip(title = longText)(
              MuiButton()(css.button, "Default Width [300px]")
            ),
            MuiTooltip(title = longText, classes = widthClasses)(
              MuiButton()(css.button, "Custom Width [500px]")
            ),
            MuiTooltip(title = longText, classes = noWrappingClasses)(
              MuiButton()(css.button, "No wrapping")
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("VariableWidth")
    .renderBackend[Backend]
    .build

  def apply(style: VariableWidthStyle = DefaultVariableWidthStyle) = component(Props(style))
}
