package io.kinoplan.demo.components.demos.Paper

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Paper.{DefaultPaperStyle, PaperStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiPaper, MuiTypography}

object PaperSheet extends ScalaCssReactImplicits {
  case class Props(style: PaperStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Paper Sheet")(
          div(
            MuiPaper(elevation = 1)(css.root,
              MuiTypography(variant = MuiTypography.Variant.h5, component = "h3")(
                "This is a sheet of paper."
              ),
              MuiTypography(component = "p")(
                "Paper can be used to build surface or other elements for your application."
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("PaperSheet")
    .renderBackend[Backend]
    .build

  def apply(style: PaperStyle = DefaultPaperStyle) = component(Props(style))
}
