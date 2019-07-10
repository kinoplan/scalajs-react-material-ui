package io.kinoplan.demo.components.demos.Buttons

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Buttons.{CommonButtonStyle, DefaultCommonButtonStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiFab, MuiIcon}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiAddIcon, MuiDeleteIcon, MuiNavigationIcon}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReact._

object FloatingActionButtons {
  case class Props(style: CommonButtonStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Floating Action Buttons")(
          div(
            MuiFab(color = MuiFab.Color.primary)(css.marginButton,
              aria.label := "Add",
              MuiAddIcon()
            ),
            MuiFab(color = MuiFab.Color.secondary)(css.marginButton,
              aria.label := "Edit",
              MuiIcon()("edit_icon")
            ),
            MuiFab(variant = MuiFab.Variant.extended)(css.marginButton,
              aria.label := "Delete",
              MuiNavigationIcon()(css.extendedIcon),
              "Extended"
            ),
            MuiFab()(css.marginButton,
              disabled := true,
              aria.label := "Delete",
              MuiDeleteIcon()
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("FloatingActionButtons")
    .renderBackend[Backend]
    .build

  def apply(style: CommonButtonStyle = DefaultCommonButtonStyle) = component(Props(style))
}
