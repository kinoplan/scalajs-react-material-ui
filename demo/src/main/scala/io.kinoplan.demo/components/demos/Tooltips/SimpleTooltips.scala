package io.kinoplan.demo.components.demos.Tooltips

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Tooltips.{DefaultSimpleTooltipsStyle, SimpleTooltipsStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiFab, MuiIconButton, MuiTooltip}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiAddIcon, MuiDeleteIcon}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReactImplicits

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
                MuiDeleteIcon()
              )
            ),
            MuiTooltip(title = "Add")(
              aria.label := "Add",
              MuiFab(color = MuiFab.Color.primary)(css.fab,
                MuiAddIcon()
              )
            ),
            MuiTooltip(title = "Add")(
              aria.label := "Add",
              MuiFab(color = MuiFab.Color.secondary)(css.fab,
                MuiAddIcon()
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
