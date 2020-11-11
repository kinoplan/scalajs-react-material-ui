package io.kinoplan.demo.components.demos.Tooltips

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Tooltips.{DefaultSimpleTooltipsStyle, SimpleTooltipsStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiFab, MuiIconButton, MuiTooltip}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object SimpleTooltips extends ScalaCssReactImplicits {
  case class Props(style: SimpleTooltipsStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Simple Tooltips")(
          div(
            MuiTooltip(title = "Delete")(
              MuiIconButton()(
                aria.label := "Delete",
                MuiIcons(MuiIconsModule.Delete)()
              )
            ),
            MuiTooltip(title = "Add")(
              aria.label := "Add",
              MuiFab(color = MuiFab.Color.primary)(css.fab,
                MuiIcons(MuiIconsModule.Add)()
              )
            ),
            MuiTooltip(title = "Add")(
              aria.label := "Add",
              MuiFab(color = MuiFab.Color.secondary)(css.fab,
                MuiIcons(MuiIconsModule.Add)()
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SimpleTooltips")
    .renderBackend[Backend]
    .build

  def apply(style: SimpleTooltipsStyle = DefaultSimpleTooltipsStyle) = component(Props(style))
}
